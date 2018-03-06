package com.revature.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.jws.WebService;

import com.revature.model.Car;
@WebService(endpointInterface="com.revature.service.CarDealer")
public class CarDealerImpl implements CarDealer {
	private List<Car> carList = Arrays.asList(new Car("2000", "Honda", "Red"));
	@Override
	public List<Car> getAllCars() {
		
		return carList;
	}

	@Override
	public List<Car> getCarsByMake(String make) {
		List<Car> foundCars = new ArrayList<Car>();
		for(Car car :carList) {
			if(car.getMake().equals(make)) {
				foundCars.add(car);
			}
		}
		
		
		return foundCars;
	}

	@Override
	public List<Car> getCarsByModel(String model) {
		List<Car> foundCars = new ArrayList<Car>();
		for(Car car :carList) {
			if(car.getModel().equals(model)) {
				foundCars.add(car);
			}
		}
		
		
		return foundCars;
	}
	
	public void addCar(Car car) {
		carList.add(car);
	}

}
