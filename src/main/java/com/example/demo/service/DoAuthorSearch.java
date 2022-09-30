package com.example.demo.service;

import com.example.demo.model.Book;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

public interface DoAuthorSearch {

    public List<Book> doAuthorSearch_Vx0( String search_key);

    public List<Book> doAuthorSearch_Vx0Test( Book search_key);

    public List<Book> doAuthorSearch_VxA( String search_key);

}