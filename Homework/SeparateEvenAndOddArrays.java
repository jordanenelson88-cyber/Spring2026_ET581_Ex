import java.util.Arrays;

public class SeparateEvenAndOddArrays{
    public static void main(String [] args){
        int [] nums = {3, 5, 8, 12, 7, 4};

        int  evenCount = 0;
        int oddCount = 0;

        for( int num: nums){
            if(num % 2 == 0){
                evenCount++;
            } else{
                oddCount++;                                                            
            }
            
        
        }
        int [] evenArray = new int[evenCount];
        int [] oddArray = new int[oddCount];

        int evenIndex = 0;
        int oddIndex = 0;


        for(int num : nums){
            if(num % 2 == 0){
            evenArray[evenIndex] = num;
            evenIndex++;
        } else{
            oddArray[oddIndex] = num;
            oddIndex++;
        }
        }
        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("Even number count: " + evenCount);
        System.out.println("Odd number count: " + oddCount);
        System.out.println("Even number: " + Arrays.toString(evenArray));
        System.out.println("Odd number: " + Arrays.toString(oddArray));

        
      
    }

}