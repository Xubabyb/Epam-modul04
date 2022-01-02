package by.jonline.modul04.composition.exercise03;

public class TestDriveState {
	public static void main(String[] args) {

		State belarus = new State("Minsk", "207600");

		State.Region gomelskay = belarus.new Region("Gomel");
		State.Region grodnenskay = belarus.new Region("Grodno");
		State.Region brestskay = belarus.new Region("Brest");
		State.Region mogilevskay = belarus.new Region("Mogilev");
		State.Region minskay = belarus.new Region("Minsk");
		State.Region vitebskay = belarus.new Region("Vitebsk");

		belarus.addRegion(gomelskay);
		belarus.addRegion(grodnenskay);
		belarus.addRegion(brestskay);
		belarus.addRegion(vitebskay);
		belarus.addRegion(mogilevskay);
		belarus.addRegion(minskay);

		belarus.sortForRegion();

		gomelskay.addDistrict(gomelskay.new District("Svetlogorsk"));
		State.Region.District rechitskiy = gomelskay.new District("Rechitsa");
		gomelskay.addDistrict(rechitskiy);

		State.Region.District.City city1 = rechitskiy.new City("Rechitsa");
		State.Region.District.City city2 = rechitskiy.new City("Holmech");

		rechitskiy.addCity(city1);
		rechitskiy.addCity(city2);

		belarus.printInfo();
		System.out.println("____________________");
		gomelskay.printInfo();
		System.out.println("____________________");
		grodnenskay.printInfo();

	}
}
