package by.jonline.modul04.composition.exercise02;

import java.util.Objects;

public class Engine {

	private static int ID;
	private String serialNumber;
	private String manufacturer;
	private String typeFuel;
	private String volume;
	private boolean condition = false;

	public Engine() {
		this.serialNumber = "UNKNOWN" + "0" + (++ID);
		this.manufacturer = "NONAME";
		this.typeFuel = "UNKNOWN";
		this.volume = "UNKNOWN";
	}

	public Engine(String serialNumber, String manufacturer, String typeFuel, String volume) {
		super();
		this.serialNumber = serialNumber + "0" + (++ID);
		this.manufacturer = manufacturer;
		this.typeFuel = typeFuel;
		this.volume = volume;
	}

	@Override
	public int hashCode() {
		return Objects.hash(serialNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		return condition == other.condition && Objects.equals(serialNumber, other.serialNumber);
	}

	@Override
	public String toString() {
		return String.format(
				"\tEngine \nserialNumber - %s\nmanufacturer - %s\ntypeFuel - %s\nvolume - %s\nlocation - %s",
				serialNumber, manufacturer, typeFuel, volume, condition ? "Установлен на машину" : "На складе");
	}
/**Этот метод выполняет ту же работу что и сеттер в классе Car
 * для переменной экземпляра класса Engine. Вопрос, а зачем он тут?*/
	public void installInCar(Car car) {
		if (car != null) {

			if (!this.condition) {

				if (car.getMotor() == null) {

					car.setMotor(this);
					this.condition = true;

				} else {
					System.out.println("У этой машины уже есть мотор");
				}

			} else {
				System.out.println("Этот мотор уже испольуется");
			}
		} else {
			System.out.println("Такой машины не существует");
		}
	}

	public boolean isCondition() {
		return condition;
	}
	public void setCondition(boolean condition) {
		this.condition=condition;
	}
	public String getCondition() {
		return condition ? "Установлен на машину" : "На складе";
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber + "0" + (++ID);
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getTypeFuel() {
		return typeFuel;
	}

	public void setTypeFuel(String typeFuel) {
		this.typeFuel = typeFuel;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

}
