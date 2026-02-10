package Lab2;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        // invoke a method
        method();
    }
    public static void method(){ // definition of method 
        String text = "apple mango banana";
        StringTokenizer tokenizer1 = new StringTokenizer(text);
        String first = tokenizer1.nextToken();
        System.out.println("count of tokens: " + tokenizer1.countTokens());
        String second = tokenizer1.nextToken();
        System.out.println("count of tokens: " + tokenizer1.countTokens());
        String third = tokenizer1.nextToken();
        System.out.println("count of tokens: " + tokenizer1.countTokens());
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        System.out.println("third; " + third);
        System.out.println("count of tokens: " + tokenizer1.countTokens());
        if (tokenizer1.hasMoreTokens()){
            tokenizer1.nextToken();
        }else {
            System.out.println("no more tokens left");
        }

        System.out.println("first: " + first);
        System.out.println("second: " + second);
        System.out.println("third: " + third);
    
    }


}
