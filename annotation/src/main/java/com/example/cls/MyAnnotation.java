package com.example.cls;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by fupeidong on 2017/6/11.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface MyAnnotation {
    String value();
}
