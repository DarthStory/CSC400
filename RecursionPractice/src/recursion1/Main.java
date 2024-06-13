package recursion1;

public class Main {

	static void countDown(Integer x, Integer end) {
		if (x > end) {
			System.out.println("Done!");
			return;
		}
		System.out.println(x);
		countDown(x + 1, end);
	}
	
	
	public static void main(String[] args) {
		countDown(0, 10);
	}

}
