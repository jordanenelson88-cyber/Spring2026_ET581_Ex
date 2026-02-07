public class IsBetweenAppleAndMango {
    public static boolean isbetweenappleandmango(String word){
    
        String lowerword = word.toLowerCase(); // we're now creating a lowercase verison of 'word' to ignore case when comparing
        
        // if true then return lowerword after 'apple' and before 'mango' alphabetically
        return lowerword.compareTo("apple") > 0 && lowerword.compareTo("mango") < 0;





    }
}
