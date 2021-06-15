package application;

import entities.HelloInterface;
import entities.HelloInterfaceImple;

public class Main {

    public static void main(String[] args) {

        //Before Java 8:

        //HelloInterface helloInterface = new HelloInterfaceImple();
        //helloInterface.displayHello();

        //After Java 8:

        HelloInterface helloInterface = () -> System.out.println("Hello!");
        helloInterface.displayHello();
    }
}
