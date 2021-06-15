package application;

import java.util.Arrays;
import java.util.List;

public class Loop {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        //Before Java 8:

        for (Integer i : list) {
            System.out.println(i);
        }

        //After Java 8:

        list.forEach(System.out::println);
    }
}
