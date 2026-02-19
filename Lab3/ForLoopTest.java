public class ForLoopTest {
    public static void firstForLoop(){
        for (int i =0; i<10; i++){
            System.out.println(i);
        }
        
    }
    public static void secondLoop(){
        //print from 0 to10;
        for (int i = 0 ; i<=10 ; i++){
            System.out.println(i);
        }
    
    }  
    public static void whileLoop(){
        int i = 0;
        //printfrom 0 to 10;
        while(i<=10){//condition
            System.out.println(i);
            i++; // update 
        }
    }
    public static void thirdForLoop(){
        int i = 0;
        for(;i<10; ){
            System.out.println(i);
            i++;
        }
    }
    static void ForLoopWithBreak(){
        for (int i = 0 ; i<=10 ; i++){
            System.out.println(i);
            if (i==5)break;
        } 
         // break will finish for loop
    }  
    static void ForLoopWithContinue(){
        for (int i = 0 ; i<=10 ; i++){
            if (i<5||i>7){ // && ||
                continue;
            }
            System.out.println(i);
        }   
    }
    
    public static void main(String[] args){
        //firstForLoop();
        //secondForLoop();
        //whileLoop();
        thirdForLoop();
        
    }









}


