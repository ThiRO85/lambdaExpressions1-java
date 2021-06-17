package application;

import java.util.function.Consumer;

public class ConsumerInterface {

    public static void main(String[] args) {
        beforeJava8();
        afterJava8();
    }

    private static void beforeJava8() {
        displayUpperCase("Consumer Interface");
    }

    public static void displayUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    private static void afterJava8() {
        Consumer<String> consumer = str -> System.out.println(str.toUpperCase());
        consumer.accept("Consumer Interface");
    }
}
