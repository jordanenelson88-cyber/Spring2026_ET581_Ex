
public class TwoDArrayHomework {
    
    public static void sumOfRows(int[][] arr) {
       
        for (int i = 0; i< arr.length; i++) {
            int sum = 0;

            for(int j = 0; j< arr[i].length; j++){
                sum += arr[i][j];
            
            }
            System.out.println("Sum of row " + i + " : " + sum);
        }
     
     
    }
    public static void sumOfColumns(int[][] arr) {
        for(int j = 0; j < arr[0].length; j++){
            int sum = 0;

            for(int i = 0; i < arr[0].length; i++){
                sum += arr[i][j];
            }
            System.out.println("Sum of column" + j + ":" + sum);


        }
    }
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {8,9,10,11,12}
        };
        sumOfRows(arr);
        sumOfColumns(arr);
    }
    
}   







