package by.jonline.modul04.exercise04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TestDriveTrain {

	public static void main(String[] args) throws ParseException {

		int n;

		Train[] trains = new Train[5];

		SimpleDateFormat format = new SimpleDateFormat("HH:mm");

		trains[0] = new Train("Moscow", 987, format.parse("18:43"));

		trains[1] = new Train("Kiev", 519, format.parse("22:55"));

		trains[2] = new Train("Minsk", 117, format.parse("04:15"));

		trains[3] = new Train("Gomel", 523, format.parse("09:52"));

		trains[4] = new Train("Gomel", 522, format.parse("06:42"));

		Train.sortNumber(trains);

		Train.printInfoAllTrain(trains);
		
		System.out.println();

		Train.sortPoint(trains);

		Train.printInfoAllTrain(trains);

		n = enterNumberTrain("Enter number train>>");

		Train.printInfoByNumber(trains, n);
	}

	public static int enterNumberTrain(String message) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print(message);

		while (!scan.hasNextInt()) {

			scan.nextLine();

			System.out.println("not a number");
			
			System.out.print(message);

		}
		return scan.nextInt();
	}
}
