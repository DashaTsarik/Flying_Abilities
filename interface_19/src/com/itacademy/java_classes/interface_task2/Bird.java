package com.itacademy.java_classes.interface_task2;

import java.util.Objects;

public class Bird implements AbleToFly{
	
	private String kindOfBird;
	private String color;
	private double lengthOfBeakInCentimetres;
	private double sizeInCentimetres;
	
	public Bird() {}
	
	public Bird(String kindOfBird, String color, double lengthOfBeakInCentimetres, double sizeInCentimetres) {
		this.kindOfBird = kindOfBird;
		this.color = color;
		this.lengthOfBeakInCentimetres = lengthOfBeakInCentimetres;
		this.sizeInCentimetres = sizeInCentimetres;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLengthOfBeak() {
		return lengthOfBeakInCentimetres;
	}

	public void setLengthOfBeak(double lengthOfBeak) {
		this.lengthOfBeakInCentimetres = lengthOfBeak;
	}

	public double getSizeInCentimetres() {
		return sizeInCentimetres;
	}

	public void setSizeInCentimetres(double sizeInCentimetres) {
		this.sizeInCentimetres = sizeInCentimetres;
	}

	public String getKindOfBird() {
		return kindOfBird;
	}

	public void setKindOfBird(String kindOfBird) {
		this.kindOfBird = kindOfBird;
	}
	
	@Override
	public void takeOff() {
		System.out.println("Птица расправляет крылья и взлетает.");
	}

	@Override
	public void fly() {
		System.out.println("Птица летит.");
		
	}
	
	@Override
	public void land() {
		System.out.println("Птица заканчивает полет и садится.");
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, kindOfBird, lengthOfBeakInCentimetres, sizeInCentimetres);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return Objects.equals(color, other.color) && Objects.equals(kindOfBird, other.kindOfBird)
				&& Double.doubleToLongBits(lengthOfBeakInCentimetres) == Double.doubleToLongBits(other.lengthOfBeakInCentimetres)
				&& Double.doubleToLongBits(sizeInCentimetres) == Double.doubleToLongBits(other.sizeInCentimetres);
	}

	@Override
	public String toString() {
		return "Bird [color=" + color + ", lengthOfBeak=" + lengthOfBeakInCentimetres + ", sizeInCentimetres=" + sizeInCentimetres
				+ ", kindOfBird=" + kindOfBird + "]";
	}

	
	

}
