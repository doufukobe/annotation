package com.example.processor;

import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

import static javax.lang.model.element.Modifier.PRIVATE;

/**
 * Created by fupeidong on 2017/6/11.
 */

final class ClassValidator {

    static boolean isPrivate(Element annotatedClass)
    {
        return annotatedClass.getModifiers().contains(PRIVATE);
    }

    public static String getClassName(TypeElement classElement, String packageName) {
        int length = packageName.length() + 1;
        return classElement.getQualifiedName().toString().substring(length).replace(".", "$");
    }
}
