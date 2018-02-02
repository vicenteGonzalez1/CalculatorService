package com.bonarea.service.qualifiers;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

/**
 * La anotacio es fa servir per indicar la clase que sigui interceptada
 * @Interceptor es fa servir per indicar que una clase es un interceptor
 * @author alumne
 */
@Qualifier
@Target({METHOD, TYPE, PARAMETER, FIELD})
@Retention(RUNTIME)
public @interface Informal {
}
