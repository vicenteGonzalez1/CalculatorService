/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.service.qualifiers;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author alumne
 */
@RequestScoped
@Informal
public class InformalHellowWorldMessage implements Message {

    @Override
    public String get() {
        return "Hi World from informal";
    }
    
}
