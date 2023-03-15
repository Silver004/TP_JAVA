package com.tnsoft.annotations;

public class RunApplication {
    public static void main(String[] args) {
        Class x = DataBuilder.class;
        Developer y = (Developer) x.getDeclaredAnnotation(Developer.class);
        System.out.println(y);

    }
}
