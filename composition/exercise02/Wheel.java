package by.jonline.modul04.composition.exercise02;

import java.util.Objects;

public class Wheel {

	private String manufacturer;
	private int diameter;
	private boolean condition = true;

	public Wheel(String manufacturer, int diameter) {
		super();
		this.manufacturer = manufacturer;
		this.diameter = diameter;
	}

	@Override
	public int hashCode() {
		return Objects.hash(condition, diameter, manufacturer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		return condition == other.condition && diameter == other.diameter
				&& Objects.equals(manufacturer, other.manufacturer);
	}

	@Override
	public String toString() {
		return String.format("\n\tWheel \nmanufacturer=%s,\ndiameter=%s,\ncondition=%s", manufacturer, diameter,
				condition ? "isGood" : "isBad");
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public boolean isCondition() {
		return condition;
	}

	public void setCondition(boolean condition) {
		
		this.condition = condition;}
	

}
