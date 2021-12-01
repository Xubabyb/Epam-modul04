package by.jonline.modul04.exercise07;

public class TestDriveTriangle {

	public static void main(String[] args) {

		Triangle one = new Triangle(new Point(3, 6), new Point(-3, 3), new Point(-2, 8));

		System.out.printf("Периметр треугольника = %.2f, Площадь = %.2f\n", one.getPerimeter(), one.getSquare());

		System.out.printf("Координаты точки пересечения медиан (%.2f : %.2f)\n", one.medianInterecectionPoint().getX(),
				one.medianInterecectionPoint().getY());

		one.getPointA().setX(-3);

		one.getPointA().setY(-6);

		System.out.printf("Периметр треугольника = %.2f, Площадь = %.2f\n", one.getPerimeter(), one.getSquare());

		System.out.printf("Координаты точки пересечения медиан (%.2f : %.2f)\n", one.medianInterecectionPoint().getX(),
				one.medianInterecectionPoint().getY());

	}

}