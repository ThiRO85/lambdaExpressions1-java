package application;

import java.util.function.Supplier;

public class SupplierInterface {
    
    public static void main(String[] args) {
        beforeJava8();
        afterJava8();
    }

    private static void beforeJava8() {
        double realRate = getRealRate();
        System.out.println("Before Java 8: Real rate is " + realRate);
    }

    public static double getRealRate() {
        double realRate = 5.0; //Call webservice
        return realRate;
    }

    private static void afterJava8() {
        double realRate = 5.0; //Call webservice
        Supplier<Double> supplier = () -> realRate;
        System.out.println("After Java 8: Real rate is " + supplier.get());
    }
}
