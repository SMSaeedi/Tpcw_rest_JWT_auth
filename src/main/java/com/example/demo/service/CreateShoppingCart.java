package com.example.demo.service;

import com.example.demo.model.Cart;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

public interface CreateShoppingCart {

    public Cart createShoppingCart_Vx0(
            Integer I_ID, List<String> ids, List<String> quantities, Integer SHOPPING_ID);

    public Cart createShoppingCart_VxA(
            Integer I_ID, List<String> ids, List<String> quantities, Integer SHOPPING_ID);
}