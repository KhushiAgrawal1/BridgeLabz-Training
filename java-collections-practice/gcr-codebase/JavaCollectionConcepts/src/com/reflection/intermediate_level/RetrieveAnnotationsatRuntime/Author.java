package com.reflection.intermediate_level.RetrieveAnnotationsatRuntime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// RetentionPolicy.RUNTIME is required to access the annotation at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String name();
}
