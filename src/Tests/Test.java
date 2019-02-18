package Tests;

import java.util.Scanner;

import Classes.Animals;
import Classes.Cars;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals animals = new Animals();
		Cars car = new Cars();
		System.out.println("Type car name....");
		Scanner scan = new Scanner(System.in);
		car.setCarName(scan.nextLine());
		System.out.println("Type car model....");
		car.setCarModel(scan.nextLine());
		System.out.println("Type Animal breed....");
		animals.setBreed(scan.nextLine());
		System.out.println("Type Animal name....");
		animals.setName(scan.nextLine());
		
		System.out.println("-----------/////////////-----------");
		System.out.println("The " + car.getCarModel() + " "+ car.getCarName() + " which makes " + car.carSays("Vraam Vraam") + " walked over " + animals.getName() + " the " + animals.getBreed());
	}

}
