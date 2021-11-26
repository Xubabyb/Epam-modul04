
/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или
 * уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите
 * инициализацию счетчика значениями по умолчанию и произвольными значениями. 
 * Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
 * получить его текущее состояние. Написать код, демонстрирующий все возможности
 * класса.
 */

package by.jonline.modul04.exercise05;

public class Count {

	private int currentValue;
	private int minValue;
	private int maxValue;

	public Count() {

		minValue = 0;

		currentValue = 10;

		maxValue = 20;
	}

	public Count(int currentValue, int minValue, int maxValue) {

		if (minValue < maxValue) {

			this.minValue = minValue;

			this.maxValue = maxValue;

		} else {

			this.minValue = maxValue;

			this.maxValue = minValue;
		}

		if (currentValue <= this.maxValue && currentValue >= this.minValue) {

			this.currentValue = currentValue;

		} else if (currentValue > this.maxValue) {

			this.currentValue = this.maxValue;

		} else {

			this.currentValue = this.minValue;
		}
	}

	public void currentValueDown() {

		if (currentValue > minValue) {

			currentValue--;

		} else {

			System.out.println("Текущее значение счетчика достигло нижнего предела и равно " + minValue);

			currentValue = minValue;
		}
	}

	public void currentValueUp() {

		if (currentValue < maxValue) {

			currentValue++;

		} else {

			System.out.println("Превышение максимального предела, текущее значение счетчика = " + maxValue);

			currentValue = maxValue;
		}
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {

		if (currentValue <= maxValue && currentValue >= minValue) {

			this.currentValue = currentValue;

		} else if (currentValue > maxValue) {

			System.out.println("Текущее значение счетчика превышает верхний предел и получает значение " + maxValue);

			this.currentValue = maxValue;

		} else {
			System.out
					.println("Текущее значение счетчика задается ниже нижнего предела,  получает значение " + minValue);

			this.currentValue = minValue;
		}

	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {

		if (minValue < maxValue) {

			this.minValue = minValue;

		} else {

			System.out.println(
					"Не корректный ввод нижний предел не может быть больше верхнего предела - " + this.maxValue);
		}
	} 

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {

		if (maxValue > minValue) {

			this.maxValue = maxValue;

		} else {

			System.out.println(
					"Не корректный ввод верхний предел не может быть меньше нижнего предела - " + this.minValue);
		}
	}

}
