package com.example.demo.controller;


import com.example.demo.model.*;
import com.example.demo.service.impl.AdminUpdateImpl;
import com.example.demo.service.impl.CreateShoppingCartImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private AdminUpdateImpl adminUpdate = new AdminUpdateImpl();

    @RequestMapping("adminUpdate_Vx0")
    public void adminUpdate_Vx0(@RequestBody AdminUpdateInParams inParams) {
        new AdminUpdate_Vx0().adminUpdate(inParams);
    }

    @RequestMapping("adminUpdate_HardCode")
    public AdminUpdateOutParams adminUpdate_HardCode(@RequestBody AdminUpdateInParams inParams) {
        return adminUpdate.adminUpdate_HardCode(inParams);
    }
   // ==========================================================================================
   @RequestMapping("createNewCustomer_Vx0")
   public Customer createNewCustomer_Vx0(Customer cust) {
       return new CreateNewCustomer_Vx0().createNewCustomerTest(cust);
   }

    @RequestMapping("createNewCustomer_VxA")
    public Customer createNewCustomer_VxA(@RequestBody Customer cust) {
        return new CreateNewCustomer_VxA().createNewCustomer(cust);
    }

    @RequestMapping("createNewCustomer_Vx078")
    public Customer createNewCustomer_Vx078(@RequestBody Customer cust) {
        return new CreateNewCustomer_VxA().createNewCustomer(cust);
    }

    @RequestMapping("createNewCustomer_Vx103")
    public Customer createNewCustomer_Vx103(@RequestBody Customer cust) {
        return new CreateNewCustomer_VxA().createNewCustomer(cust);
    }

    @RequestMapping("createNewCustomer_Vx113")
    public Customer createNewCustomer_Vx113(@RequestBody Customer cust) {
        return new CreateNewCustomer_VxA().createNewCustomer(cust);
    }

    @RequestMapping("createNewCustomer_Vx132")
    public Customer createNewCustomer_Vx132(@RequestBody Customer cust) {
        return new CreateNewCustomer_VxA().createNewCustomer(cust);
    }
    //=================================================================================================
    private CreateShoppingCartImpl createShoppingCart = new CreateShoppingCartImpl();

    @RequestMapping("createShoppingCart_Vx0")
    public Cart createShoppingCart_Vx0(
            @RequestParam(name = "I_ID") Integer I_ID,
            @RequestParam(name = "ids") List<String> ids,
            @RequestParam(name = "quantities") List<String> quantities,
            @RequestParam(name = "SHOPPING_ID") Integer SHOPPING_ID) {
        return createShoppingCart.createShoppingCart_Vx0(I_ID, ids, quantities, SHOPPING_ID);
    }

    @RequestMapping("createShoppingCart_VxA")
    public Cart createShoppingCart_VxA(
            @RequestParam(name = "I_ID") Integer I_ID,
            @RequestParam(name = "ids") List<String> ids,
            @RequestParam(name = "quantities") List<String> quantities,
            @RequestParam(name = "SHOPPING_ID") Integer SHOPPING_ID) {
        return new CreateShoppingCart_VxA().createShoppingCart(I_ID, ids, quantities, SHOPPING_ID);
    }

    //======================================================================================
    @RequestMapping("doAuthorSearch_Vx0")
    public List<Book> doAuthorSearch_Vx0(@RequestBody String search_key) {
        return new DoAuthorSearch_Vx0().doAuthorSearch(search_key);
    }

    @RequestMapping("doAuthorSearch_Vx0Test")
    public List<Book> doAuthorSearch_Vx0Test(@RequestBody Book search_key) {
        return new DoAuthorSearch_Vx0().doAuthorSearchTest(search_key);
    }

    @RequestMapping("doAuthorSearch_VxA")
    public List<Book> doAuthorSearch_VxA( @RequestParam(name = "search_key") String search_key) {
        return new DoAuthorSearch_Vx0().doAuthorSearch(search_key);
    }
   // ==================================================================================
   @RequestMapping("doSubjectSearch_Vx0")
   public List<Book> doSubjectSearch_Vx0(@RequestBody String search_key) {
       return new DoSubjectSearch_Vx0().doSubjectSearch(search_key);
   }

    @RequestMapping("doSubjectSearch_Vx0Test")
    public List<Book> doSubjectSearch_Vx0Test(@RequestBody Book search_key) {
        return new DoSubjectSearch_Vx0().doSubjectSearchTest(search_key);
    }

    @RequestMapping("doSubjectSearch_VxA")
    public List<Book> doSubjectSearch_VxA(@RequestParam(name = "search_key") String search_key) {
        return new DoSubjectSearch_VxA().doSubjectSearch(search_key);
    }
   // ==========================================================================================
   @RequestMapping("doTitleSearch_Vx0")
   public List<Book> doTitleSearch_Vx0(@RequestParam(name = "search_key") String search_key) {
       return new DoTitleSearch_Vx0().doTitleSearch(search_key);
   }

    @RequestMapping("doTitleSearch_Vx0Test")
    public List<Book> doTitleSearch_Vx0Test(@RequestParam(name = "search_key") Book search_key) {
        return new DoTitleSearch_Vx0().doTitleSearchTest(search_key);
    }

    @RequestMapping("doTitleSearch_VxA")
    public  List<Book> doTitleSearch_VxA(@RequestParam(name = "search_key") String search_key) {
        return new DoTitleSearch_VxA().doTitleSearch(search_key);
    }
    //========================================================================================
    @RequestMapping("getBestSellers_Vx0")
    public List<ShortBook> getBestSellers_Vx0(@RequestParam(name = "subject") String subject) {
        return new GetBestSellers_Vx0().getBestSellers(subject);
    }

    @RequestMapping("getBestSellers_Vx0Test")
    public List<ShortBook> getBestSellers_Vx0Test(@RequestBody ShortBook subject) {
        return new GetBestSellers_Vx0().getBestSellersTest(subject);
    }

    @RequestMapping("getBestSellers_VxA")
    public List<ShortBook> getBestSellers_VxA(@RequestParam(name = "subject") String subject) {
        return new GetBestSellers_VxA().getBestSellers(subject);
    }

    //=====================================================================================
    @RequestMapping("getCustomer_Vx0")
    public Customer getCustomer_Vx0(@RequestParam(name = "c_uname") String c_uname) {
        return new GetCustomer_Vx0().getCustomer(c_uname);
    }

    @RequestMapping("getCustomer_Vx0Test")
    public Customer getCustomer_Vx0Test(@RequestBody Customer c_uname) {
        return new GetCustomer_Vx0().getCustomerTest(c_uname);
    }

    @RequestMapping("getCustomer_VxA")
    public Customer getCustomer_VxA(@RequestParam(name = "c_uname") String c_uname) {
        return new GetCustomer_VxA().getCustomer(c_uname);
    }
    //==========================================================================================
    @RequestMapping("getNewProducts_Vx0")
    public List<ShortBook> getNewProducts_Vx0(@RequestBody String subject) throws Exception {
        return new GetNewProducts_Vx0().getNewProducts(subject);
    }

    @RequestMapping("getNewProducts_Vx0Test")
    public List<ShortBook> getNewProducts_Vx0Test(@RequestBody String subject) throws Exception {
        return new GetNewProducts_Vx0().getNewProductsTest(subject);
    }

    @RequestMapping("getNewProducts_VxA")
    public List<ShortBook> getNewProducts_VxA(@RequestBody String subject) throws Exception {
        return new GetNewProducts_Vx0().getNewProducts(subject);
    }
   // =========================================================================================
   @RequestMapping("getPassword_Vx0")
   public String getPassword_Vx0(@RequestParam(name = "C_UNAME") String C_UNAME) {
       return new GetPassword_Vx0().getPassword(C_UNAME);
   }

    @RequestMapping("getPassword_Vx0Test")
    public String getPassword_Vx0Test(@RequestBody String C_UNAME) {
        return new GetPassword_Vx0().getPasswordTest(C_UNAME);
    }

    @RequestMapping("getPassword_VxA")
    public String getPassword_VxA(@RequestParam(name = "C_UNAME") String C_UNAME) {
        return new GetPassword_VxA().getPassword(C_UNAME);
    }
   // =====================================================================================
   @RequestMapping("getMostRecentOrder_Vx0")
   public Order getMostRecentOrder_Vx0(@RequestParam(name = "c_uname") String c_uname) {
       return new GetMostRecentOrder_Vx0().getMostRecentOrder(c_uname);
   }

    @RequestMapping("getMostRecentOrder_Vx0Test")
    public Order getMostRecentOrder_Vx0Test(@RequestBody String c_uname) {
        return new GetMostRecentOrder_Vx0().getMostRecentOrderTest(c_uname);
    }

    @RequestMapping("getMostRecentOrder_VxA")
    public Order getMostRecentOrder_VxA(@RequestParam(name = "c_uname") String c_uname) {
        return new GetMostRecentOrder_Vx0().getMostRecentOrder(c_uname);
    }
}