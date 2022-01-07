package by.jonline.modul04.composition.exercise04;

/**
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность
 * блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
 * Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
 * положительный и отрицательный балансы отдельно.
 */

public class TestDriveClient {

	public static void main(String[] args) {

		Bank prior = new Bank("Priorbank");
		Bank bps = new Bank("Belpromstroybank");
		Client client = new Client("Dima", "Prohorov", "3120486H056PB8");
		Client client2 = new Client("Vasy","Silvanovich","3260581H054PB4");
        
		//Создаем счета в разных банках и пополняем их
		client.openBankAccount(bps);
		client.topUpBalance(bps, 1, "985");
		client.openBankAccount(bps);
		client.topUpBalance(bps, 2, "9160");
		client.openBankAccount(prior);
		client.topUpBalance(prior, 1,"114");
		client.openBankAccount(prior);
		client.topUpBalance(prior, 2, "256");
		client.openBankAccount(bps);
		client.topUpBalance(bps, 3, "128.26");
		
		//Открываем счет в банке для второго клиента, он добавляется в список 
		//клиентов банка
		client2.openBankAccount(bps);
		
		//Сортируем счета
		client.sortAccount();
		
		//Получаем для клиента информацию о счетах
		client.getInfoAccount();
		
		//Выводим в консоль сумму всех счетов
		client.summAllAccount();
		
		//Тратим средства со счетов (банк допускает перерасход средств до баланса -200)
		//при отрицательном балансе счет блокируется и доступен только для пополнения
		client.withdraw(bps, 1, "1085");
		client.withdraw(prior, 2, "455");
		
		//Выводим в консоль сумму всех счетов
		client.summAllAccount();
		
		//Выводим в консоль сумму всех отрицательных счетов
		client.summNegativeAccount();
		
		//Выводим в консоль сумму всех положительных счетов
		client.summPositiveAccount();
		System.out.println("___________________");
		
		//Выводим в консоль список клиентов банка
		// пока для клиента открыт хотя бы один счет он остается в списке клиентов
		bps.getInfoClient();
		
		//Закрываем счет в банке
		client2.closeBankAccount(bps, 4);
		System.out.println("+++++++++++++++++");
		bps.getInfoClient();
		
		
		
		
	}

}
