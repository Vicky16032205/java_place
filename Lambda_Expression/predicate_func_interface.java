import java.util.function.*;

public class predicate_func_interface {
    public static void main(String[] args) {
        // Example 1 =>
        Predicate<Integer> pred = i -> (i>10);
        System.out.println(pred.test(25));

        // Example 2 =>
        Predicate<String> str = s -> (s.length() > 4);
        System.out.println(str.test("Vicky"));
        System.out.println(str.test("xyz"));

        // print names of people whose length is greater than 4 only.
        String[] names = {"David", "Larry", "John", "Smith", "Lora"};

        for(String name : names){
            if(str.test(name)){
                System.out.println(name);
            }
        }
    }
}


// Predicate is a pre-defined functional interface in java which contains one abstract method i.e, test(t) which takes some arguments (t) and returns a boolean value.
// it will always take one single arguments.
// use only when you had conditional checks in your code.


// Originally it is used like this ==>
    // interface Predicate(Datatype t){
        // public abstract boolean test(Datatype t);
    // }