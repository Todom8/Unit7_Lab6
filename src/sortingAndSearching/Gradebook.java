package sortingAndSearching;

public class Gradebook{
	private Student[] entries = new Student[5];
	
	public void addStudent(Student newStudent) {
		for (int i = 0; i < entries.length; i++) {
			if (entries[i] == null) {
				entries[i] = newStudent;
				return;
			}
		}
	}
	
	public Student getStudent(int studentIdx) {
		entries = Sorting.sortStudents(entries);
		if (studentIdx < entries.length && studentIdx >= 0) {
			return entries[studentIdx];
		} else {
			return entries[entries.length - 1];
		}
	}
	
	public String toString() {
		entries = Sorting.sortStudents(entries);
		String returnStr = "Grades\n";
		for (int i = 0; i < entries.length; i++) {
			returnStr = returnStr + " - " + entries[i] + "\n";
		}
		return returnStr;
	}
}
