package postFix;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;
import java.util.EmptyStackException;

public class MainPostFixCalc {

    public static void main(String[] args) {
        // creates the PostfixCalculator object
        PostfixCalculator calculator = new PostfixCalculator();

        // Adds strings and tries to evaluate the string to run the calculation
        // If it fails, it lets you know.
        try {
            String input1 = "23*3*";
            System.out.println("The answer of " + input1 + " is: " + calculator.evaluatePostfix(input1) + "\n");
        } catch (EmptyStackException e) {
            System.out.println("This is not proper Postfix notation" + e.getMessage() + "\n");
        }
        try {
            String input2 = "53+7";
            System.out.println("The answer of " + input2 + " is: " + calculator.evaluatePostfix(input2) + "\n");
        } catch (EmptyStackException e) {
            System.out.println("This is not proper Postfix notation" + e.getMessage() + "\n");
        }

        try {
            String input3 = "42*+";
            System.out.println("The answer of " + input3 + " is: " + calculator.evaluatePostfix(input3) + "\n");
        } catch (EmptyStackException e) {
            System.out.println("This is not proper Postfix notation" + e.getMessage() + "\n");
        }

        try {
            String input4 = "34+6*";
            System.out.println("The answer of " + input4 + " is: " + calculator.evaluatePostfix(input4) + "\n");
        } catch (EmptyStackException e) {
            System.out.println("This is not proper Postfix notation" + e.getMessage() + "\n");
        }
        try {
            String input5 = "23+";
            System.out.println("The answer of " + input5 + " is: " + calculator.evaluatePostfix(input5) + "\n");
        } catch (EmptyStackException e) {
            System.out.println("This is not proper Postfix notation" + e.getMessage() + "\n");
        }
        
        // read file call to method
        FileReadExample(calculator);
    }

//    private static void FileReadExample() {
//    }
    // reads file
    private static void FileReadExample(PostfixCalculator calculator) {
            Path filePath = Paths.get("C:\\Temp\\Postfix.txt");
            try {
                List<String> lines = Files.readAllLines(filePath);
                for (String line : lines) {
                   //System.out.println(line);
                    System.out.println("The answer of " + line + " is: " + calculator.evaluatePostfix(line) + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
