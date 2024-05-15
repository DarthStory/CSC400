package bagPractice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

// Bag implementation
class Bag<Item> implements Iterable<Item> {
    private ArrayList<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    @Override
    public Iterator<Item> iterator() {
        return items.iterator();
    }
}

// Main class to use Bag for word counting
public class WordFrequency {
    public static void main(String[] args) {
        Bag<String> wordBag = new Bag<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words (type 'exit' to finish):");

        // Reading input words
        while (true) {
            String word = scanner.next();
            if(word.equalsIgnoreCase("exit")) {
                break;
            }
            wordBag.add(word);
        }
        scanner.close();

        // Counting word frequencies
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : wordBag) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Printing word counts
        System.out.println("Word Frequencies:");
        wordCount.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
