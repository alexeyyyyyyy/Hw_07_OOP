package cars.dao.Garage;

import cars.model.Car.ModelOfCar;

public class GarageImpl implements Garage {
	ModelOfCar[] cars;
	int size;
	
	public GarageImpl(int capacity) {
		cars = new ModelOfCar[capacity];
	}
	
	@Override
	public boolean addCar(ModelOfCar car) {
	    if(car == null || size == cars.length|| findCarsByRegNumber(car.getRegNumber()) != null) {
	    	return false;
	    }
	    cars[size] = car;
	    size++;
	    return true;
	}


	@Override
	public ModelOfCar removeCar(String regNumber) {
		for (int i = 0; i < size; i++) {
			if(cars[i].getRegNumber() == regNumber) {
				ModelOfCar RmvCar = cars[i];
				cars[i] = cars[size - 1];
				cars[size - 1] = null;
				size--;
				return RmvCar;
			}
		}
		return null;
	}

	@Override
	public ModelOfCar findCarsByRegNumber(String regNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelOfCar findCarsByModel(String model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelOfCar findCarsByCompany(String comapny) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelOfCar findCarsByEngine(double min, double max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelOfCar findCarsByColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return size;
	}


}
