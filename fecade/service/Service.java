package fecade.service;

import fecade.domain.Client;
import fecade.domain.Product;

import java.util.List;

public interface Service {
    void saveClient(Client c);
    void saveProduct(Product c);
    List<Product> getAllProducts();
    List<Client> getAllClients();
}
