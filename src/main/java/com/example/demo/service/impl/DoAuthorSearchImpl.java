package com.example.demo.service.impl;

import com.example.demo.model.Book;
import com.example.demo.model.DoAuthorSearch_Vx0;
import com.example.demo.model.DoAuthorSearch_VxA;
import com.example.demo.service.DoAuthorSearch;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;

@Service
public class DoAuthorSearchImpl implements DoAuthorSearch {

    @Override
    public List<Book> doAuthorSearch_Vx0(String search_key) {
        return new DoAuthorSearch_Vx0().doAuthorSearch(search_key);
    }

    @Override
    public List<Book> doAuthorSearch_Vx0Test(Book search_key) {
        return new DoAuthorSearch_Vx0().doAuthorSearchTest(search_key);
    }

    @Override
    public List<Book> doAuthorSearch_VxA(String search_key) {
        return new DoAuthorSearch_VxA().doAuthorSearch(search_key);
    }

}