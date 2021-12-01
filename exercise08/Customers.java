package by.jonline.modul04.exercise08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// import.java.util.Array;
public class Customers {

	private List<Customer> customers;
	// Customer[] customers;
	// private int size;
	

	public Customers() {
		// size = 5;
		// customers = new Customer [size];
		customers = new ArrayList<>();
	}

	public void sortBySurname() {
		// Arrays.sort(customers);
		customers.sort(Customer::compareTo);
	}

	public void addCustomers() {

		customers.add(Customer.getCustomer(new Scanner(System.in)));
		/*
		 * for (int i = 0; i < size; i++) { customers[i] = Customer.getCustomer(new
		 * Scanner(System.in));
		 * 
		 * }
		 */
	}

	public void printCustomers() {
		for (Customer temp : customers) {
			System.out.println(temp.toString());
		}
	}

	public void findNumberCard(String card) {

		for (Customer temp : customers) {

			int x = temp.getNumberCard().lastIndexOf(card);

			if (x >= 0) {
				System.out.println(temp.toString());
			}

		}

	}

}
