package resources;

import java.util.HashSet;

import model.Car;

public class RunnerForHashSet {

	public static void main(String[] args) {
		
		HashSet<Car> hsc= new HashSet<>();
		
		hsc.add(new Car("skoda","voksvogan",16.5));
		hsc.add(new Car("nexon","Tata",12.00));
		hsc.add(new Car("Harrier","Tata",20.00));
		hsc.add(new Car("Creta","Huyndai",16.00));

		
	System.out.println(hsc);
	
	}

}
