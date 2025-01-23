package com.example.elastic_seach_sample1.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;

@Getter
@Setter
@Data
@Document(indexName = "carsindex")
public class Car {
    @Id
    private String id;

    @Field(type=FieldType.Text, name="brand")
    private String brand;

    @Field(type=FieldType.Text, name = "model")
    private String model;

    @Field(type=FieldType.Text, name="year")
    private String year;

    @Field(type=FieldType.Nested, name = "owners")
    private Iterable<Owner> owners;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Iterable<Owner> getOwners() {
        return owners;
    }

    public void setOwners(Iterable<Owner> owners) {
        this.owners = owners;
    }

}
