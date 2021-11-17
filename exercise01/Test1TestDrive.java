package by.jonline.modul04.exercise01;

import java.util.Random;

public class Test1TestDrive {

	public static void main(String[] args) {

		Test1 one = new Test1();

		Random rand = new Random();

		one.a = rand.nextInt(100);
		
		one.b = rand.nextInt(100);	
		 
		one.print(one.a, "a");

		one.print(one.b, "b");
		
		one.print(one.summ(), "summ");

		one.print(one.maxNum(), "numMax");
	
		

	}

}
