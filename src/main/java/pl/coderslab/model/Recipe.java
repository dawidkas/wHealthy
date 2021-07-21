//package pl.coderslab.model;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Size;
//import java.util.Set;
//
//@Entity
//public class Recipe {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @NotBlank
//    @NotEmpty
//    @Size(min = 2)
//    private String name;
//
//    @OneToMany
//    Set<Product> products;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Set<Product> getProducts() {
//        return products;
//    }
//
//    public void setProducts(Set<Product> products) {
//        this.products = products;
//    }
//
//    @Override
//    public String toString() {
//        return "Recipe{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", products=" + products +
//                '}';
//    }
//}