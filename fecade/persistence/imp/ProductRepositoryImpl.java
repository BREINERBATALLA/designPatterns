package fecade.persistence.imp;

import fecade.domain.Product;
import fecade.persistence.ProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductRepositoryImpl implements ProductRepository {
    private List<Product> productsBBDD;

    public ProductRepositoryImpl(List<Product> productsBBDD) {
        this.productsBBDD = productsBBDD;
    }

    @Override
    public void save(Product c) {
        productsBBDD.add(c);
    }

    @Override
    public void deleteById(Long id) {
        Optional<Product> productToDelete = productsBBDD.stream().filter(product -> product.getId()==id).findFirst();

        if (productToDelete.isPresent()){
            Product product = productToDelete.get();
            productsBBDD.remove(product);
        }
    }

    @Override
    public List<Product> getAll() {
        return productsBBDD;
    }

    @Override
    public boolean update(Product c) {
        Optional<Product> productToDelete = productsBBDD.stream().filter(product -> product.getId()==c.getId()).findFirst();
        int indexProductToDelete = productsBBDD.indexOf(productToDelete.isPresent() ? productToDelete.get() : -1);

        if (indexProductToDelete > 0) {
            productsBBDD.set(indexProductToDelete, c);
            return true;
        } else{
            return false;
        }
    }
}
