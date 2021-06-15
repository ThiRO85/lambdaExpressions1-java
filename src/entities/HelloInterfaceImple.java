package entities;

public class HelloInterfaceImple implements HelloInterface {

    @Override
    public void displayHello() {
        System.out.println("Hello!");
    }
}
