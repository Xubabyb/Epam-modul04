
/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
 * успеваемость (массив из пяти элементов). Создайте массив из десяти элементов
 * такого типа. Добавьте возможность вывода фамилий и номеров групп студентов,
 * имеющих оценки, равные только 9 или 10.
 */

package by.jonline.modul04.exercise03;

public class Student {

	private String name;

	private int number;

	private int[] progress;

	public Student(String name, int number, int[] progress) {

		this.name = name;
		this.number = number;
		this.progress = progress;
	}

	public static void printExcellent(Student[] students) {

		for (int i = 0; i < students.length; i++) {

			if (findExcellentStudent(students[i].progress)) {

				System.out.println(students[i].name + " " + students[i].number);
			}
		}

	}

	private static boolean findExcellentStudent(int[] progress) {

		boolean check = false;
		
		int minProgress = 10;
		
		for (int temp : progress) {

			if (temp < minProgress) {

				minProgress = temp;
			}

		}
		if (minProgress >= 9) {

			check = true;
		}
		return check;
	}
}
