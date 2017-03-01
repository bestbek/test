package io.zensoft.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Myktybek on 1/30/17.
 */
@Retention(RetentionPolicy.RUNTIME)

@Target(value = ElementType.TYPE)
public @interface MyAnnotations {
    MyAnnotation[] value();
}
