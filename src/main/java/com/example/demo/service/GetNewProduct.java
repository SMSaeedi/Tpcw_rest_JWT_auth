package com.example.demo.service;

import com.example.demo.model.ShortBook;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

public interface GetNewProduct {

    public List<ShortBook> getNewProducts_Vx0(String subject);

    public List<ShortBook> getNewProducts_Vx0Test( String subject);

    public List<ShortBook> getNewProducts_VxA( String subject);

}