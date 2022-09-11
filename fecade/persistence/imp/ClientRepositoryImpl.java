package fecade.persistence.imp;

import fecade.domain.Client;
import fecade.persistence.ClientRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClientRepositoryImpl implements ClientRepository {

    private List<Client> clientsBBDD;

    public ClientRepositoryImpl(List<Client> clientsBBDD) {
        this.clientsBBDD = clientsBBDD;
    }

    @Override
    public void save(Client c) {
        clientsBBDD.add(c);
    }

    @Override
    public void deleteById(Long id) {
        Optional<Client> clientToDelete= clientsBBDD.stream().filter(client -> client.getId()==id).findFirst();

        if (clientToDelete.isPresent()){
            Client client = clientToDelete.get();
            clientsBBDD.remove(client);
        }
    }

    @Override
    public List<Client> getAll() {
        return clientsBBDD;
    }

    @Override
    public boolean update(Client c) {
        Optional<Client> clientToDelete= clientsBBDD.stream().filter(client -> client.getId()==c.getId()).findFirst();
        int indexClientToDelete = clientsBBDD.indexOf(clientToDelete.isPresent() ? clientToDelete.get() : -1);

        if (indexClientToDelete > 0) {
            clientsBBDD.set(indexClientToDelete, c);
            return true;
        } else{
            return false;
        }
    }
}
