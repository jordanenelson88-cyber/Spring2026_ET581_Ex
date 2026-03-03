import java.util.Arrays; 

public class TwoDayArrayTest{ 

    public static void twoDayArrayCration(){ 
        int [] [] a = new int[3][4]; 
        int [] [] b = { 
            {1,2,3,4}, // index 0 
            {5,6}, // index 1 
            {7,8,9, 10} // index 2 
        }; 
        System.out.println(Arrays.deepToString(a)); 
        System.out.println(Arrays.deepToString(b)); 
        System.out.println(a.length); // how many row in there 
        System.out.println(b.length); 
        System.out.println(b[0].length); // size of b[0] which is first 
        System.out.println(b[1].length); 
        System.out.println(b[1].length); 
    } 

    static void TwoDayArrayAssignment(){ 
        String [][] s = new String[3][4]; 
        for(int r=0;r<s.length; r++){ 
            s[r][0] = "Hi"; 
        } 
        System.out.println(Arrays.deepToString(s)); 
    } 

    static void TwoDayArrayAssignmentWithNestedLoop(){ 
        String [][] s = new String[3][4]; 
        for(int r=0;r<s.length; r++){ 
            for(int c = 0; c< s[r].length; c++){ 
                s[r][c] = "Hi"; 
            } 
        } 
        System.out.println(Arrays.deepToString(s)); 
    } 

    public static void main(String[] args){ 
        // twoDayArrayCration(); 
        TwoDayArrayAssignment(); 
    } 

} 
