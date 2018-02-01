/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.service.alternatives;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Alternative;

/**
 *
 * @author alumne
 */
@Alternative
public class CustomerServiceMock extends CustomerServiceImpl{

    @Override
    public List findAllCustomers() {
        List customerList=new ArrayList();
        customerList.add("Pepe");
        customerList.add("mario");
        return customerList;
    }
    
}
