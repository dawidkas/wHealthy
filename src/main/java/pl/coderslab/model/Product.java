package pl.coderslab.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @NotEmpty
    @Size(min = 2)
    private String name;

    private double calories;
    private double carbs;
    private double sugar;
    private double totalFat;
    private double saturatedFat;
    private double transFat;
    private double protein;
    private double fiber;
//    private int barcodeNumber;
    private String brand;

//    @OneToOne
//    private ProductWithWeight productWithWeight;

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

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(double totalFat) {
        this.totalFat = totalFat;
    }

    public double getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(double saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public double getTransFat() {
        return transFat;
    }

    public void setTransFat(double transFat) {
        this.transFat = transFat;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFiber() {
        return fiber;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }

//    public int getBarcodeNumber() {
//        return barcodeNumber;
//    }
//
//    public void setBarcodeNumber(int barcodeNumber) {
//        this.barcodeNumber = barcodeNumber;
//    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

//    public ProductWithWeight getProductWithWeight() {
//        return productWithWeight;
//    }
//
//    public void setProductWithWeight(ProductWithWeight productWithWeight) {
//        this.productWithWeight = productWithWeight;
//    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", carbs=" + carbs +
                ", sugar=" + sugar +
                ", totalFat=" + totalFat +
                ", saturatedFat=" + saturatedFat +
                ", transFat=" + transFat +
                ", protein=" + protein +
                ", fiber=" + fiber +
//                ", barcodeNumber=" + barcodeNumber +
                ", brand=" + brand +
                '}';
    }
}