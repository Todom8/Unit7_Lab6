package sortingAndSearching;

public class Sorting {
	static public Student[] sortStudents(Student[] students) {
		boolean sorted = false;
		int startIdx = 0;
		while (!sorted) {
			Student startEntry = students[startIdx];
			int maxIdx = startIdx;
			Student maxEntry = startEntry;
			
			for (int i = startIdx + 1; i < students.length; i++) {
				if (students[i].isLargerScore(maxEntry)) {
					maxIdx = i;
					maxEntry = students[i];
				}
			}
			
			if (maxIdx == startIdx) {
				sorted = true;
				return students;
			}
			
			students[startIdx] = maxEntry;
			students[maxIdx] = startEntry;
			
			startIdx += 1;
			if (startIdx == students.length) {
				sorted = true;
				return students;
			}
		}
		return students;
	}
}
