import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);

        int largest = 0; // stores the value of a (whole number) 

        for(int i = 1; i<=5; i++) { // this for loop will now run 5 times
            System.out.println("Enter number " + i + ":");
            int number = input.nextInt(); // User inputs a number 
           
           
            if (i == 1) { // if 1 is the first number the user inputs make it the largest
                largest = number;
            
            }
            if (number > largest) { // if the user inputs a bigger number than the largest, update largest
                largest = number;

            }

        }
        System.out.println("The largest number is " + largest); // after the loop is finished then print out the largest number

    }
}
