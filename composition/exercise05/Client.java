package by.jonline.modul04.composition.exercise05;

import java.util.ArrayList;

public class Client {
	private String name;
	private double limit;

	private Tour tourRequirements = new Tour("unknown", 0, 0, TourType.NEVERMIND, Transport.NEVERMIND, Food.NEVERMIND);

	private ArrayList<Tour> appropriateTours = new ArrayList<>();

	public Client(String name, double limit) {
		super();
		this.name = name;
		this.limit = limit;

	}

	public void printInfoAvailableTour() {
		
		if (appropriateTours.isEmpty()) {
			System.out.println("Sory empty here");
		} else {
			System.out.println(appropriateTours);
		}
	}

	public void setTourRequirements(Tour tourRequirements) {
		this.tourRequirements = tourRequirements;
	}

	public Tour getTourRequirements() {
		return tourRequirements;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	public void addTour(Tour e) {
		appropriateTours.add(e);
	}

	public ArrayList<Tour> getAppropriateTours() {
		return appropriateTours;
	}

}
