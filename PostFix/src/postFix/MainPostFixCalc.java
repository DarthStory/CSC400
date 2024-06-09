package postFix;

import java.util.EmptyStackException;

public class MainPostFixCalc {

	public static void main(String[] args) {
		
		PostfixCalculator calculator = new PostfixCalculator();
		
		try {
		String input1 = "34+5*";
		System.out.println("The answer of " + input1 + " is: " + calculator.evaluatePostfix(input1));
		}catch (EmptyStackException e){
			System.out.println("This is not proper Postfix notation");
		}
		try {
		String input2 = "53+7*";
		System.out.println("The answer of " + input2 + " is: " + calculator.evaluatePostfix(input2));
		}catch (EmptyStackException e) {
			System.out.println("This is not proper Postfix notation");
		}
		
		try {
		String input3 = "42*+";
		System.out.println("The answer of " + input3 + " is: " + calculator.evaluatePostfix(input3));
		}catch (EmptyStackException e) {
			System.out.println("This is not proper Postfix notation");
		}
		
		try {
		String input4 = "34+6*";
		System.out.println("The answer of " + input4 + " is: " + calculator.evaluatePostfix(input4));
		}catch (EmptyStackException e) {
			System.out.println("This is not proper Postfix notation");
		}
	}

}
