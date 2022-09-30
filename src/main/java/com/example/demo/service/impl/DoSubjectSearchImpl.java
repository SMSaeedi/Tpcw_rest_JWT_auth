package com.example.demo.service.impl;

import com.example.demo.model.Book;
import com.example.demo.model.DoSubjectSearch_Vx0;
import com.example.demo.model.DoSubjectSearch_VxA;
import com.example.demo.service.DoSubjectSearch;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;

@Service
public class DoSubjectSearchImpl implements DoSubjectSearch {

    @Override
    public List<Book> doSubjectSearch_Vx0(String search_key) {
        return new DoSubjectSearch_Vx0().doSubjectSearch(search_key);
    }

    @Override
    public List<Book> doSubjectSearch_Vx0Test(Book search_key) {
        return new DoSubjectSearch_Vx0().doSubjectSearchTest(search_key);
    }

    @Override
    public List<Book> doSubjectSearch_VxA(String search_key) {
        return new DoSubjectSearch_VxA().doSubjectSearch(search_key);
    }

}