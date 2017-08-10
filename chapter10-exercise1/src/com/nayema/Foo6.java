package com.nayema;

public class Foo6 {
    int x = 12;

    public static void go(final int x) {
        System.out.println(x);
        //The use will be asked to set x. the instance variable x = 12 is never used.
    }
}
