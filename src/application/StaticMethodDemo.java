package application;

interface StaticMethodInterface {
    static void myUtilityMethod() { //Static method providing security by not allowing implementing classes...
        System.out.println("Static Method Interface"); //... to override static method functionality
    }
}

public class StaticMethodDemo {

    public static void main(String[] args) {
        StaticMethodInterface.myUtilityMethod();
    }
}
