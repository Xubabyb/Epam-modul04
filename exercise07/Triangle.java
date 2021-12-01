
/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания 
 * объектов, вычисления площади, периметра и точки пересечения медиан.
 */

package by.jonline.modul04.exercise07;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle(Point a, Point b, Point c) {

		pointA = a;
		pointB = b;
		pointC = c;

	}

	private double findLengthSide(Point a, Point b) {

		double x;
		x = Math.sqrt(Math.pow(Math.abs(a.getX() - b.getX()), 2) + Math.pow(Math.abs(a.getY() - b.getY()), 2));
		return x;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public double getPerimeter() {
		double a;
		double b;
		double c;

		a = findLengthSide(pointA, pointB);
		b = findLengthSide(pointB, pointC);
		c = findLengthSide(pointC, pointA);

		return a + b + c;
	}

	public double getSquare() {

		double s;

		double p = getPerimeter() / 2.0;

		s = Math.sqrt(p * (p - findLengthSide(pointA, pointB)) * (p - findLengthSide(pointB, pointC))
				* (p - findLengthSide(pointC, pointA)));

		return s;
	}

	public Point medianInterecectionPoint() {

		Point o = new Point();

		double x = (getPointA().getX() + getPointB().getX() + getPointC().getX()) / 3.0;
		double y = (getPointA().getY() + getPointB().getY() + getPointC().getY()) / 3.0;

		o.setX(x);
		o.setY(y);

		return o;
	}
}
