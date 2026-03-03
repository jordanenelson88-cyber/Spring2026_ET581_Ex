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
    }
}