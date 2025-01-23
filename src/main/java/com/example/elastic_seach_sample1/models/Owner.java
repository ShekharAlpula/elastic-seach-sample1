package com.example.elastic_seach_sample1.models;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;

@Data
public class Owner {

    @Field(type = FieldType.Text)
    private String name;

    @Field(type=FieldType.Integer)
    private int age;

    @Field(type=FieldType.Boolean)
    private boolean isActive;
}
