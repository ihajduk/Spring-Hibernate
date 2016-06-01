package com.ihaj.springhibernate.domain.entity;

import javax.persistence.*;

/**
 * Created by iniu on 2016-04-27.
 */
@Table(name = "PRODUCTS", schema = "MYBASE")
@Entity
public class ProductsEntity {
    private int productId;
    private String productName;
    private int productCalories;
    private int productProtein;
    private int productCarbohydrate;
    private int productFat;

    @Id
    @GeneratedValue
    @Column(name = "IDPRODUCTS")
    public int getProductId() {
        return productId;
    }

    @Column(name = "PROD_NAME")
    public String getProductName() {
        return productName;
    }

    @Column(name = "CALORIES")
    public int getProductCalories() {
        return productCalories;
    }

    @Column(name = "PROTEIN")
    public int getProductProtein() {
        return productProtein;
    }

    @Column(name = "CARBOHYDRATE")
    public int getProductCarbohydrate() {
        return productCarbohydrate;
    }

    @Column(name = "FAT")
    public int getProductFat() {
        return productFat;

    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCalories(int productCalories) {
        this.productCalories = productCalories;
    }

    public void setProductProtein(int productProtein) {
        this.productProtein = productProtein;
    }

    public void setProductCarbohydrate(int productCarbohydrate) {
        this.productCarbohydrate = productCarbohydrate;
    }

    public void setProductFat(int productFat) {
        this.productFat = productFat;
    }
}
