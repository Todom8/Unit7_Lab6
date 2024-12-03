package sortingAndSearching;

public class Student implements Comparable{
	private String firstName = "";
	private String lastName = "";
	private int score = 0;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String newName) {
		firstName = newName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String newName) {
		lastName = newName;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int newScore) {
		if (newScore >= 0 && newScore <= 100) {
			score = newScore;
		}
	}
	
	public boolean isSmallerScore(Comparable otherComparable) {
		return (score < otherComparable.getScore());
	}
	
	public boolean isLargerScore(Comparable otherComparable) {
		return (score > otherComparable.getScore());
	}
	
	public String toString() {
		String returnStr = "";
		returnStr = returnStr + firstName;
		returnStr = returnStr + " " + lastName;
		returnStr = returnStr + ": " + score;
		return returnStr;
	}
}
