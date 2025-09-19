package app;

import action.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        SimpleAction simpleAction = new action.SimpleAction() {
            @Override
            public String action() {
                return "Hello from action.SimpleAction!";
            }
        };

        System.out.println(simpleAction.action());
    }
}
