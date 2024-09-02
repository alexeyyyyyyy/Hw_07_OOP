package cars.test.GarageTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cars.dao.Garage.Garage;
import cars.dao.Garage.GarageImpl;
import cars.model.Car.ModelOfCar;

class GarageTest {
	Garage garage;
	ModelOfCar[] machine;	
	
	@BeforeEach
	void setUp() {
	    garage = new GarageImpl(15); 
	    machine = new ModelOfCar[10]; 

	   
	    machine[0] = new ModelOfCar("123ABC", "Avalon", "Toyoya", 200, "White");
	    machine[1] = new ModelOfCar("456Gba", "Belta", "Toyoya", 87, "Red");
	    machine[2] = new ModelOfCar("789Def", "Camry", "Toyoya", 150, "Black");
	    machine[3] = new ModelOfCar("777Avax", "i10", "Hyundai", 67, "Black");
	    machine[4] = new ModelOfCar("666Hell", "i20", "Hyundai", 78, "Grey");
	    machine[5] = new ModelOfCar("001GTR", "i30", "Hyundai", 122, "Blue");
	    machine[6] = new ModelOfCar("Ref555", "X6", "BMW", 249, "Purple");
	    machine[7] = new ModelOfCar("874fgr", "Z4", "BMW", 197, "Pink");
	    machine[8] = new ModelOfCar("029Mar", "iX3", "BMW", 286, "Gray");
	    machine[9] = new ModelOfCar("012429Sid", "CLE 53 4Matic+", "Mercedes", 449, "White");

	    for (ModelOfCar car : machine) {
	        garage.addCar(car);
	    }
	}

	
	    
		@Test
		void testAddCar() {
		    assertFalse(garage.addCar(machine[9]));
		    ModelOfCar car = new ModelOfCar("182arb", "Tundra", "Tavria", 250, "red");
		    assertTrue(garage.addCar(car));
		    assertEquals(11, garage.size());
		  
		}

	


	@Test
	void testRemoveCar() {
		ModelOfCar machineRemoved = garage.removeCar("777Avax");
		assertEquals(9, garage.size());
		assertEquals(machine[3], machineRemoved);
		
		assertNull(garage.removeCar("777Avax"));
	}

	@Test
	void testFindCarsByRegNumber() {
		assertEquals(machine[3], garage.findCarsByRegNumber("777Avax"));
		
		assertNull(garage.findCarsByRegNumber("Arb835"));
	}

	@Test
	void testFindCarsByModel() {
		    ModelOfCar car = garage.findCarsByModel("i20");
		    assertEquals(machine[4], car);
		    
		    car = garage.findCarsByModel("i40"); 
		    assertNull(car);
	}

	@Test
	void testFindCarsByCompany() {
		 ModelOfCar car = garage.findCarsByCompany("BMW");
		
		    assertEquals(machine[6], car);
		   
		    car = garage.findCarsByCompany("Audi");
		    assertNull(car);
	}

	@Test
	void testFindCarsByEngine() {
		ModelOfCar car = garage.findCarsByEngine(200, 449);
	    assertEquals(machine[0], car);
	    assertEquals(machine[9], car);
	    
	    car = garage.findCarsByEngine(1000, 2000); 
	    assertNull(car);
	}

	@Test
	void testFindCarsByColor() {
		  ModelOfCar car = garage.findCarsByColor("White");
		    assertEquals(machine[0], car);
		    
		    car = garage.findCarsByColor("Orange");
		    assertNull(car);
	}

	@Test
	void testSize() {
		 assertEquals(10, garage.size());
		    
		    garage.addCar(new ModelOfCar("Arb839", "lada10", "Jigul", 5, "blue"));
		    assertEquals(11, garage.size());
		    
		    garage.removeCar("Arb839");
		    assertEquals(10, garage.size());
	}

}
