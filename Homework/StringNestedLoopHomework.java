public class StringNestedLoopHomework {
    // Question 3
    public static void reverseEachWord(String sentence) { // with this method we will reverse each word in the sentence
        String [] words = sentence.split(" "); // sentence.split will split the sentences into words by using spaces        
        
        for (int i = 0; i < words.length; i++){ // we will run the loop for each word in the array and words.length will tell us how many words are there
            
            for (int j = words[i].length() - 1;j >= 0; j--){ // this loop will start at the last letter and then move backwards 
                System.out.print(words[i].charAt(j)); // now this will print out each word but in reverse order
            }
            System.out.println(); // move onto the next line after finishing one word
        }
    }

    // Question 4
    public static void reverseWordOrder(String sentence) { // This method reverses the order of the words in the sentence
        String [] words = sentence.split(" "); // sentence.split will split the sentences into words by using spaces 

         for (int i = words.length - 1; i >= 0; i--) { // this loop starts at the last word and moves backwards
            System.out.println(words[i]); // now this will print out each word but in reverse order
        }
    }

    // Question 5
    public static void reverseLongWords(String sentence) {

        String[] words = sentence.split(" "); // This method reverses only if the word is larger than 3 letter

        for (int i = 0; i < words.length; i++) { // sentence.split will split the sentences into words by using spaces 

            if (words[i].length() > 3) { // this will check if word has more than 3 letters

                for (int j = words[i].length() - 1; j >= 0; j--) {  // this loop will start at the last letter and then move backwards 
                    System.out.print(words[i].charAt(j)); // now this will print out each word but in reverse order
                }

            } else {
                System.out.print(words[i]);  // if the word is 3 letters or less it prints normally
            }

            System.out.print(" "); // this will allow space after each word
        }
    }

    public static void main(String[] args) {
        
        reverseEachWord("Hello World"); // this method will reverse each word
        reverseWordOrder("Java is fun"); // this method will reverse the order of the words
        reverseLongWords("Java is very cool"); // this method will reverse only the long words
    }
}