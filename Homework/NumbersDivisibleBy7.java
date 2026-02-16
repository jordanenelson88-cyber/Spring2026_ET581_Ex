public class NumbersDivisibleBy7 {

    public static void listNumbersDivisibleBy7() {
        int number = 1; // start counting from 1

        // keep checking numbers until we reach 100
        while (number <= 100) {

            // now keep checking if the current number is divisible by 7
            if (number % 7 == 0) {
                System.out.print(number + "  "); // print the number on the same line 
            }

            number++; // move onto the next number
        }

        System.out.println(); // print a whole new line after listing all numbers 
    }

    public static int countNumbersDivisibleBy7() {
        int number = 1; // start checking from number 1
        int count = 0; // Initialize a counter for numbers divisible by 7

        while (number <= 100) { // loop until it reaches 100
            if (number % 7 == 0) { // check if it’s divisible
                count++;  // Increment counter when divisible
            }
            number++; // now move onto the next number 
        }

        return count; // return the total count of numbers divisible by 7
    }

    public static int sumNumberDivisibleBy7() {
        int number = 1; // start counting from 1
        int sum = 0; // initialize sum accumulator

        while (number <= 100) { // loop through numbers from 1 to 100
            if (number % 7 == 0) { // checks for divisibility 
                sum += number; // add the divisible number to the sum 
            }
            number++; // move to the next number 
        }

        return sum; // return total sum of numbers divisible by 7
    }

    // Temporary main method to test my coding script 
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 7: ");
        listNumbersDivisibleBy7();
        System.out.println("Count:  " + countNumbersDivisibleBy7());
        System.out.println("Sum:  " + sumNumberDivisibleBy7());
    }
}
