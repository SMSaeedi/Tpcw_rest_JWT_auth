package com.example.demo.service.impl;


import com.example.demo.model.Book;
import com.example.demo.model.DoTitleSearch_Vx0;
import com.example.demo.model.DoTitleSearch_VxA;
import com.example.demo.service.DoTitleSearch;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;

@Service
public class DoTitleSearchImpl implements DoTitleSearch {

    @Override
    public List<Book> doTitleSearch_Vx0(String search_key) {
        return new DoTitleSearch_Vx0().doTitleSearch(search_key);
    }

    @Override
    public List<Book> doTitleSearch_VxA(String search_key) {
        return new DoTitleSearch_VxA().doTitleSearch(search_key);
    }

}