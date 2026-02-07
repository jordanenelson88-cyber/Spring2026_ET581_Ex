public class IsBetweenAppleAndMango {
    public static boolean isBetweenAppleAndMango(String word){
    
        String lowerWord = word.toLowerCase(); // we're now creating a lowercase version of 'word' to ignore case when comparing
        
        // return true if lowerWord comes after 'apple' and before 'mango' alphabetically
        return lowerWord.compareTo("apple") > 0 && lowerWord.compareTo("mango") < 0;
    }

      // Temporary main method to test out my coding script 
      public static void main(String[] args) {
        String script1 = "banana";
        String scriptt2 = "zebra";
        System.out.println(isBetweenAppleAndMango(script1));

        System.out.println(isBetweenAppleAndMango(scriptt2));
      }
}



