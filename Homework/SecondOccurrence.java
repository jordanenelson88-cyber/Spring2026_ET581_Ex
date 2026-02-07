public class SecondOccurrence{

    public static int secondOccurrenceOfOne(String text) {
        int firstIndex = text.indexOf("one"); // find the starting position for the first "one"

        int secondIndex = text.indexOf("one", firstIndex + 1); // find the starting position for the second "one" after the first

        return secondIndex; // now return the starting index of the second "one"
    }

    // Temporary main method to test my coding script 
    public static void main(String[] args) {
        String script = "one two one two one";
        System.out.println(secondOccurrenceOfOne(script));
    }
}