package sortingAndSearching;

public interface Comparable {
	public int getScore();
	public void setScore(int newScore);
	public boolean isSmallerScore(Comparable otherComparable);
	public boolean isLargerScore(Comparable otherComparable);
}
