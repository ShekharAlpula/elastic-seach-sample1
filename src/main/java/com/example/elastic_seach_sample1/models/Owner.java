package com.example.elastic_seach_sample1.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;
@Getter
@Setter
@Data
public class Owner {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Field(type = FieldType.Text)
    private String name;

    @Field(type=FieldType.Integer)
    private int age;

    @Field(type=FieldType.Boolean)
    private boolean isActive;
}
