package com.company;

public class FooBar {
    private final int integer;

    public FooBar(int integer) {
        this.integer = integer;
    }

    public String asString() {
        if(integer % 3 == 0) {
            return "Foo";
        } else if(integer % 5 == 0) {
            return "Bar";
        } else {
            return String.valueOf(integer);
        }
    }
}
