import java.util.Scanner;

public class LetterInAWord {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        
        String word = input.nextLine(); // it will store the word that the user will input 

        String newWord = ""; // this will hold the modified word 

        for (int i  = 0; i < word.length(); i++) { // loop through each character in the word 
            char letter = word.charAt(i); // check one letter at a time 

            if (letter == 'e') { // if the letter is 'e', replace it and add "*"
                newWord = newWord + "*";
            }
            else {
                newWord = newWord + letter; // if the letter doesnt have 'e' then keep the letter 
            }
        
        }

        System.out.println(newWord); // now print the final word


    }
}
