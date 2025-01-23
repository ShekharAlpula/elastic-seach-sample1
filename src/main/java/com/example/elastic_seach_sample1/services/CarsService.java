package com.example.elastic_seach_sample1.services;

import com.example.elastic_seach_sample1.models.Car;
import com.example.elastic_seach_sample1.repositories.CarRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarsService {

    private CarRepository carRepository;

    public CarsService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public Car addCar(Car car) {
        car =  carRepository.save(car);
        System.out.println(car.getId());
        return car;
    }

    public Car getCar(String id) {
        return carRepository.findById(id).orElse(null);
    }

    public Iterable<Car> getCars() {
        return carRepository.findAll();
    }

    public Car updateCar(Car car) {
        return carRepository.save(car);
    }

    public void deleteCar(String id) {
       carRepository.deleteById(id);
    }

    public Iterable<Car> findByBrand(String brand) {
        return carRepository.findAllByBrandContaining(brand);
    }

    public void deleteAllCars() {
        carRepository.deleteAll();
    }
}
