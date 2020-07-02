package by.htp.task08.main;

public class Student {

	private String name;
	private int group;
	private int[] grades = new int[5];

	public Student(String name, int group, int[] grades) {
		this.name = name;
		this.group = group;
		this.grades = grades;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

}
