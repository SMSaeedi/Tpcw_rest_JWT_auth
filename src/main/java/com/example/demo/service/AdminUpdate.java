package com.example.demo.service;


import com.example.demo.model.AdminUpdateInParams;
import com.example.demo.model.AdminUpdateOutParams;

import javax.jws.WebParam;

public interface AdminUpdate {

    void adminUpdate_Vx0( AdminUpdateInParams input);

    AdminUpdateOutParams adminUpdate_HardCode(AdminUpdateInParams input);

}