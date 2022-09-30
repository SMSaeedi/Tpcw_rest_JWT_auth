package com.example.demo.service;

import com.example.demo.model.ShortBook;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

public interface GetBestSellers {

    public List<ShortBook> getBestSellers_Vx0( String subject);

    public List<ShortBook> getBestSellers_Vx0Test( ShortBook subject);

    public List<ShortBook> getBestSellers_VxA( String subject);

}