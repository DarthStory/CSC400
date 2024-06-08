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
				
				switch(c) {
				case '+':
					stack.push(num1 + num2);
					break;
				case '-':
					stack.push(num1 - num2);
					break;
				case '*':
					stack.push(num1 * num2);
					break;
				case '/':
					stack.push(num1 / num2);
					break;
				case '%':
					stack.push(num1 % num2);
					break;
				}
			}
		}
		return stack.pop();
	}
	
}
