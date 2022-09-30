package com.example.demo.service.impl;


import com.example.demo.model.*;
import com.example.demo.service.CreateNewCustomer;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;

@Service
public class CreateNewCustomerImpl implements CreateNewCustomer {

    public Customer createNewCustomer_Vx0(Customer cust) {
        return new CreateNewCustomer_Vx0().createNewCustomerTest(cust);
    }

    public Customer createNewCustomer_VxA(Customer cust) {
        return new CreateNewCustomer_VxA().createNewCustomer(cust);
    }

    public Customer createNewCustomer_Vx078(Customer cust) {
        return new CreateNewCustomer_Vx078().createNewCustomer(cust);
    }

    public Customer createNewCustomer_Vx103(Customer cust) {
        return new CreateNewCustomer_Vx103().createNewCustomer(cust);
    }

    public Customer createNewCustomer_Vx113(Customer cust) {
        return new CreateNewCustomer_Vx113().createNewCustomer(cust);
    }

    public Customer createNewCustomer_Vx132(Customer cust) {
        return new CreateNewCustomer_Vx132().createNewCustomer(cust);
    }
}