package application;

import java.util.function.Function;

public class FunctionAndThen {

    public static void main(String[] args) {

        Function<String, String> func1 = String::toUpperCase; //s -> s.toUpperCase();
        Function<String, String> func2 = s -> s + " World!".toUpperCase();

        System.out.println("Output of func1: " + func1.apply("Hello"));
        System.out.println("AndThen output: " + func1.andThen(func2).apply("Hello"));
        System.out.println();

        //Output of the first function will become input to the second function

        Function<Integer, Integer> func3 = n -> n + n;
        Function<Integer, Integer> func4 = n -> n * n;

        System.out.println("Function 3 'andThen' Function 4: " + func3.andThen(func4).apply(10));
        System.out.println("Function 3 'compose' Function 4: " + func3.compose(func4).apply(10));
    }
}
