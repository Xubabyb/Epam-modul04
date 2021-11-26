package by.jonline.modul04.exercise05;

public class TestDriveCount {

	public static void main(String[] args) {

		Count count_1 = new Count();
		Count count_2 = new Count(4, 2, 8);
		Count count_3 = new Count(11, 10, 2);

		System.out.println("Параметры первого счетчика:");
		System.out.print("Текущее значение = " + count_1.getCurrentValue() + " ");
		System.out.print("Начальное значение = " + count_1.getMinValue() + " ");
		System.out.println("Конечное значение = " + count_1.getMaxValue() + "\n");

		System.out.println("Параметры второго счетчика:");
		System.out.print("Текущее значение = " + count_2.getCurrentValue() + " ");
		System.out.print("Начальное значение = " + count_2.getMinValue() + " ");
		System.out.println("Конечное значение = " + count_2.getMaxValue() + "\n");

		System.out.println("Параметры третьего счетчика:");
		System.out.print("Текущее значение = " + count_3.getCurrentValue() + " ");
		System.out.print("Начальное значение = " + count_3.getMinValue() + " ");
		System.out.println("Конечное значение = " + count_3.getMaxValue() + "\n");

		count_2.setCurrentValue(10);

		count_2.setMinValue(10);

		count_2.setMaxValue(1);

		System.out.println("");

		for (int i = 0; i < 12; i++) {

			System.out.println("Текущее значение счетчика: " + count_1.getCurrentValue());

			count_1.currentValueUp();
		}

		System.out.println("");

		count_1.setCurrentValue(5);

		for (int i = 0; i < 7; i++) {

			System.out.println("Текущее значение счетчика: " + count_1.getCurrentValue());

			count_1.currentValueDown();
		}

	}

}
