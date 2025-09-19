package app;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {

        sayHello("Eko");

        String name =  null;
        sayHello(name);

    }

    public static void sayHello(String name) {

//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(value -> System.out.println("HELLO " + value),
//                        () -> System.out.println("HELLO"));

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");

        System.out.println("HELLO " + upperName);

//        Optional<String> optionalString = Optional.ofNullable(name);
//        Optional<String> optionalNameUpper = optionalString.map(String::toUpperCase);
//        optionalNameUpper.ifPresent(value -> System.out.println("helo " + value));

        // if check null
//        if(name != null) {
//            String nameUpper = name.toUpperCase();
//            System.out.println("Hello " + nameUpper);
//        }

    }

}
