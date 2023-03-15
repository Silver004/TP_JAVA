package com.tnsoft.annotations;

import java.lang.annotation.*;

//Retention policy specifies how long the annotation last, stays in the code, runtime ...
//Target will dictate which java element is the annotation used with, in the example Methods, classes and package
//To annotate a package we create a package-info.java file, and we annotate the desired package
//By default the annotation is not inherited, to enable it to be inherited we add the annotation @Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PACKAGE})
@Inherited
public @interface Developer {
    String name() default "dev";
    int exp() default 1;
}
