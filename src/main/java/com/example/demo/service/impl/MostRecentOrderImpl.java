package com.example.demo.service.impl;


import com.example.demo.model.GetMostRecentOrder_Vx0;
import com.example.demo.model.GetMostRecentOrder_VxA;
import com.example.demo.model.Order;
import com.example.demo.service.MostRecentOrder;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@Service
public class MostRecentOrderImpl implements MostRecentOrder {

    @Override
    public Order getMostRecentOrder_Vx0(String c_uname) {
        return new GetMostRecentOrder_Vx0().getMostRecentOrder(c_uname);
    }

    @Override
    public Order getMostRecentOrder_Vx0Test(String c_uname) {
        return new GetMostRecentOrder_Vx0().getMostRecentOrderTest(c_uname);
    }

    @Override
    public Order getMostRecentOrder_VxA(String c_uname) {
        return new GetMostRecentOrder_VxA().getMostRecentOrder(c_uname);
    }

}