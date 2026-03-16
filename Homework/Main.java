public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone("Apple");
        Phone p3 = new Phone("Samsung", "Galaxy S23");
        Phone p4 = new Phone("Google", "Pixel 8", 899.99);
        
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();

        System.out.println("Is p4 expensive? " + p4.isExpensive());

        p4.applyDiscount(10);
        p4.printInfo();

        p4.updatePrice(750);
        p4.printInfo();

        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator(5);

        System.out.println("=== calc1 ===");

        System.out.println("Add 10 + 5 = " + calc1.add(10,5));
        System.out.println("Subtract 10 - 5 = " + calc1.subtract(10,5));
        System.out.println("Multiply 10 * 5 = " + calc1.multiply(10,5));
        System.out.println("Divide 10 / 5 = " + calc1.divide(10,5));
        System.out.println("Add doubles 5.5 + 4.5 = " + calc1.add(5.5,4.5));
        System.out.println("Counter: " + calc1.counter);

        System.out.println();

        System.out.println("=== calc2 ===");
        
        System.out.println("Add 20 + 10 = " + calc2.add(20,10));
        System.out.println("Subtract 20 - 10 = " + calc2.subtract(20,10));
        System.out.println("Counter: " + calc2.counter);


    }

}