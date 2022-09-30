package com.example.demo.service.impl;

import com.example.demo.model.Cart;
import com.example.demo.model.CreateShoppingCart_Vx0;
import com.example.demo.model.CreateShoppingCart_VxA;
import com.example.demo.service.CreateShoppingCart;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;

@Service
public class CreateShoppingCartImpl implements CreateShoppingCart {

    @Override
    public Cart createShoppingCart_Vx0(Integer I_ID, List<String> ids, List<String> quantities, Integer SHOPPING_ID) {
        return new CreateShoppingCart_Vx0().createShoppingCart(I_ID, ids, quantities, SHOPPING_ID);
    }

    @Override
    public Cart createShoppingCart_VxA(Integer I_ID,List<String> ids,List<String> quantities,Integer SHOPPING_ID) {
        return new CreateShoppingCart_VxA().createShoppingCart(I_ID, ids, quantities, SHOPPING_ID);
    }
}