package fecade.domain;

import java.math.BigDecimal;

public class Product {

    private Integer stock;
    private String description;
    private Double priceUnd;
    private Long id;


    public Product(Integer stock, String description, double priceUnd, Long id) {
        this.stock = stock;
        this.description = description;
        this.priceUnd = priceUnd;
        this.id = id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPriceUnd() {
        return priceUnd;
    }

    public void setPriceUnd(Double priceUnd) {
        this.priceUnd = priceUnd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "stock=" + stock +
                ", description='" + description + '\'' +
                ", priceUnd=" + priceUnd +
                ", id=" + id +
                '}';
    }
}
