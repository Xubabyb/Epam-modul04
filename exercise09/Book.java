package by.jonline.modul04.exercise09;

import java.io.BufferedReader;
import java.io.IOException;

public class Book {

	private static int ID;
	private int id;
	private String name;
	private String author;
	private int year;
	private String publishingHouse;
	private String pages;
	private String price;
	private String cover;

	public Book() {
		id = ID++;
	}

	public Book(String name, String author, int year, String publishingHouse, String pages, String price,
			String cover) {

		this.id = ID++;
		this.name = name;
		this.author = author;
		this.year = year;
		this.publishingHouse = publishingHouse;
		this.pages = pages;
		this.price = price;
		this.cover = cover;
	}

	public static Book getBook(BufferedReader bufferedReader) throws IOException {
		Book book = new Book();
		System.out.print("name: >>");
		book.name = bufferedReader.readLine();
		System.out.print("author: >>");
		book.author = bufferedReader.readLine();
		System.out.print("year publication: >>");
		book.year = Integer.parseInt(bufferedReader.readLine());
		System.out.print("pulishing house: >>");
		book.publishingHouse = bufferedReader.readLine();
		System.out.print("number of pages: >>");
		book.pages = bufferedReader.readLine();
		System.out.print("price: >>");
		book.price = bufferedReader.readLine();
		return book;

	}

	@Override
	public String toString() {
		return "\t Book ID: " + id + "\nname: " + name + "\nauthor: " + author
				+ "\npublishing house, year publication, number of pages : " + publishingHouse + ", " + year + ", "
				+ pages + "\nprise: " + price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

}
