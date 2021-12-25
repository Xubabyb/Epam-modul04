package by.jonline.modul04.exercise10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;

public class FligthSchedule {

	private ArrayList<Airline> fligthschedule;

	public FligthSchedule() {
		fligthschedule = new ArrayList<Airline>();
	}

	private static BufferedReader reader() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader;
	}

	public void addAirline() throws IOException, ParseException {
		fligthschedule.add(Airline.getAirline(reader()));
	}

	public ArrayList<Airline> getFligthschedule() {
		return fligthschedule;
	}

	public void setFligthschedule(ArrayList<Airline> fligthschedule) {
		this.fligthschedule = fligthschedule;
	}

	public void printFligthSchedule() {
		for (Airline temp : fligthschedule) {
			System.out.println(temp.toString());
		}
	}
	public void findDayWeek(String text) throws IOException {
		System.out.println("Enter search day of week>>");
		String message = reader().readLine();
		for (Airline temp : fligthschedule) {
			int index = temp.getDayWeek().toLowerCase().indexOf(message.toLowerCase());
			if (index >= 0&&temp.getDepartureTime().compareTo(text)>0) {
				System.out.println(temp.toString());
			}
		}
	}

	public void findDayWeek() throws IOException {
		System.out.println("Enter search day of week>>");
		String message = reader().readLine();
		for (Airline temp : fligthschedule) {
			int index = temp.getDayWeek().toLowerCase().indexOf(message.toLowerCase());
			if (index >= 0) {
				System.out.println(temp.toString());
			}
		}
	}

	public void findDestination() throws IOException {

		System.out.println("Enter search destination>>");
		String message = reader().readLine();

		for (Airline temp : fligthschedule) {
			int index = temp.getDestination().toLowerCase().indexOf(message.toLowerCase());
			if (index >= 0) {
				System.out.println(temp.toString());
			}
		}
	}
}
