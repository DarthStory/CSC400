package postFix;

public class MainPostFixCalc {

	public static void main(String[] args) {
		
		PostfixCalculator calculator = new PostfixCalculator();
		
		String input1 = "34+5*";
		System.out.println("The answer of " + input1 + " is: " + calculator.evaluatePostfix(input1));
	}

}
