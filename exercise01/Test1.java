package by.jonline.modul04.exercise01;

public class Test1 {

	int a;
	int b;

	public void print(int x, String message) {
		System.out.println(message + " = " + x);
	}

	public int summ() {
		return a + b;
	}

	public int maxNum() {
		if (a > b) {
			return a;
		}
		return b;
	}

}
