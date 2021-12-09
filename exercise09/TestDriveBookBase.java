package by.jonline.modul04.exercise09;

import java.io.IOException;

public class TestDriveBookBase {

	public static void main(String[] args) throws IOException {

		BookBase drama = new BookBase();

		for (int i = 0; i < 5; i++) {
			drama.addBook();
		}
		System.out.print("enter author or publishing house>>");
		drama.find(BookBase.reader().readLine());
		
		System.out.println("_________________");
		System.out.print("enter year publication >>");
		drama.searchAfterYearPulication(Integer.parseInt(BookBase.reader().readLine()));

		System.out.println("_________________");

	}

}
