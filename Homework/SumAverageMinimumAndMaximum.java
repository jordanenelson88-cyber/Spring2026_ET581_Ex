
import java.util.Scanner;

public class SumAverageMinimumAndMaximum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // create a scanner that could reaf number inputed from the user 
        
        System.out.println("Enter the number of elements: "); // ask the user how many numbers they would like to enter in so we will know the size of the array
        int num = input.nextInt();

        int [] numbers = new int[num]; // Create an integer array that will store all the numbers the user enters.

        System.out.println("Enter "   + num +  "integers:" ); // user will need to input the numbers that will be stored in the array.

        for (int i = 0 ; i < num ; i+=1) { // this loop will run num and read each number that will be stored into the array. 
            numbers[i] = input.nextInt();
        }

        // Initialize the sum, min, and max values.
        int sum = 0;
        int min = numbers [0];
        int max = numbers [0];

        for (int i = 0 ; i < num ; i++  ) {  // This loop will go through each  element in the array to calculate the sum and find the min and max values.

            sum  += numbers[i]; // You would then add the current number in the array to run the total of sum.

            if(numbers[i] < min) { // Check if the current number is smaller than the stored minimum and update it if necessary.
                min = numbers[i];
            }

            if (numbers[i] > max){ // Check if the current number is larger than the stored maximum and update it if necessary.
             max = numbers[i];
            } 
        }

        double average = (double) sum / num;  // nocw alculate the average by dividing the total sum by the number.

        System.out.println("Sum = " + sum);  // will now show the total sum of number found in the array.
        System.out.println("Average = "  + average);  // will now show the average of number found in the array.
        System.out.println(" Minimum = " + min);  // will now show the smallest value found in the array.
        System.out.println("Maximum = " + max);  // will now show the largest value found in the array.

        input.close(); //  now where gonna close the scanner 
   
    }   



}