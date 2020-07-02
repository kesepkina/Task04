package by.htp.task07.main;

public class Triangle {

	private double x1;
	private double x2;
	private double x3;
	private double y1;
	private double y2;
	private double y3;
	private double side1;
	private double side2;
	private double side3;
	private double angle12;
	private double angle23;
	private double angle13;

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {

		side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

		if (side1 + side2 <= side3 || side3 + side2 <= side1 || side1 + side3 <= side2) {
			System.out.println("Данные точки лежат на одной прямой и не образуют треугольник.");
		}

		angle12 = Math.acos((side1 * side1 + side2 * side2 - side3 * side3) / (2 * side1 * side2));
		angle13 = Math.acos((side1 * side1 + side3 * side3 - side2 * side2) / (2 * side1 * side3));
		angle23 = Math.PI - (angle12 + angle13);

		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;

	}

	public double Perimeter() {
		return (side1 + side2 + side3);
	}

	public double Square() {
		return (1.0 / 2 * side1 * side2 * Math.sin(angle12));
	}

	public void IntersectionOfMedians() {
		double x, y;

		x = (x1 + x2 + x3) / 3.0;
		y = (y1 + y2 + y3) / 3.;
		System.out.printf("Медианы пересекаются в точке (%2.2f , %2.2f).", x, y);
	}

	public void GetTriangle() {
		System.out.printf("Side1: %2.2f\n", side1);
		System.out.printf("Side2: %2.2f\n", side2);
		System.out.printf("Side3: %2.2f\n", side3);
		System.out.printf("Angle12: %2.2f\n", angle12 / Math.PI * 180);
		System.out.printf("Angle13: %2.2f\n", angle13 / Math.PI * 180);
		System.out.printf("Angle23: %2.2f\n", angle23 / Math.PI * 180);
	}

}
