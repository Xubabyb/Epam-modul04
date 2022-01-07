package by.jonline.modul04.composition.exercise04;

import java.util.ArrayList;

public class Bank {
	private int ID_ACCOUNT = 0;
	private String nameBank;
	// Здесь можно создать список клиентов банка, который будет пополнятся
	// когда клиент открывает новый счет.
	private ArrayList<Client> clients = new ArrayList<>();

	public Bank(String nameBank) {
		this.nameBank = nameBank;
	}

	public class Account {
		private int id;
		private String balance;
		private boolean isCondition = true;

		public Account() {
			id = ++ID_ACCOUNT;
			balance = "0.00";

		}

		public Account(String balance) {
			id = ++ID_ACCOUNT;
			this.balance = balance;

		}

		public static int compareByBalance(Account a1, Account a2) {
			int result = 0;
			if (Double.parseDouble(a1.balance) == Double.parseDouble(a2.balance)) {
				result = 0;
			}
			if (Double.parseDouble(a1.balance) > Double.parseDouble(a2.balance)) {
				result = 1;
			}
			if (Double.parseDouble(a1.balance) < Double.parseDouble(a2.balance)) {
				result = -1;
			}
			return result;
		}

		public String getNameBank() {
			return nameBank;
		}

		public int getId() {
			return id;
		}

		public boolean isCondition() {
			return isCondition;
		}

		public String getBalance() {
			return balance;
		}

		public void setBalance(String balance) {
			double temp1 = Double.parseDouble(this.balance);
			double temp2 = Double.parseDouble(balance);

			this.balance = String.valueOf(temp1 + temp2);
		}

		public void setCondition(boolean isCondition) {
			this.isCondition = isCondition;
		}

		@Override
		public String toString() {
			return String.format("\n%s Account id=%s,\nbalance=%s,\nisCondition=%s", nameBank, id, balance,
					isCondition ? "UNLOCKED" : "BLOCKED");
		}

	}

	public void getInfoClient() {
		for (Client temp : clients) {
			System.out.printf("Name %s,\nSurname %s,\nPersonal number %s", temp.getName(), temp.getSurname(),
					temp.getPersonalNumber());
			for (Bank.Account account : temp.getAccounts()) {
				if (account.getNameBank().equalsIgnoreCase(this.nameBank)) {
					System.out.println(account);
				}
			}

		}
	}

	public String getNameBank() {
		return nameBank;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public void setNameBank(String nameBank) {
		this.nameBank = nameBank;
	}

}
