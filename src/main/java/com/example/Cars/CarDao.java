package com.example.Cars;

import java.util.List;

public interface CarDao
{
List<Car> findAll();
void addCar(Car car);
}
