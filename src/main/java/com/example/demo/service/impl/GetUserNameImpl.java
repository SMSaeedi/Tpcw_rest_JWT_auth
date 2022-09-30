package com.example.demo.service.impl;

import com.example.demo.model.GetUsername_Vx0;
import com.example.demo.model.GetUsername_VxA;
import com.example.demo.service.GetUserName;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@Service
public class GetUserNameImpl implements GetUserName {

    @Override
    public String getUserName_Vx0(int C_ID) {
            return new GetUsername_Vx0().getUserName(C_ID);
    }

    @Override
    public String getUserName_Vx0Test(String C_ID) {
            return new GetUsername_Vx0().getUserNameTest(C_ID);
    }

    @Override
    public String getUserName_VxA(int C_ID) {
            return new GetUsername_VxA().getUserName(C_ID);
    }

}