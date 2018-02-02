/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.myfirstwebapp.interceptores;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.interceptor.InterceptorBinding;

/**
 * La anotacio es fa servir per indicar la clase que sigui interceptada
 * @Interceptor es fa servir per indicar que una clase es un interceptor
 * @author alumne
 */
@InterceptorBinding
@Target({TYPE, METHOD})
@Retention(RUNTIME)
public @interface Log {
}
