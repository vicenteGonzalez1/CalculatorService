/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.myfirstwebapp.interceptores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumne
 */
@Log
public class BookShow implements Serializable {
    private static final long serialVersionUID = 1L;
    public List<String> getMoviesList(String gender) {
        System.out.println("getMoviesList() Method Starts Execution");
        List<String> moviesAvailable = new ArrayList<String>();
        moviesAvailable.add("12 Angry men");
        moviesAvailable.add("Kings speech");
        System.out.println("getMoviesList() method finish execution");
        return moviesAvailable;
    }
    public Integer getDiscountedPrice(int ticketPrice) {
        return ticketPrice - 50;
    }
    
}
