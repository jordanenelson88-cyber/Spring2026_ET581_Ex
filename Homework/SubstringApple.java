public class SubstringApple{
    public static String substringFromApple(String text){
        String lowerText = text.toLowerCase(); //we're creating a lowercase version of the string and then store it into lowerText

        int index = lowerText.indexOf("apple"); //we're now creating a variable(index) to store the position of the apple

        return text.substring(index); //now we return the substring starting at index from the original text 
    }

      // Temporary main method to test out my coding script
      public static void main(String[] args) {
        String script = "I like Apple Pie";
        System.out.println(substringFromApple(script));
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 