package com.example.elastic_seach_sample1.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.elastic_seach_sample1.models.Car;

public interface CarRepository extends ElasticsearchRepository<Car, String>{

    Iterable<Car> findAllByBrandContaining(String brand);

}
