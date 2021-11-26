package by.jonline.modul04.exercise03;

public class TestDriveStudent {

	public static void main(String[] args) {

		Student[] students = new Student[10];

		students[0] = new Student("Шидловский М.Д.", 7, new int[] { 9, 10, 10, 9, 10 });
		students[1] = new Student("Шидловский Д.Д.", 27, new int[] { 9, 7, 10, 9, 10 });
		students[2] = new Student("Виницкий В.М.", 27, new int[] { 8, 7, 6, 9, 5 });
		students[3] = new Student("Пинаев Е.Ю.", 56, new int[] { 7, 7, 9, 9, 6 });
		students[4] = new Student("аранов Д.А.", 27, new int[] { 9, 8, 9, 9, 10 });
		students[5] = new Student("Сильванович В.А.", 7, new int[] { 9, 7, 7, 9, 10 });
		students[6] = new Student("Никитин Ю.А.", 56, new int[] { 10, 9, 9, 9, 10 });
		students[7] = new Student("Юденко И.И.", 47, new int[] { 9, 9, 6, 9, 10 });
		students[8] = new Student("Сорокин А.Ф.", 27, new int[] { 9, 8, 7, 9, 10 });
		students[9] = new Student("Кацуро А.С.", 7, new int[] { 6, 7, 9, 7, 10 });

		System.out.println("Студенты с превосходной успеваемостью:");
		
		Student.printExcellent(students);

	}

}
