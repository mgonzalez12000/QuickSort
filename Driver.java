package exQuckSort;

public class Driver{
	public static void main(String[] args) {

		Student[] students = new Student[4];
		
		Student pupil1 = new Student ("Tony Stark", 5.4);
		Student pupil2 = new Student ("Bruce Banner", 5.0);
		Student pupil3 = new Student ("Peter Parker", 4.3);
		Student pupil4 = new Student ("Groot", 2.8);

		students[0] = pupil1;
		students[1] = pupil2;
		students[2] = pupil3;
		students[3] = pupil4;

		System.out.println("Order before quickSort: ");

		for (Student s : students) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Order after quickSort: ");
		
		int n = students.length;
		QuickSort ob = new QuickSort();
		ob.sort(students, 0, n - 1);

		for (Student s : students) {
			System.out.println(s);
		}

	}
}