/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.myfirstwebapp.calculadora;

import javax.enterprise.util.AnnotationLiteral;

/**
 *
 * @author alumne
 */
public class OperationNameLiteral 
        extends AnnotationLiteral<OperationNamed> 
        implements OperationNamed {

    final String expectedName;
    
    public OperationNameLiteral(String name) {
        this.expectedName = name;
    }
    
    @Override
    public String value() {
        return this.expectedName;
    }
    
}
