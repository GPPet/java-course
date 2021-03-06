package cars_new;

import java.util.ArrayList;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Car[] cars = new Car[10];
		TreeMap<Double, Car> carsTree = new TreeMap<Double, Car>();
		
		cars[0] = new Automobile(2300.0, 23.1);
		cars[1] = new Automobile(3800.0, 12.1);
		cars[2] = new Automobile(4500.0, 19.4);
		cars[3] = new Automobile(2700.0, 18.3);
		cars[4] = new Automobile(8700.0, 23.9);
		cars[5] = new SUB(4600,true);
		cars[6] = new SUB(8900,false);
		cars[7] = new SUB(2400,true);
		cars[8] = new SUB(2000,false);
		cars[9] = new SUB(9000,true);
		
		for(Car car : cars)
			carsTree.put(car.getPrice(), car);
		
		System.out.println(carsTree.toString());
		
	}
	
}

