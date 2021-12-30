package by.jonline.modul04.composition.exercise02;

import java.util.Arrays;

public class Car {
	private String model;
	private Engine motor;
	private Wheel[] wheels = new Wheel[4];
	boolean isFuel = false;

	public Car() {
		model = "UNKNOWN";
		motor = new Engine();
		motor.setCondition(true);

		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new Wheel("Bridgstoune", 16);
		}
	}

	public Car(String model) {
		super();
		this.model = model;
	}

	@Override
	public String toString() {
		return String.format("Car model=%s,\nmotor=%s,\nwheels=%s", model, motor, Arrays.toString(wheels));
	}

	public void runCar() {
		boolean isReady = false;

		isReady = startEngine();

		if (isReady) {
			isReady = checkWheel();
		}

		if (isReady) {
			System.out.println("Все машина поехала");
		} else {
			System.out.println("Что то пошло не так!");
		}

	}

	public Wheel[] changeWheel() {

		System.out.println("Замена колес");

		for (int i = 0; i < wheels.length; i++) {
			
			if (wheels[i] == null || !wheels[i].isCondition()) {
			
				wheels[i] = new Wheel("NONAME", 16);
			}
		}
		return wheels;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public boolean checkWheel() {
		boolean flag = true;

		if (wheels != null) {

			for (int i = 0; i < wheels.length; i++) {

				if (wheels[i] == null) {
				
					System.out.println("У машины нет " + (i + 1) + "-го колеса");
					flag = false;
			
				} else if (!wheels[i].isCondition()) {
				
					System.out.println((i + 1) + "-ое колесо сильно изношено");
					flag = false;
				}
			}
			return flag;

		} else {
			
			System.out.println("У машины нет колес");
			return !flag;
		}
	}

	public boolean startEngine() {
		if (motor == null) {

			System.out.println("Запуск не возможен двигатель отсутствует");
			return false;
		}
	
		if (isFuel) {
		
			System.out.println("Топливо достаточно");
			System.out.println("Запуск двигателя: Тра та та та та");
	
		} else {
			System.out.println("Нет топлива");
		}
		return isFuel;
	}

	public void stopEngine() {
		System.out.println("та та та .... Заглушили мотор");
	}

	public void setIsFuel(boolean isFuel) {
		this.isFuel = isFuel;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getMotor() {
		return motor;
	}

	public void setMotor(Engine motor) {

		if (motor != null && !motor.isCondition() && this.motor == null) {
			this.motor = motor;
			this.motor.setCondition(true);
		}
	}

}
