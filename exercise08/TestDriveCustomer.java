package by.jonline.modul04.exercise08;

public class TestDriveCustomer {

	public static void main(String[] args) {

		Customers one = new Customers();

		for (int i = 0; i < 3; i++) {

			one.addCustomers();
		}

		one.sortBySurname();

		one.printCustomers();

		one.findNumberCard("56");

	}

}
