package by.jonline.modul04.composition.exercise05;

import java.util.Objects;


public class Tour {

	private String country;
	private int numberOfDay;
	private double price;
	private TourType tourType;
	private Transport transport;
	private Food food;

	public Tour() {
		super();
	}

	public Tour(String country, int numberOfDay, double price, TourType tourType, Transport transport, Food food) {
		super();
		this.country = country;
		this.numberOfDay = numberOfDay;
		this.price = price;
		this.tourType = tourType;
		this.transport = transport;
		this.food = food;
	}

	public static int compareByNumberOfDay(Tour t1, Tour t2) {
		int result;
		if (t1.numberOfDay > t2.numberOfDay) {
			result = 1;
		} else if (t1.numberOfDay < t2.numberOfDay) {
			result = -1;
		} else {
			if (t1.price > t2.price) {
				result = 1;
			} else if (t1.price < t2.price) {
				result = -1;
			} else {
				result = 0;
			}

		}

		return result;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNumberOfDay() {
		return numberOfDay;
	}

	public void setNumberOfDay(int numberOfDay) {
		this.numberOfDay = numberOfDay;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public TourType getTourType() {
		return tourType;
	}

	public void setTourType(TourType tourType) {
		this.tourType = tourType;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	@Override
	public int hashCode() {
		return Objects.hash(food, tourType, transport);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tour other = (Tour) obj;
		return food == other.food && tourType == other.tourType && transport == other.transport;
	}

	@Override
	public String toString() {
		return String.format("\n\tTour \n[country=%s, numberOfDay=%s, price=%s, \ntourType=%s, \ntransport=%s, \nfood=%s]", country,
				numberOfDay, price, tourType, transport, food);
	}

}
