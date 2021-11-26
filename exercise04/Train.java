
/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда,
 *  время отправления.Создайте данные в массив из пяти элементов типа Train, добавьте
 *  возможность сортировки элементов массива по номерам поездов. Добавьте возможность 
 *  вывода информации о поезде, номер которого введен пользователем. Добавьте
 *  возможность сортировки массив по пункту назначения, причем поезда с одинаковыми
 *   пунктами назначения должны быть упорядочены по времени отправления.
 */

package by.jonline.modul04.exercise04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Train {

	private SimpleDateFormat format = new SimpleDateFormat("HH:mm");

	private String point;
	private int number;
	private Date date;

	public Train(String point, int number, Date date) {

		this.point = point;
		this.number = number;
		this.date = date;
	}

	public static void printInfoByNumber(Train[] trains, int number) {

		boolean bool = true;

		for (Train train : trains) {

			if (train.number == number) {

				System.out.println(train.point + " " + train.number + " " + train.getDate());

				bool = false;
			}

		}
		if (bool) {

			System.out.println("There is no train with such a number");
		}
	}

	public static void printInfoAllTrain(Train[] trains) {

		for (Train train : trains) {

			System.out.println(train.point + " " + train.number + " " + train.getDate());
		}
	}

	public static void sortPoint(Train[] trains) {

		Train tempOb;

		for (int i = 0; i < trains.length; i++) {

			for (int j = i; j < trains.length; j++) {

				int compare = trains[i].point.compareTo(trains[j].point);

				if (compare > 1) {

					tempOb = trains[i];

					trains[i] = trains[j];

					trains[j] = tempOb;

				} else if (compare == 0) {

					if (trains[i].date.compareTo(trains[j].date) > 0) {

						tempOb = trains[i];

						trains[i] = trains[j];

						trains[j] = tempOb;
					}

				}

			}
		}

	}

	public static void sortNumber(Train[] trains) {

		for (int i = 0; i < trains.length; i++) {

			int temp = trains[i].number;

			Train tempOb = trains[i];

			for (int j = i; j < trains.length; j++) {

				if (trains[j].number > temp) {

					temp = trains[j].number;

					trains[i] = trains[j];

					trains[j] = tempOb;

					tempOb = trains[i];

				}

			}
		}

	}

	public String getPoint() {
		return point;
	}

	public SimpleDateFormat getFormat() {
		return format;
	}

	public void setFormat(SimpleDateFormat format) {
		this.format = format;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDate() {
		return format.format(date);
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
