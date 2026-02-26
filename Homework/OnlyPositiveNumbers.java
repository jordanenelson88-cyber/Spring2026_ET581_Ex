import java.util.Scanner;

public class OnlyPositiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        int count = 0; // this will count all the number that are positive

        for (int i = 1; i<= 6; i++) {
            
            System.out.print("Input: ");
            int number = input.nextInt();
            
            if (number <= 0) { // if the number the user inputs are negative or zero skip it 
                continue; // then you would jump to the next loop

            }
             count++; // only run if the number the user input is positive
            
        
        
        }
        System.out.println(count + "postive numbers "); // print how many positives we can count from the loop

        
        

        
        


    }
}
