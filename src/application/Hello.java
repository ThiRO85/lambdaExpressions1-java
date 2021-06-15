package application;

import entities.HelloInterface;

public class Hello {

    public static void main(String[] args) {

        //Before Java 8:

        //HelloInterface helloInterface = new HelloImplementation();
        //helloInterface.displayHello();

        //After Java 8:

        HelloInterface helloInterface = () -> System.out.println("Hello!");
        helloInterface.displayHello();
    }
}
