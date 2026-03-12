public class TwoDArrayHomework {
    // Question 1
    public static void sumOfRows(int[][] arr) { // this method will find the sum of each row 
       
        for (int i = 0; i< arr.length; i++) { // we will run the loop for each row in the array and arr.length will tell us how many rows are there
            int sum = 0;  // store the total for the current row

            for(int j = 0; j< arr[i].length; j++){ // we will run the loop for each row in the array and arr[i].length will tell us how many columns are in the row
                sum += arr[i][j]; //  this adds each number in the row to sum 
            
            }
            System.out.println("Sum of row " + i + " : " + sum); // this will print the total sum of each row 
        }
     
     
    }
    
    
    // Question 2
    public static void sumOfColumns(int[][] arr) { // this method will find the sum of each column 
        for(int j = 0; j < arr[0].length; j++){ // we will run the loop for each column in the array and arr[0].length will tell us how many columns are there
            int sum = 0; // store the total for the current row

            for(int i = 0; i < arr.length; i++){ // // we will run the loop for each column int the array and arr.length will tell us how many columns are in the row
                sum += arr[i][j]; //  this adds each number in the row to sum 
            }
            System.out.println("Sum of column" + j + ":" + sum); // this will print the total sum of each column


        }
    }
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        sumOfRows(arr); // now sumOfRow will find row sum
        sumOfColumns(arr); // now sumOfColumns will find column sum
    }
    
}   




