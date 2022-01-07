package by.jonline.modul04.composition.exercise04;

import java.util.ArrayList;

public class Client {

	private String name;
	private String surname;
	private String personalNumber;
	private ArrayList<Bank.Account> accounts = new ArrayList<>();

	public Client(String name, String surname, String personalNumber) {
		this.name = name;
		this.surname = surname;
		this.personalNumber = personalNumber;
	}

	public void summNegativeAccount() {
		double summ = 0;
		for (Bank.Account temp : accounts) {
			double num = Double.parseDouble(temp.getBalance());
			if (num < 0) {
				summ += num;
			}
		}
		System.out.println("negative balance of accounts = " + summ);
	}

	public void summPositiveAccount() {
		double summ = 0;
		for (Bank.Account temp : accounts) {
			double num = Double.parseDouble(temp.getBalance());
			if (num > 0) {
				summ += num;
			}
		}
		System.out.println("positive balance of accounts = " + summ);
	}

	public void summAllAccount() {
		double summ = 0;
		for (Bank.Account temp : accounts) {
			summ += Double.parseDouble(temp.getBalance());
		}
		System.out.println("balance of accounts = " + summ);
	}

	public void sortAccount() {
		accounts.sort(Bank.Account::compareByBalance);
	}

	public void withdraw(Bank bank, int id, String summ) {
		if (bank != null && summ != null) {
			boolean isBank = false;
			boolean isId = false;
			for (Bank.Account temp : accounts) {
				if (temp.getNameBank().equalsIgnoreCase(bank.getNameBank())) {
					isBank = true;
					if (temp.getId() == id) {
						isId = true;
						if (temp.isCondition()
								&& (Double.parseDouble(temp.getBalance()) + 200 > Double.parseDouble(summ))) {
							temp.setBalance("-" + summ);
							System.out.println(bank.getNameBank() + " Account number " + id + " withdraw " + summ
									+ ", current balanse " + temp.getBalance());
							checkCondition(temp);
						} else {
							System.out.println("Account " + (temp.isCondition() ? "UNLOCKED" : "BLOCKED") + ",\n"
									+ (Double.parseDouble(temp.getBalance()) + 200 > Double.parseDouble(summ)
											? "Enough funds in the account "
											: "Insufficient funds in the account"));
						}
					}
				}
			}
			if (!isBank) {
				System.out.println("You don't have accounts with " + bank.getNameBank());
			} else if (!isId) {
				System.out.println("You don't have an account with number " + id + " in " + bank.getNameBank());

			}
		} else {
			System.out.println("incorrect request ");
		}

	}

	private void checkCondition(Bank.Account account) {
		account.setCondition(Double.parseDouble(account.getBalance()) > 0 ? true : false);
	}

	public void topUpBalance(Bank bank, int id, String balance) {

		int countNameBank = 0;
		int countId = 0;

		for (Bank.Account temp : accounts) {
			if (temp.getNameBank().equalsIgnoreCase(bank.getNameBank())) {
				countNameBank++;
				if (temp.getId() == id) {
					countId++;
					temp.setBalance(balance);
					checkCondition(temp);
				}
			}
		}
		if (countNameBank == 0) {
			System.out.println("You don't have accounts with " + bank.getNameBank());
		} else if (countId == 0) {
			System.out.println("You don't have an account with number " + id + " in " + bank.getNameBank());

		}

	}

	public void getInfoAccount() {
		for (Bank.Account temp : accounts) {
			System.out.println(temp);
		}
	}

	public void closeBankAccount(Bank bank, int id) {
		if (bank != null) {
			boolean isBank = false;
			ArrayList<Bank.Account> copy = new ArrayList<>(accounts);
			for (Bank.Account temp : copy) {
				if (temp.getNameBank().equalsIgnoreCase(bank.getNameBank()) && id == temp.getId()) {
					isBank = true;

					if (temp.isCondition() && Double.parseDouble(temp.getBalance()) == 0) {
						accounts.remove(temp);
						System.out.println("Account closed");
					} else {
						System.out.println("The account is blocked or has a non-zero balance ");
					}
				}
			}
			if (!isBank) {
				System.out.println("Account not found");
			}
			checkBankAccount(bank);
		} else {
			System.out.println("incorrect request ");
		}

	}

	private void checkBankAccount(Bank bank) {
		if (bank != null) {
			int countBank = 0;
			for (Bank.Account temp : accounts) {
				if (temp.getNameBank().equalsIgnoreCase(bank.getNameBank())) {
					countBank++;
				}
			}
			if (countBank == 0) {
				bank.getClients().remove(this);
			}
		}
	}

	public void openBankAccount(Bank bank) {
		Bank.Account account = bank.new Account();
		addBankAccount(account);
		if(!bank.getClients().contains(this)) {
			bank.getClients().add(this);
		}
		
	}

	private void addBankAccount(Bank.Account account) {
		accounts.add(account);
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

	public String getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}

	public ArrayList<Bank.Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Bank.Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return String.format("Client [\nname=%s, \nsurname=%s, \npersonalNumber=%s, \naccounts=%s]", name, surname,
				personalNumber, accounts);
	}

}
