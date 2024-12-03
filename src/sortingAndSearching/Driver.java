package sortingAndSearching;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Gradebook grades = new Gradebook();
		
		Scanner input = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			Student student = new Student();
			System.out.println("Student " + i);
			System.out.print("First Name: ");
			student.setFirstName(input.next());
			System.out.print("Last Name: ");
			student.setLastName(input.next());
			System.out.print("Grade: ");
			student.setScore(Integer.parseInt(input.next()));
			grades.addStudent(student);
		}
		
		System.out.println("\n\n" + grades);
	}
}
