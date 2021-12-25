package by.jonline.modul04.exercise10;

import java.io.IOException;
import java.text.ParseException;

public class TestDriveAirlines {

	public static void main(String[] args) throws IOException, ParseException {
		FligthSchedule aeroflot = new FligthSchedule();
		for (int i = 0; i < 3; i++) {
			aeroflot.addAirline();
		}
		/**Поиск по пункту назначения*/
		aeroflot.findDestination();
		
		System.out.println("----------------------");
		
		/**Поиск по дню недели после заданного времени*/
		aeroflot.findDayWeek("12:00");
		
		System.out.println("----------------------");
		
		Airline one = new Airline("Kiev","245","A390","13:55","Mon Wed Sun");
		aeroflot.getFligthschedule().add(one);
		
		/**Вывод в консоль всего расписания*/
		aeroflot.printFligthSchedule();
		
		System.out.println(aeroflot.getFligthschedule().get(2).toString());
	}

}
