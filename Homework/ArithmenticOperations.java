import java.util.Scanner;

public class ArithmenticOperations{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in); // This scanner input will read whatever the user types
       System.out.print("Enter score 1: "); // So this now will be asking the user for the first score 
       int score1 = input.nextInt(); // User input will be store into score1

       System.out.print("Enter score 2: "); // So this now will be asking the user for the second score
       int score2 = input.nextInt(); // User input will be store into score2

       System.out.print("Enter score 3: "); // So this now will be asking the user for the second score
       int score3 = input.nextInt(); // User input will be store into score3

       double average = (score1 + score2 + score3) / 3.0; // now we divide by 3.0 to find the average
       System.out.print("Average score: " + average); // 

       input.close(); // now where gonna close the scanner 
    }
}
