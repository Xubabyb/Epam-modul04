package by.jonline.modul04.exercise02;

public class TestDriveTest2 {

	public static void main(String[] args) {

		Test2 one = new Test2();

		System.out.println(one.getA() + " + " + one.getB() + " = " + one.summ());

		one.setA(56);

		one.setB(13);

		System.out.println(one.getA() + " + " + one.getB() + " = " + one.summ());

		Test2 two = new Test2(6, 5);

		System.out.println(two.getA() + " + " + two.getB() + " = " + two.summ());

	}

}
