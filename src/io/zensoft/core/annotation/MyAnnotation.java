package io.zensoft.core.annotation;

import java.lang.annotation.*;

/**
 * Created by Myktybek on 1/30/17.
 */
@Repeatable(MyAnnotations.class)
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    int value();
}
