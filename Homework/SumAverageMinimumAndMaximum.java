
import java.util.Scanner;

public class SumAverageMinimumAndMaximum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int num = input.nextInt();

        int [] numbers = new int[num];

        System.out.println("Enter "   + num +  "integers:" );

        for (int i = 0 ; i < num ; i+=1) {
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        int min = numbers [0];
        int max = numbers [0];

        for (int i = 0 ; i < num ; i++  ) {

            sum  += numbers[i];

            if(numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max){
                max = numbers[i];
            }
        }

        double average = (double) sum / num;

        System.out.println("Sum = " + sum);
        System.out.println("Average = "  + average);
        System.out.println(" Minimum = " + min);
        System.out.println("Maximum = " + max);

        input.close();
    }
}