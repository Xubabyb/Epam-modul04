package by.jonline.modul04.composition.exercise05;

/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору
 * туристической путевки различного типа (отдых, экскурсии, лечение, шопинг,
 * круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
 * транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class TestDriveTour {

	public static void main(String[] args) {
		


		
		TravelAgency travelAgency = new TravelAgency("AlatanTour");
		
		travelAgency.addTour(new Tour("Poland",7,400,TourType.SHOPPING,Transport.BUS,Food.BREAKFAST));
		travelAgency.addTour(new Tour("Latvia",14,700,TourType.TREATMENT,Transport.BUS,Food.ALL_INCLUSIVE));
		travelAgency.addTour(new Tour("Egipet",7,1700,TourType.REST,Transport.PLANE,Food.ALL_INCLUSIVE));
		travelAgency.addTour(new Tour("France",7,500,TourType.EXCURSION,Transport.BUS,Food.BREAKFAST));
		travelAgency.addTour(new Tour("Ukraine",14,700,TourType.REST,Transport.TRAIN,Food.BREAKFAST));
		travelAgency.addTour(new Tour("Moldova",7,500,TourType.REST,Transport.BUS,Food.NOT_INCLUDED));
		travelAgency.addTour(new Tour("Turkey",7,1800,TourType.REST,Transport.PLANE,Food.ALL_INCLUSIVE));
		
		
		
		Client dima = new Client("Dima", 1000);
		
		travelAgency.setRequirements(dima);
		travelAgency.findAppropriateTour(dima);
		
		System.out.println();
		System.out.println("Number appropriate tour = "+ dima.getAppropriateTours().size());
		
		dima.printInfoAvailableTour();
	}

}
