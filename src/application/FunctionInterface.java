package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.function.Function;

public class FunctionInterface {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        beforeJava8(); //Without Function Functional Interface
        afterJava8(); //With Function Functional Interface

        sc.close();
    }

    private static void beforeJava8() {
        System.out.print("Enter dolar amount: ");
        int dolarAmount = sc.nextInt();
        double totalRealValue = convertDolarToReal(dolarAmount);
        System.out.println("From beforeJava8: " + dolarAmount + " dolares = " + totalRealValue + " reais");
    }

    private static double convertDolarToReal(Integer dolarAmount) {
        double realRate = 5.0; //Call webservice
        return realRate * dolarAmount;
    }

    private static void afterJava8() {
        System.out.print("Enter dolar amount: ");
        int dolarAmount = sc.nextInt();
        double realRate = 5.0; //Call webservice

        Function<Integer, Double> function = totalRealValue -> dolarAmount * realRate;
        System.out.println("From afterJava8: " + dolarAmount + " dolares = " + function.apply(dolarAmount) + " reais");

        //Function<T, R>
        //@param <T> the type of input to the function
        //@param <R> the type of result of the function
        //R apply(T t);
    }
}
