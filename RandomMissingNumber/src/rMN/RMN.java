package rMN;

public class RMN {

	public static void main(String[] args) {
		
		int[] numbers = {2,5,1,3,4,6,8};
		
		
		int n = numbers.length;
		
		int totalSum = (n + 1) * (n + 2) /2;
		int arraySum = 0;
		for(int i = 0; i < n; i++) {
			arraySum += numbers[i];
		}
		System.out.println(totalSum - arraySum);
		
	}
}
