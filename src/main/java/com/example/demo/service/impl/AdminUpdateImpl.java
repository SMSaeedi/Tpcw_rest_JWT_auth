package com.example.demo.service.impl;

import com.example.demo.model.AdminUpdateInParams;
import com.example.demo.model.AdminUpdateOutParams;
import com.example.demo.model.AdminUpdate_Vx0;
import com.example.demo.service.AdminUpdate;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@Service
public class AdminUpdateImpl implements AdminUpdate {

    @Override
    public void adminUpdate_Vx0(AdminUpdateInParams input) {
        new AdminUpdate_Vx0().adminUpdate(input);
    }

    @Override
    public AdminUpdateOutParams adminUpdate_HardCode(AdminUpdateInParams input) {
        return new AdminUpdate_Vx0().hardCodeData(input);
    }
}