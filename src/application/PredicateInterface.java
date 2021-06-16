package application;

import org.jetbrains.annotations.Contract;

import java.util.function.Predicate;

public class PredicateInterface {

    public static void main(String[] args) {
        withoutPredicat();
        withPredicate();
    }

    private static void withoutPredicat() {
        System.out.println("From withoutPredicate");
        Integer transactionAmount = 200;
        if (isGreater(transactionAmount)) System.out.println("Transaction amount can't be greater than 100");
        else System.out.println("Transaction amount is less than 100, please proceed");
    }

    @Contract(pure = true)
    public static Boolean isGreater(Integer i) {
        return i > 100;
    }

    private static void withPredicate() {
        System.out.println("From withPredicate");
        Integer amount = 200;
        Predicate<Integer> p = transactionAmount -> true; //transactionAmount > 100;
        if (p.test(amount)) System.out.println("Transaction amount can't be greater than 100");
        else System.out.println("Transaction amount is less than 100, please proceed");
    }
}
