/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.service.alternatives;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alumne
 */
public class CustomerServiceImpl implements CustomerService {
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public List findAllCustomers() {
        Query query = em.createNamedQuery("Customer.findAll", Customer.class);
        return query.getResultList();
    }
    
}
