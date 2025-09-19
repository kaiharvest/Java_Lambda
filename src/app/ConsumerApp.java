package app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

        Consumer<String> customer = name -> System.out.println(name);

        customer.accept("Indra");

    }
}
