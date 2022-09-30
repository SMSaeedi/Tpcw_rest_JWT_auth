package com.example.demo.service.impl;


import com.example.demo.model.Customer;
import com.example.demo.model.GetCustomer_Vx0;
import com.example.demo.model.GetCustomer_VxA;
import com.example.demo.service.GetCustomer;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@Service
public class GetCustomerImpl implements GetCustomer {

    @Override
    public Customer getCustomer_Vx0(String UNAME) {
        return new GetCustomer_Vx0().getCustomer(UNAME);
    }

    @Override
    public Customer getCustomer_Vx0Test(Customer uname) {
        return new GetCustomer_Vx0().getCustomerTest(uname);
    }

    @Override
    public Customer getCustomer_VxA(String UNAME) {
        return new GetCustomer_VxA().getCustomer(UNAME);
    }
}