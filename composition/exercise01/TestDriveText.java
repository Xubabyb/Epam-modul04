package by.jonline.modul04.composition.exercise01;

public class TestDriveText {

	public static void main(String[] args) {

		String heading_1 = "My learn";
		String sen_1 = "I want to sleep.";
		String sen_2 = "And I don't know what will I do. ";

		Text myDay = new Text(heading_1);
		Text testConstuctor = new Text(heading_1, sen_2);

		myDay.add(sen_1);
		myDay.add(sen_2);

		myDay.getHeading().setWord("My home");

		System.out.println(myDay.getHeading());

		myDay.printAll();
		
		myDay.getContent().get(1).setSentence("Mistake");
		
		myDay.printAll();

		testConstuctor.printAll();
	}

}
