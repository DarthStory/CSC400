package linkedList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class LinkedListMain {
	
	/*
	 * Implemented custom methods for Insert and delete. There are 
	 * 2 ways to insert into the "linkedList". One is directly, the
	 * other is from the file. I had errors trying to read the file. 
	 * I added some debugging print statements. This helped me identify
	 * errors in my code referencing the wrong thing. I was trying to reference
	 * line instead of part in a few places. After I solved for spaces, the 
	 * code should have changed. This lead to a long frustrating issue. The more
	 * I code the more I realize I have issues with details.       
     * 
	 */

	public static void main(String[] args) {
		
		CustomLinkedList linkedList = new CustomLinkedList();
		String filename = "LinkedListNumbers.txt";
		ReadNumbersFromFile("C:\\Temp\\LinkedListNumbers.txt", linkedList);
		
		
		
		//Insert some elements
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		
		
		System.out.println(linkedList);
		
		linkedList.insert(321);
		
		System.out.println(linkedList);
		//Deletes the first '2' it finds
		linkedList.delete(2);
		//Deletes the second '2'
		linkedList.delete(2);
		
		
		//Iterate and display elements
		Iterator<Integer> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
	private static void ReadNumbersFromFile(String fileName, CustomLinkedList linkedList) {
        try (BufferedReader textFile = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = textFile.readLine()) != null) {
            	
            	System.out.println("Reading line: " + line);
            	
            	// Split the line into parts by space
            	String[] parts = line.trim().split("\\s+");
            	for(String part : parts) {
	                try {
	                    int number = Integer.parseInt(part);
	                    linkedList.insert(number);
	                    
	                    System.out.println("Inserting number: " + number);
	                    
	                } catch (NumberFormatException e) {
	                    System.err.println("Skipping invalid number: " + part);
	                }
            	}
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
