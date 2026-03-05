import java.util.Arrays;

public class SeparateEvenAndOddArrays{
    public static void main(String [] args){
        int [] nums = {3, 5, 8, 12, 7, 4}; // now create the original array of numbers

        // these will be the varibles use to count how many even and odd numbers exist.
        int  evenCount = 0;
        int oddCount = 0;

        // loop runs through the array to count even and odd numbers.
        for( int num: nums){
            if(num % 2 == 0){
                evenCount++;
            } else{
                oddCount++;                                                            
            }
            
        
        }

        // create a array that will hold the exact size of the even and odd numbers
        int [] evenArray = new int[evenCount];
        int [] oddArray = new int[oddCount];


        // the index varibles will track where to place numbers in each new array
        int evenIndex = 0;
        int oddIndex = 0;


        // now you'll loop through the original array again to place numbers into the correct array
        for(int num : nums){
            if(num % 2 == 0){
            evenArray[evenIndex] = num;
            evenIndex++;
        } else{
            oddArray[oddIndex] = num;
            oddIndex++;
        }
        }
        // you should now be able to print the original array and the results.
        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("Even number count: " + evenCount);
        System.out.println("Odd number count: " + oddCount);
        System.out.println("Even number: " + Arrays.toString(evenArray));
        System.out.println("Odd number: " + Arrays.toString(oddArray));

        
      
    }

}