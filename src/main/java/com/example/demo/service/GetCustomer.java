package com.example.demo.service;

import com.example.demo.model.Customer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

public interface GetCustomer {

    public Customer getCustomer_Vx0(String UNAME);

    public Customer getCustomer_Vx0Test( Customer UNAME);

    public Customer getCustomer_VxA( String UNAME);

}