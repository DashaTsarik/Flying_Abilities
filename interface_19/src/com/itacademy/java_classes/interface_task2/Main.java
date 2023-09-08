package com.itacademy.java_classes.interface_task2;

public class Main {

	public static void main(String[] args) {
		
		AbleToFly bird = new Bird("Crow","Black", 4.2, 65);
		bird.takeOff();
		bird.fly();
		bird.land();
		System.out.println();
		
		AbleToFly airplane = new Airplane("Airbus A310",80000, 7600, 360, 82);
		airplane.takeOff();
		airplane.fly();
		airplane.land();
		System.out.println();
		
		AbleToFly drone = new Drone("DJI Mavic Air 2", 10, 150, 19);
		drone.takeOff();
		drone.fly();
		drone.land();
		
	}

}
