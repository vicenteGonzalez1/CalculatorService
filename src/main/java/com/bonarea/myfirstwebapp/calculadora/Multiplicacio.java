/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.myfirstwebapp.calculadora;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author alumne
 */
@RequestScoped
@OperationNamed("multiplicacio")
public class Multiplicacio extends Operation {

    @Override
    public int calculate(int num1, int num2) {
        return num1 * num2;
    }
}
