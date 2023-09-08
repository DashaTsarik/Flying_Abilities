package com.itacademy.java_classes.interface_task2;

import java.util.Objects;

public class Drone implements AbleToFly {
	
	private String name;
	private double flightRangeInKilometres;
	private double maximumHeightAbleToFlyInMetres;
	private double maximumSpeedInKilometresPerHour;
	
	public Drone(){}
	
	public Drone(String name, double flightRangeInKilometres, double maximumHeightAbleToFlyInMetres,
			     double maximumSpeedInKilometresPerHour) {
		this.name = name;
	    this.flightRangeInKilometres = flightRangeInKilometres;
		this.maximumHeightAbleToFlyInMetres = maximumHeightAbleToFlyInMetres;
		this.maximumSpeedInKilometresPerHour = maximumSpeedInKilometresPerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFlightRange() {
		return flightRangeInKilometres;
	}

	public void setFlightRange(double flightRange) {
		this.flightRangeInKilometres = flightRange;
	}

	public double getMaximumHeightAbleToFly() {
		return maximumHeightAbleToFlyInMetres;
	}

	public void setMaximumHeightAbleToFly(double maximumHeightAbleToFly) {
		this.maximumHeightAbleToFlyInMetres = maximumHeightAbleToFly;
	}

	public double getMaximumSpeed() {
		return maximumSpeedInKilometresPerHour;
	}

	public void setMaximumSpeed(double maximumSpeed) {
		this.maximumSpeedInKilometresPerHour = maximumSpeed;
	}
	
	@Override
	public void takeOff() {
		System.out.println("Выбираем свободный и открытый участок для взлета дрона.");
		System.out.println("Дрон готов к взлету.");
		System.out.println("Поднимаем рычаг управления.");
		System.out.println("Дрон взлетает.");	
	}

	@Override
	public void fly() {
		System.out.println("Дрон набирает высоту и летит.");
		
	}
	
	@Override
	public void land() {
		System.out.println("Объявляем всем, что дрон возвращается.");
		System.out.println("Ведем его к посадочной площадке, одновременно снижая скорость.");
		System.out.println("Медленно и плавно дрон садится.");
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(flightRangeInKilometres, maximumHeightAbleToFlyInMetres, maximumSpeedInKilometresPerHour,
				name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drone other = (Drone) obj;
		return Double.doubleToLongBits(flightRangeInKilometres) == Double
				.doubleToLongBits(other.flightRangeInKilometres)
				&& Double.doubleToLongBits(maximumHeightAbleToFlyInMetres) == Double
						.doubleToLongBits(other.maximumHeightAbleToFlyInMetres)
				&& Double.doubleToLongBits(maximumSpeedInKilometresPerHour) == Double
						.doubleToLongBits(other.maximumSpeedInKilometresPerHour)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Drone [name=" + name + ", flightRangeInKilometres=" + flightRangeInKilometres
				+ ", maximumHeightAbleToFlyInMetres=" + maximumHeightAbleToFlyInMetres
				+ ", maximumSpeedInKilometresPerHour=" + maximumSpeedInKilometresPerHour + "]";
	}
	
	


}
