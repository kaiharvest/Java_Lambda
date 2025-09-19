package app;

import action.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

//        SimpleAction simpleAction1 = new action.SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Indra";
//            }
//        };
//
//        System.out.println(simpleAction1.action("Indra"));
//
//        SimpleAction simpleAction2 = (String name) -> {
//            return "Indra";
//        };
//
//        System.out.println(simpleAction2.action("Indra"));

        SimpleAction simpleAction1 = (String name) -> {
            return "Hello" + name;
        };

        SimpleAction simpleAction2 = (name) -> {
            return "Hello" + name;
        };

        SimpleAction simpleAction3 = (String value) -> "Hello" + value;

        SimpleAction simpleAction4 = (value) -> "Hello" + value;

        SimpleAction simpleAction5 = value -> "Hello" + value;

    }
}
