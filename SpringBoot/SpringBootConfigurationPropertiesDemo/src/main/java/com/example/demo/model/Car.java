package com.example.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties //Annotation for externalized configuration.
@Component  // to make this class as Bean eligible for component scanning
public class Car {

    private String modelName;
    private String owner;
    private String manufacturer;
    private Double price;
    private Integer noOfSeats;

    // 1. I want to read these car properties from configuration file.
    // So, We want to annotate this class with @ConfigurationProperties.

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return "Car [modelName=" + modelName + ", owner=" + owner
                + ", manufacturer=" + manufacturer + ", price=" + price
                + ", noOfSeats=" + noOfSeats + "]";
    }

}
