package com.ejemplo.crud.entities;

import com.ejemplo.crud.validation.IsExistsDb;
import com.ejemplo.crud.validation.IsRequired;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @IsRequired(message = "{IsRequired.product.name}")
    @NotEmpty(message = "{NotEmpty.product.name}")
    @Size(min = 3, max = 45, message = "{Size.product.name}")
    private String name;

    @NotNull(message = "{NotNull.product.price}")
    @Min(value = 500, message = "{Min.product.price}")
    private Integer price;

    @IsRequired
    private String description;

    @IsRequired(message = "{IsRequired.product.sku}")
    @IsExistsDb(message = "{IsExistsDb.product.sku}")
    private String sku;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
