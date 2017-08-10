package com.nayema;

public class Foo5 {
    static final int x = 12;

    public static void go(final int x) {
        System.out.println(x);
        //x = 12 is already set as final. User can't put a value.
    }
}
