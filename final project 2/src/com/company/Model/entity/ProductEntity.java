package com.company.Model.entity;

/**
 * Created by Sara on 1/2/2020.
 */
public class ProductEntity implements User {
    private String name;
    private long weight;
    private long value;

    public String getName() {
        return name;
    }

    public ProductEntity setName(String name) {
        this.name = name;
        return this;
    }

    public long getWeight() {
        return weight;
    }

    public ProductEntity setWeight(long weight) {
        this.weight = weight;
        return this;
    }
    public long getValue() {
        return value;
    }

    public ProductEntity setValue(long value) {
        this.value = value;
        return this;
    }
}
