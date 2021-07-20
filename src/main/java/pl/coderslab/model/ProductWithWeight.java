package pl.coderslab.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class ProductWithWeight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @NotEmpty
    private double weight;

    @OneToOne
    Product product;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getCarb() {
        return product.getCarbs()*weight;
    }

    public double getProtein() {
        return product.getProtein()*weight;
    }

    public double getTotalFat() {
        return product.getTotalFat()*weight;
    }
}