package by.jonline.modul04.exercise08;

import java.util.Scanner;

public class Customer implements Comparable<Customer> {

	private int id;
	private static int ID;
	private String name;
	private String surname;
	private String patronymic;
	private String numberCard;
	private String numberBankAccount;

	public Customer() {

	}

	public Customer(String name, String surname, String patronymic, String numberCard, String numberBankAccount) {

		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.id = ID++;
		this.numberCard = numberCard;
		this.numberBankAccount = numberBankAccount;
	}

	@Override // имплементировать метод класса Comparable уже нет необходимости 
	public int compareTo(Customer o) {//т.к. стал использовать List а не Arrays
		
		int result = this.surname.compareTo(o.surname);
		
		if (result == 0) {
			result = this.name.compareTo(o.name);
		}
		return result;
	}

	@Override
	public String toString() {

		return "\tCustomer ID: " + id + "\nname: " + name + "\nsurname: " + surname + "\npatronymic: " + patronymic
				+ "\nnumber card: " + numberCard + "\nnumber bank account: " + numberBankAccount;
	}

	public static Customer getCustomer(Scanner scanner) {

		Customer customer = new Customer();

		customer.id = ID++;

		System.out.print("name: ");
		customer.name = scanner.nextLine();

		System.out.print("surnamme: ");
		customer.surname = scanner.nextLine();

		System.out.print("patronymic: ");
		customer.patronymic = scanner.nextLine();

		System.out.print("number card: ");
		customer.numberCard = scanner.nextLine();

		System.out.print("number Bank Account: ");
		customer.numberBankAccount = scanner.nextLine();

		return customer;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(String numberCard) {
		this.numberCard = numberCard;
	}

	public String getNumberBankAccount() {
		return numberBankAccount;
	}

	public void setNumberBankAccount(String numberBankAccount) {
		this.numberBankAccount = numberBankAccount;
	}

}
