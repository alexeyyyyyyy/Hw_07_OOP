package cars.dao.Garage;

import cars.model.Car.ModelOfCar;

public interface Garage {
	
	boolean addCar(ModelOfCar car);
	
	ModelOfCar removeCar(String regNumber);
	
	ModelOfCar findCarsByRegNumber(String regNumber);
	
	ModelOfCar findCarsByModel(String model);
	
	ModelOfCar findCarsByCompany(String comapny);
	
	ModelOfCar findCarsByEngine(double min, double max);
	
	ModelOfCar findCarsByColor(String color);
	
	int size();
	
	
	
}
