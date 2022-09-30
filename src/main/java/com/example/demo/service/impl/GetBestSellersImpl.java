package com.example.demo.service.impl;

import com.example.demo.model.GetBestSellers_Vx0;
import com.example.demo.model.GetBestSellers_VxA;
import com.example.demo.model.ShortBook;
import com.example.demo.service.GetBestSellers;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;

@Service
public class GetBestSellersImpl implements GetBestSellers {

   @Override
   public List<ShortBook> getBestSellers_Vx0(String subject) {
       return new GetBestSellers_Vx0().getBestSellers(subject);
   }

   @Override
   public List<ShortBook> getBestSellers_Vx0Test(ShortBook subject) {
       return new GetBestSellers_Vx0().getBestSellersTest(subject);
   }

    @Override
    public List<ShortBook> getBestSellers_VxA(String subject) {
        return new GetBestSellers_VxA().getBestSellers(subject);
    }

}