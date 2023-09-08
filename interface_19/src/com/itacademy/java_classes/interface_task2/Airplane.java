package com.itacademy.java_classes.interface_task2;

import java.util.Objects;

public class Airplane implements AbleToFly{
	
	private String name;
	private double weightInKilo;
	private double flightRangeInKilometres;
	private double maximumSpeedInKilometresPerHour;
	private double motorPowerInKilowat;
	
	public Airplane() {}
	
	public Airplane(String name, double weightInKilo, double flightRangeInKilometres,
                    double maximumSpeedInKilometresPerHour, double motorPowerInKilowat) {
		this.name = name;
		this.weightInKilo = weightInKilo;
		this.flightRangeInKilometres = flightRangeInKilometres;
		this.maximumSpeedInKilometresPerHour = maximumSpeedInKilometresPerHour;
		this.motorPowerInKilowat = motorPowerInKilowat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weightInKilo;
	}

	public void setWeight(double weight) {
		this.weightInKilo = weight;
	}

	public double getFlightRange() {
		return flightRangeInKilometres;
	}

	public void setFlightRange(double flightRange) {
		this.flightRangeInKilometres = flightRange;
	}

	public double getMaximumSpeed() {
		return maximumSpeedInKilometresPerHour;
	}

	public void setMaximumSpeed(double maximumSpeed) {
		this.maximumSpeedInKilometresPerHour = maximumSpeed;
	}

	public double getMotorPower() {
		return motorPowerInKilowat;
	}

	public void setMotorPower(double motorPower) {
		this.motorPowerInKilowat = motorPower;
	}
	
	@Override
	public void takeOff() {
		System.out.println("Самолет готовится к взлету.");
		System.out.println("Он начинает движение по взлетно-посадочной полосе.");
		System.out.println("Набирает скорость.");
		System.out.println("Когда нужная скорость достигнута, самолет взлетает и убирает шасси.");
	}

	@Override
	public void fly() {
		System.out.println("Самолет находится в полете.");
	}
	
	@Override
	public void land() {
		System.out.println("Самолет готовится к посадке.");
		System.out.println("Для него подсвечивают взлетно-посадочную полосу.");
		System.out.println("Он начинает снижаться.");
		System.out.println("Когда самолет почти достиг земли, он выпускает шасси.");
		System.out.println("Затем совершает посадку.");
	}

	@Override
	public int hashCode() {
		return Objects.hash(flightRangeInKilometres, maximumSpeedInKilometresPerHour, motorPowerInKilowat, name,
				weightInKilo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		return Double.doubleToLongBits(flightRangeInKilometres) == Double
				.doubleToLongBits(other.flightRangeInKilometres)
				&& Double.doubleToLongBits(maximumSpeedInKilometresPerHour) == Double
						.doubleToLongBits(other.maximumSpeedInKilometresPerHour)
				&& Double.doubleToLongBits(motorPowerInKilowat) == Double.doubleToLongBits(other.motorPowerInKilowat)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(weightInKilo) == Double.doubleToLongBits(other.weightInKilo);
	}

	@Override
	public String toString() {
		return "Airplane [name=" + name + ", weightInKilo=" + weightInKilo + ", flightRangeInKilometres="
				+ flightRangeInKilometres + ", maximumSpeedInKilometresPerHour=" + maximumSpeedInKilometresPerHour
				+ ", motorPowerInKilowat=" + motorPowerInKilowat + "]";
	}
	
	


}
