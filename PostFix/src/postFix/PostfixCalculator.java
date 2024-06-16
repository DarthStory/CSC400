package postFix;

import java.util.EmptyStackException;
import java.util.Stack;

public class PostfixCalculator {
	
	/*
	 * I had 2 different ways to try to attempt to do "multi-digit operands". 
	 * They both failed as soon as I hit a operand. I could not know how when manually putting
	 * in the postfix notation instead of asking for each number somehow, how it could tell if I 
	 * wanted "2233" to be "223 and 3", "22 and 33" or "1 and 233".. The only way I found was to
	 * put a space between the numbers, but it errored out when it saw the space. I thought that I was just
	 * being extra trying to get numbers over a single digit long as none of the examples had multi-digits 
	 * in them. I will have to work on this for the final to figure it out. I hope you can give me some 
	 * insight as to what to do here. I would put the example here but it basically modified the whole first 
	 * if statement and also added an else if. There would be a lot of text and it would be hard to read. 
	 */
	

    // Method to evaluate the expression
    public int evaluatePostfix(String expression) {
        // first Implement the stack
        Stack<Integer> stack = new Stack<>();
        
        StringBuilder numberBuffer = new StringBuilder();

        // create a for loop to go through the expression
        for(int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            if(Character.isDigit(c)) {
            	numberBuffer.append(c);
            
            }else if(c == ' ') {
            	if(numberBuffer.length() > 0) {
            		stack.push(Integer.parseInt(numberBuffer.toString()));
            		numberBuffer.setLength(0);
            	}
            }else {
            	
            	if(numberBuffer.length() > 0) {
            		stack.push(Integer.parseInt(numberBuffer.toString()));
            		numberBuffer.setLength(0);
            }
            	if(stack.size() < 2) {
            		throw new EmptyStackException();
            	}

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
                    default:
                    	throw new IllegalArgumentException("Invalid operator: " + c);
                }
            }
        }
        if(numberBuffer.length() > 0) {
        	stack.push(Integer.parseInt(numberBuffer.toString()));
        }
        
        if(stack.size()!= 1) {
        	throw new EmptyStackException();
        }
        return stack.pop();
    }
}
