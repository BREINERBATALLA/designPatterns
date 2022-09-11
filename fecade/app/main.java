package fecade.app;

import fecade.domain.Client;
import fecade.domain.Product;
import fecade.persistence.imp.ClientRepositoryImpl;
import fecade.persistence.imp.ProductRepositoryImpl;
import fecade.service.Service;
import fecade.service.ServiceImpl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Client> clientList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();
        Service service = new ServiceImpl(new ClientRepositoryImpl(clientList),
                                          new ProductRepositoryImpl(productList));

        service.saveClient(new Client("Bata",LocalDate.of(1980,8,8),(long) 2));
        service.saveProduct(new Product(10, "Tomato", 5.0, (long) 2));
        service.getAllClients().forEach(System.out::println);
        service.getAllProducts().forEach(System.out::println);


    }
}
