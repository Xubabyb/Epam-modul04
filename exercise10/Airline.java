package by.jonline.modul04.exercise10;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
 * агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. Найти и
 * вывести: 
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели; 
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Airline {
	private static SimpleDateFormat format = new SimpleDateFormat("HH:mm");
	private static int ID;
	private int id;
	private String destination;
	private String flightNumber;
	private String typeAircraft;
	private Date departureTime;
	//private static final String[] daysWeek = new String [] {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
	private String dayWeek;
	
	public Airline() {
		id = ++ID;
	}

	public Airline(String destination, String flightNumber, String typeAircraft, String departureTime, String dayWeek) throws ParseException {
		this.id = ++ID;
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.typeAircraft = typeAircraft;
		this.departureTime = format.parse(departureTime);
		this.dayWeek = dayWeek;
	}

	
	@Override
	public String toString() {
		return "\tAirline:" + id + "\nflightNumber: " + flightNumber + "\ndestination: " + destination
				+ "\ntypeAircraft: " + typeAircraft + "\ndepartureTime: " + format.format(departureTime) + "\ndaysWeek: " + dayWeek;
	}

	public static Airline getAirline(BufferedReader reader) throws IOException, ParseException {

		Airline airline = new Airline();

		System.out.print("destination>>");
		airline.destination = reader.readLine();

		System.out.print("fligthNumber>>");
		airline.flightNumber = reader.readLine();

		System.out.print("typeAircraft>>");
		airline.typeAircraft = reader.readLine();

		System.out.print("departureTime (format HH:mm)>>");
		
		airline.departureTime = format.parse(reader.readLine());
		
		System.out.print("dayWeek>>");
		
		String check;
		StringBuilder x = new StringBuilder();
		while(!(check=reader.readLine()).equals("")) {
			x.append("[").append(check).append("]");
		}
		airline.dayWeek = x.toString();
		return airline;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getTypeAircraft() {
		return typeAircraft;
	}

	public void setTypeAircraft(String typeAircraft) {
		this.typeAircraft = typeAircraft;
	}

	public String getDepartureTime() {
		return format.format(departureTime);
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public String getDayWeek() {
		return dayWeek;
	}

	public void setDayWeek(String dayWeek) {
		this.dayWeek = dayWeek;
	}

}
