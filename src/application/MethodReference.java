package application;

interface StaticMethodReference {
    void helloMethodReference();
}

class SMRImplementation {
    static void helloMethodReference() {
        System.out.println("Hello static method reference!");
    }
}

public class MethodReference {

    public static void main(String[] args) {

        //StaticMethodReference methodReference = () -> SMRImplementation.helloMethodReference();
        StaticMethodReference methodReference = SMRImplementation::helloMethodReference;
        methodReference.helloMethodReference();
    }
}
