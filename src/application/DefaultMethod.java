package application;

interface DefaultMethodDemo {
    //int addTwoNumbers(int a, int b);
    default int addTwoNumbers(int a, int b) {
        return a + b;
    }
}

class One implements DefaultMethodDemo {
    //@Override
    //public int addTwoNumbers(int a, int b) {
        //return a + b;
    //}
}

class Two implements DefaultMethodDemo {
    //@Override
    //public int addTwoNumbers(int a, int b) {
        //return a + b;
    //}
}

public class DefaultMethod {

    public static void main(String[] args) {

        DefaultMethodDemo demo = new One();
        System.out.println(demo.addTwoNumbers(10, 10));

        DefaultMethodDemo demo1 = new Two();
        System.out.println(demo1.addTwoNumbers(15, 15));
    }
}
