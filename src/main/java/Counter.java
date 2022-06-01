package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		count++;
	}
	
	public void increase() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public void decrease() {
		count--;
	}
	
	public int getCount() {
		return count;
	}
	
}
