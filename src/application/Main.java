package application;

interface Test {
    int addNumbers(int a, int b);
}

public class Main {

    public static void main(String[] args) {

        System.out.println("Start main");
        Test test = (x, y) -> {
            System.out.println("Inside lambda expression");
            return x + y;
        };

        System.out.println("Before calling addTwoNumbers method");
        addTwoNumbers(test);
        System.out.println("After calling addTwoNumbers method");
        System.out.println("End main");
    }

    public static void addTwoNumbers(Test test) {
        System.out.println("Start addTwoNumbers method");
        System.out.println("Sum of two numbers: " + test.addNumbers(10, 20));
        System.out.println("End addTwoNumbers method");
    }
}
