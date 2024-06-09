package postFix;

import java.util.Stack;

public class PostfixCalculator {

	// Method to evaluate the expression
	public int evaluatePostfix(String expression) {
		// first Implement the stack
		Stack<Integer> stack = new Stack<>();
		
		// create a for loop to go through the expression
		for(int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			
			// if character is a number, push it to the stack
				if(Character.isDigit(c)) {
					stack.push(c - '0');
				}else {
				// if an operator, then pop elements and apply operator
				int num1 = stack.pop();
				int num2 = stack.pop();
				
				System.out.println("Popped from stack: " + num1 + ", " + num2); // debug
				
				switch(c) {
				case '+':
					stack.push(num1 + num2);
					System.out.println("Performed addition: " + num1 + " + " + num2); // Debug print
					break;
				case '-':
					stack.push(num1 - num2);
					System.out.println("Performed subtraction: " + num1 + " - " + num2); // Debug print
					break;
				case '*':
					stack.push(num1 * num2);
					System.out.println("Performed multiplication: " + num1 + " * " + num2); // Debug print
					break;
				case '/':
					if(num2 == 0) {
						throw new ArithmeticException("Arithmetic Error");
					}
					stack.push(num1 / num2);
					System.out.println("Performed division: " + num1 + " / " + num2); // Debug print
					break;
				case '%':
					if(num2 == 0) {
						throw new ArithmeticException("Arithmetic Error");
					}
					stack.push(num1 % num2);
					System.out.println("Performed modulus: " + num1 + " % " + num2); // Debug print
                    break;
				}
		}
		if(stack.size() != 1) {
			throw new IllegalArgumentException("Error: Invalid postfix expression, stack size is " + stack.size());
		}
		return stack.pop();
		}
	}
}