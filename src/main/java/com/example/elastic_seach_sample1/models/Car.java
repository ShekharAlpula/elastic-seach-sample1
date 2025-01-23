package com.example.elastic_seach_sample1.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;

@Data
@Document(indexName = "CarsIndex")
public class Car {
    @Id
    private String id;

    @Field(type=FieldType.Text, name="brand")
    private String brand;

    @Field(type=FieldType.Text, name = "model")
    private String model;

    @Field(type=FieldType.Integer, name="year")
    private int YearOfManifacture;

    @Field(type=FieldType.Nested, name = "owners")
    private List<Owner> owners;
}
