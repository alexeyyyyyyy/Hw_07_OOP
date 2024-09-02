package cars.model.Car;

import java.util.Objects;

public  class ModelOfCar {
	protected String regNumber;
	protected final String model;
	protected final String company;
	protected final double engine;
	protected String color;
	
	public ModelOfCar(String regNumber, String model, String company, double engine, String color) {
		super();
		this.regNumber = regNumber;
		this.model = model;
		this.company = company;
		this.engine = engine;
		this.color = color;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public String getCompany() {
		return company;
	}

	public double getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "ModelOfCar [regNumber=" + regNumber + ", model=" + model + ", company=" + company + ", engine=" + engine
				+ ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(regNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelOfCar other = (ModelOfCar) obj;
		return Objects.equals(regNumber, other.regNumber);
	}
	
}
