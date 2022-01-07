package by.jonline.modul04.composition.exercise05;

import java.util.ArrayList;
import java.util.Scanner;

public class TravelAgency {

	private String name;
	private ArrayList<Tour> tours;

	public TravelAgency(String name) {
		super();
		this.name = name;
		tours = new ArrayList<Tour>();
	}

	/** Диалог с клиентом для заполнения полей требований */
	public void setRequirements(Client client) {

		client.getTourRequirements().setPrice(client.getLimit());

		setFoodRequirements(client.getTourRequirements());
		setTransportRequirements(client.getTourRequirements());
		setTourTypeRequirements(client.getTourRequirements());
	}

	/** private методы установления требований клиента */
	private void setTourTypeRequirements(Tour tour) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println(
				"\tPlease select the type of tour and enter number: \n1 - if you choose Rest,\n2 - if you choose Treament,\n3 - if you choose Shopping, \n4 - if you choose Excursion ");
		System.out.print("Please enter you number>>");

		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("Not a number");
			System.out.print("Please enter you number>>");
		}

		int num = scan.nextInt();
		switch (num) {
		case (1): {
			tour.setTourType(TourType.REST);
			System.out.println("You choosed: " + TourType.REST);
			break;
		}
		case (2): {
			tour.setTourType(TourType.TREATMENT);
			System.out.println("You choosed: " + TourType.TREATMENT);
			break;
		}
		case (3): {
			tour.setTourType(TourType.SHOPPING);
			System.out.println("You choosed: " + TourType.SHOPPING);
			break;
		}
		case (4): {
			tour.setTourType(TourType.EXCURSION);
			System.out.println("You choosed: " + TourType.EXCURSION);
			break;
		}
		default:
			tour.setTransport(Transport.NEVERMIND);
			break;
		}

	}

	private void setTransportRequirements(Tour tour) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println(
				"\tPlease select the type of transport and enter number: \n1 - if you choose Plane,\n2 - if you choose Train,\n3 - if you choose Bus, \n4 - if you choose Ship ");
		System.out.print("Please enter you number>>");

		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("Not a number");
			System.out.print("Please enter you number>>");
		}

		int num = scan.nextInt();
		switch (num) {
		case (1): {
			tour.setTransport(Transport.PLANE);
			System.out.println("You choosed: " + Transport.PLANE);
			break;
		}
		case (2): {
			tour.setTransport(Transport.TRAIN);
			System.out.println("You choosed: " + Transport.TRAIN);
			break;
		}
		case (3): {
			tour.setTransport(Transport.BUS);
			System.out.println("You choosed: " + Transport.BUS);
			break;
		}
		case (4): {
			tour.setTransport(Transport.SHIP);
			System.out.println("You choosed: " + Transport.SHIP);
			break;
		}
		default:
			tour.setTransport(Transport.NEVERMIND);
			break;
		}

	}

	private void setFoodRequirements(Tour tour) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println(
				"\tPlease select the type of food and enter number: \n1 - if you want all inclusive,\n2 - if you want not inkluded,\n3 - if you want breakfast ");
		System.out.print("Please enter you number>>");

		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("Not a number");
			System.out.print("Please enter you number>>");
		}

		int num = scan.nextInt();

		switch (num) {
		case (1): {
			tour.setFood(Food.ALL_INCLUSIVE);
			System.out.println("You choosed ALL_INCLUSIVE");
			break;
		}
		case (2): {
			tour.setFood(Food.NOT_INCLUDED);
			System.out.println("You choosed NOT_INCLUDED");
			break;
		}
		case (3): {
			tour.setFood(Food.BREAKFAST);
			System.out.println("You choosed BREAKFAST");
			break;
		}
		default:
			tour.setFood(Food.NEVERMIND);
			break;
		}
	}

	/** Будет заполнять список клиента подходящими турами */
	public void findAppropriateTour(Client client) {

		var obj = client.getTourRequirements();

		for (Tour temp : tours) {

			if (temp.equals(client.getTourRequirements()) && temp.getPrice() <= client.getLimit()) {
				client.addTour(temp);
			}
			if (temp.getTourType().equals(obj.getTourType()) && obj.getTransport().equals(Transport.NEVERMIND)
					&& obj.getFood().equals(Food.NEVERMIND) && temp.getPrice() <= client.getLimit()) {
				client.addTour(temp);
			}
		}

		sortTour(client.getAppropriateTours());
	}

	// **Sort tour by number of days and price*/
	public void sortTour(ArrayList<Tour> tours) {
		tours.sort(Tour::compareByNumberOfDay);

	}

	public void addTour(Tour e) {
		tours.add(e);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
