public class SwapArrayTest {
    static void swapInt(int a, int b) {
        a = b;
        


    }
    static void SwapArrayINDEX(Int[] a, int firstIndex, int secondindex) {
        // first int location a [firstIndex];
        // second int location a [secondIndex];
        int temp = a [ secondIndex];
        a{secondIndex} = a[firstIndex];
        a[fistIndex] = temp;+
        
    }
    
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        // swap a and b 
        // swapInt(a,b);
        int temp = b;
        b = a;
        a = temp;
        System.out.println("a " + a);
        System.out.println("b " + b);
        
        int [] array = {1, 2, 3, 4, 5};
        System.out.println();
        swapArrayIndex(array, fristIndex: 0, secondIndex: 4)

    }

















}
