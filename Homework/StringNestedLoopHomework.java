public class StringNestedLoopHomework {
    // Question 3
    public static void reverseEachWord(String sentence) {
        String [] words = sentence.split(" ");        
        
        for (int i = 0; i < words.length; i++){
            
            for (int j = words[i].length() - 1;j >= 0; j--){
                System.out.println(words[i].charAt(j));
            }
            System.out.println();
        }
    }
    // Question 4
    public static void reverseWordOrder(String sentence) {
        String [] words = sentence.split(" ");

         for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }

    // Question 5
    public static void reverseLongWords(String sentence) {

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > 3) {

                for (int j = words[i].length() - 1; j >= 0; j--) {
                    System.out.print(words[i].charAt(j));
                }

            } else {
                System.out.print(words[i]);
            }

            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        
        reverseEachWord("Hello World");
        reverseWordOrder("Java is fun");
        reverseLongWords("Java is very cool");
    }
}

