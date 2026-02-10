package Lab2;

public class IfStatementTest{
    public static boolean ifStatementTest(int n){
        if ( n % 2 == 0 ){
            return true;
        } else {
            return false;
        }
    }
    public static void testSwitchStatement(){
        int choice = 3;

        switch (choice) {
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("TWO ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            default:
                System.err.print("Default ");
            
        }
        
    }


     
    public static void main(String[] args) {
      System.out.println(ifStatementTest(4));
      testSwitchStatement();
    }

}







