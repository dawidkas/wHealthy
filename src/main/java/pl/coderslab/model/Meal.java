package pl.coderslab.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @NotEmpty
    @Size(min = 2)
    private String name;

    @OneToMany
    Set<ProductWithWeight> productsWithWeight;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ProductWithWeight> getProductsWithWeight() {
        return productsWithWeight;
    }

    public void setProductsWithWeight(Set<ProductWithWeight> productsWithWeight) {
        this.productsWithWeight = productsWithWeight;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productsWithWeight=" + productsWithWeight +
                '}';
    }
}