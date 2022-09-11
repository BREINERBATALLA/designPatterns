package fecade.service;

import fecade.domain.Client;
import fecade.domain.Product;
import fecade.persistence.ClientRepository;
import fecade.persistence.ProductRepository;

import java.util.List;

public class ServiceImpl implements Service {
    private ClientRepository clientRepository;
    private ProductRepository productRepository;

    public ServiceImpl(ClientRepository clientRepository, ProductRepository productRepository) {
        this.clientRepository = clientRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void saveClient(Client c) {
        clientRepository.save(c);
    }

    @Override
    public void saveProduct(Product c) {
        productRepository.save(c);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAll();
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.getAll();
    }
}
