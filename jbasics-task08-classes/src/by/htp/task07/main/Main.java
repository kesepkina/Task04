package by.htp.task07.main;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
вычисления площади, периметра и точки пересечения медиан.*/

public class Main {

	public static void main(String[] args) {

		Triangle triangle1 = new Triangle(0, 1, 5, 2, 0, 3);

		triangle1.GetTriangle();
		
		System.out.printf("Периметр = %2.2f\n", triangle1.Perimeter());
		System.out.printf("Площадь = %2.2f\n", triangle1.Square());
		triangle1.IntersectionOfMedians();

	}

}
