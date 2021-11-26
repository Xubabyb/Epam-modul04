package by.jonline.modul04.exercise06;

import java.text.ParseException;

public class TestDriveClock {

	public static void main(String[] args) throws ParseException {

		Clock time = new Clock();

		System.out.println(time.getDate());// время в конструкторе по умолчанию

		time.setHours(-56);// задание часов

		time.setMinutes(568);// заданиие минут

		time.setSeconds(157);// задание секунд

		System.out.println(time.getDate());

		time.setDate("45:68:90");

		System.out.println(time.getDate());
		
		time.ChangeTime(13, 15, 45);

		System.out.println(time.getHours() + " " + time.getMinutes() + " " + time.getSeconds());

		System.out.printf("%d:%d:%d\n",time.getHours(),time.getMinutes(),time.getSeconds());
		
		System.out.println(time.getDate());

	}

}
