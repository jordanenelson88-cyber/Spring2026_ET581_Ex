public class SubstringApple{
    public static String substringFromApple(String text){
        String lowerText = text.toLowerCase(); //we're creating a lowercase veriosn of the string and then store it into lowerText

        int index = lowerText.indexOf("apple"); //we're now creating a variable(index) to store the position of the apple

        return text.substring(index); //now we return the substring that index is using from the original text 
    }

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 