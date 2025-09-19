package app;

import util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        // Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("indra"));
        System.out.println(predicateIsLowerCase.test("Indra"));

        // method preference parameter

        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Indra"));

    }

    public void run() {

        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("indra"));
        System.out.println(predicateIsLowerCase.test("Indra"));

    }

    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCase.test("indra"));
        System.out.println(predicateIsLowerCase.test("Indra"));

    }

    public boolean isLowerCase (String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }

}
