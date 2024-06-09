package postFix;

import java.util.EmptyStackException;

public class MainPostFixCalc {

	public static void main(String[] args) {
		// creates the PostfixCalculator object
		PostfixCalculator calculator = new PostfixCalculator();
		
		// Adds strings and tries to evaluate the string to run the calculation
		// If it fails, it lets you know. 
		try {
		String input1 = "23*";
		System.out.println("The answer of " + input1 + " is: " + calculator.evaluatePostfix(input1));
		}catch (EmptyStackException e){
			System.out.println("This is not proper Postfix notation" + e.getMessage());
		}
		try {
		String input2 = "53+7*";
		System.out.println("The answer of " + input2 + " is: " + calculator.evaluatePostfix(input2));
		}catch (EmptyStackException e) {
			System.out.println("This is not proper Postfix notation" + e.getMessage());
		}
		
		try {
		String input3 = "42*+";
		System.out.println("The answer of " + input3 + " is: " + calculator.evaluatePostfix(input3));
		}catch (EmptyStackException e) {
			System.out.println("This is not proper Postfix notation" + e.getMessage());
		}
		
		try {
		String input4 = "324+6*";
		System.out.println("The answer of " + input4 + " is: " + calculator.evaluatePostfix(input4));
		}catch (EmptyStackException e) {
			System.out.println("This is not proper Postfix notation" + e.getMessage());
		}
		try {
			String input5 = "23+";
			System.out.println("The answer of " + input5 + " is: " + calculator.evaluatePostfix(input5));
			}catch (EmptyStackException e) {
				System.out.println("This is not proper Postfix notation" + e.getMessage());
			}
	}

}
