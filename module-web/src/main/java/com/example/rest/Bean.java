package com.example.rest;

import com.example.service.ExampleService;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Bean {
    @EJB
    ExampleService slave;

    public String whip(){
        return slave.whoAmI();
    }
}
