package com.example.elastic_seach_sample1.controllers;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.elastic_seach_sample1.models.Car;
import com.example.elastic_seach_sample1.services.CarsService;

@RestController
@RequestMapping("/cars")
public class CarsController {

    private final CarsService carsService;
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @PostMapping
    public Car addCar(@RequestBody Car car){
        return carsService.addCar(car);
    }

    @GetMapping("/{id}")
    public Car getCar(@PathVariable String id){
        return carsService.getCar(id);
    }

    @GetMapping
    public Iterable<Car> getCars(){

        return carsService.getCars();
    }

    @PutMapping
    public Car updateCar(@RequestBody Car car){
        return carsService.updateCar(car);
    }

    @DeleteMapping("{id}")
    public String deleteCar(@PathVariable String id){
        carsService.deleteCar(id);
        return "deleted car with id " + id;
    }

    @DeleteMapping
    public void deleteAllCars(){
        carsService.deleteAllCars();
    }
    @GetMapping("/find")
    public Iterable<Car> findByBrand(@RequestParam String brand){
        //System.out.println("Brand: " + brand);
        return carsService.findByBrand(brand);
    }
}
