package by.htp.task05.main;

// ������� �����, ����������� ���������� �������, ������� ����� ����������� ��� ���������
// ���� �������� �� ������� � �������� ���������.������������� ������������� ��������
// ���������� �� ��������� � ������������� ����������.������� ����� ������ ���������� �
// ���������� ���������,� ����� ����������� �������� ��� ������� ���������.�������� ���,
// ��������������� ��� ����������� ������.

public class Main {

	public static void main(String[] args) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter(3);

		System.out.println("Counter1 = " + counter1.getValue());
		System.out.println("Counter2 = " + counter2.getValue());

		counter1.Increase();
		counter2.Decrease();

		System.out.println("Counter1 = " + counter1.getValue());
		System.out.println("Counter2 = " + counter2.getValue());

	}

}
