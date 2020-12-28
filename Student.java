package exQuckSort;

//Write a Student class with a String name, Double GPA. Student should implement Comparable<Student>
public class Student implements Comparable<Student> {
	private String name;
	private Double GPA;
	//Constructor
	public Student(String name, Double GPA) {
		this.name = name;
		this.GPA = GPA;
	}
	//Getter and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getGPA() {
		return GPA;
	}
	public void setGPA(Double gpa) {
		GPA = gpa;
	}
	//compareTo() in ascending order
	@Override
	public int compareTo(Student s) {
		return Double.valueOf(GPA).compareTo(s.getGPA());
	}

	public String toString() {
		return "Name: " + name + ", GPA: " + GPA;
	}
}