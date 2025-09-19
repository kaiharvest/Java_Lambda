package app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {

        List<String> list = List.of("Indra", "Dwi", "Prabowo");

        for (var value : list) {
            System.out.println(value);
        }

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // Lambda
        list.forEach(value -> System.out.println(value));

        // Lambda method reference
        list.forEach(System.out::println);

    }
}
