package application;

import java.util.function.Function;

public class FunctionIdentity {

    public static void main(String[] args) {

        Function<String, String> func1 = Function.identity();
        System.out.println(func1.apply("Function.identity() test!"));

        Function<Boolean, Boolean> func2 = Function.identity();
        System.out.println(func2.apply(true));

        Function<Integer, Integer> func3 = Function.identity();
        System.out.println(func3.apply(10));
    }
}
