public class SecondOccurrence {
    public static int secondOccurrenceOfOne(String text){
        int firstIndex = text.indexOf("one"); // find the starting position for the first "one" from the string 

        int secondIndex = text.indexOf("one", firstIndex + 1); // find the starting position for the second "one" after finding the first "one"

        return secondIndex; // now return the starting index of the second "one"
    }
}
