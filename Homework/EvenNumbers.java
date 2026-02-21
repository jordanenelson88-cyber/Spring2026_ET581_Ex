public class EvenNumbers {
    public static void main(String[] args) {
        
        int sum = 0; // this will store the  total of sum

        for(int i = 2; i<= 100; i += 2) { // with this loop you will start at 2 and counts up to a hundred then gets increased by 2 each time
            sum = sum + i; // now add the current sum to the even number to sum

        }
        System.out.println("Sum of even numbers "  + sum); // after the loops ends then print out the total of sum
    }
    
}
