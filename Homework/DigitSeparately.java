import java.util.Scanner;

public class DigitSeparately{
        public static void main(String[] args){
        
        Scanner input = new Scanner(System.in); // This scanner input will read whatever the user inputs    
        
        System.out.print("Enter a 4-digit integer: "); // So this will be asking the user to enter a 4-digit integer
        int number = input.nextInt(); // this will store the users input

        int first = number / 1000; // after dividing by 1000 we throw away the reminders
        int second = (number / 100) %10; // after dividing by 100 we throw away the reminders then % 10 to get the 2
        int third =  (number / 10) %10; // after dividing by 10 we throw away the reminders then % 10 to get the 3`
        int fourth = number % 10; // we're gonna calculate %10

        System.out.println("int first: " + first);
        System.out.println("int second: " + second);
        System.out.println("int third: " + third);
        System.out.println("int fourth: " + fourth);

     input.close(); // now where gonna close the scanner 
    }
}   