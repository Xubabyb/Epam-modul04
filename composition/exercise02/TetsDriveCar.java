package by.jonline.modul04.composition.exercise02;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы:
 * ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class TetsDriveCar {

	public static void main(String[] args) {

		Car one = new Car();
		
		one.setIsFuel(true);
		one.getWheels()[2] = null;
		one.getWheels()[1].setCondition(false);
		one.checkWheel();// проверка состояния колес в методе runCar она тоже выполняется
		one.runCar();
		one.changeWheel();
		one.runCar();
		one.stopEngine();
		System.out.println("*****************************");

		/*
		 * Запуск метода runCar для концептуального автомобиля без двигателя, колес и
		 * топлива ))
		 */
     	Car concept = new Car("Globus");
	
     	concept.runCar();
		concept.setMotor(new Engine());
		concept.runCar();
		concept.setIsFuel(true);
		concept.runCar();
		concept.changeWheel();
		concept.runCar();
	}

}
