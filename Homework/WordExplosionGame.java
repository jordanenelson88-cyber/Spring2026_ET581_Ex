import java.util.Scanner;
import java.util.StringTokenizer;

public class WordExplosionGame {
    
    public static void main(String[] args) {
        // Now create a scanner object to read input from the user
        Scanner input = new Scanner(System.in);


        // prompt the user to enter a sentence
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine(); // i want you to read the line and the ones with spaces
        
        // print the words in all cap 
        System.out.println("\nWords in ALL CAPS: ");
        printUpperCaseWords(sentence);

        // now find and print the longest word 
        String longestWord = getLongestWord(sentence);
        System.out.println("\nLongest word: " + longestWord);

        // count and print the total number of words being used
        int totalWords = countWords(sentence);
        System.out.println("Total words: " + totalWords);

        input.close(); //now lets close the scanner to avoid a leak of our reasources happening 
    }
 

    public static void printUpperCaseWords(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence); // split the sentencs into words 

        while(tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken(); // go to the next word
            System.out.println(word.toUpperCase()); // print into uppercase
        }     
    }

    public static String getLongestWord(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence); // split the sentence into words
        String longest = ""; // Initialize the longest word as empty string

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken(); // get to the next word 
            if (word.length() > longest.length()) { // compare the length of the word
                longest = word; // update if the current word is longer

            }
        }

        return longest; // return the longest word

      
    
    
    }
    
    public static int countWords(String sentence) {
        StringTokenizer tokenizer = new StringTokenizer(sentence); // split the words
        int count = 0; // Initialize word counter

        while(tokenizer.hasMoreTokens()) { //loop through all words
            tokenizer.nextToken(); // get to the next word
            count++; // Increment counter

        }

        return count; //return the total number of words
    
    }
}



