package CSCI1010;

public class Pair {
	private String original;
	private String shuffled;
	
	public Pair(String original, String shuffled) {
		this.original = original;
		this.shuffled = shuffled;
	}
	
	public String getOriginal() {
		return this.original;
	}
	
	public void setOriginal(String original) {
		this.original = original;
	}
	
	public String getShuffled() {
		return this.shuffled;
	}
	
	public void setShuffled(String shuffled) {
		this.shuffled = shuffled;
	}
}
