package com.revature.service;

import java.util.List;

import javax.jws.WebService;

import com.revature.model.Car;
@WebService
public interface CarDealer {
	
	public List<Car> getAllCars();
	public List<Car> getCarsByMake(String make);
	public List<Car> getCarsByModel(String make);
	public void addCar(Car car);

}
