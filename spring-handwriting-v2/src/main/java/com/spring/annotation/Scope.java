package com.spring.annotation;

import com.spring.annotation.config.ScopeType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Scope {

    ScopeType scope() default ScopeType.SINGLETON;

}
