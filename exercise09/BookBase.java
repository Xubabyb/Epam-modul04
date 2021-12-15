package by.jonline.modul04.exercise09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BookBase {

	private ArrayList<Book> bookBase;

	public BookBase() {
		bookBase = new ArrayList<>();
	}

	public static  BufferedReader reader() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader;
	}
	public void addBook() throws IOException  {
		bookBase.add(Book.getBook(reader()));
	}

	public void printBase() {
		for (Book temp : bookBase) {
			System.out.println(temp.toString());
		}
	}

	private int enterNum(String message) {
		int num;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print(message);
			while (!scan.hasNextInt()) {

				System.out.println("not a number");

				scan.next();

				System.out.print(message);
			}
			num = scan.nextInt();

			if (num > 2 || num < 1) {

				System.out.println("no such search");

			}
		} while (num > 2 || num < 1);

		return num;
	}

	public void searchAfterYearPulication(int year) {

		for (Book temp : bookBase) {

			if (temp.getYear() > year) {

				System.out.println(temp.toString());
			}
		}
	}

	public void find(String message) {

		System.out.println("Для поиска среди авторов введите цифру 1");
		System.out.println("Для поиска среди издательств введите цифру 2");

		int num = enterNum("Выберите поиск >>");

		switch (num) {
		case 1:
			for (Book temp : bookBase) {
				int x = temp.getAuthor().toLowerCase().indexOf(message.toLowerCase());
				if (x >= 0) {
					System.out.println(temp.toString());
				}
			}
			break;
		case 2:
			for (Book temp : bookBase) {
				int x = temp.getPublishingHouse().toLowerCase().indexOf(message.toLowerCase());
				if (x >= 0) {
					System.out.println(temp.toString());
				}
			}
			break;
		default:
        // unknown type! 
        // there should probably be some error-handling here, maybe an exception
		}
	}
}
