package entities;

public class HelloImplementation implements HelloInterface {

    @Override
    public void displayHello() {
        System.out.println("Hello!");
    }
}
