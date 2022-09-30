package com.example.demo.service;

import com.example.demo.model.Order;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

public interface MostRecentOrder {

    public Order getMostRecentOrder_Vx0(String c_uname);

    public Order getMostRecentOrder_Vx0Test( String c_uname);

    public Order getMostRecentOrder_VxA( String c_uname);

}