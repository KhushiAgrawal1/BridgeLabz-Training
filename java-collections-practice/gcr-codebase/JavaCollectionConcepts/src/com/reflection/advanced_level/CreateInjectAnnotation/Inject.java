package com.reflection.advanced_level.CreateInjectAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Make annotation available at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
}

