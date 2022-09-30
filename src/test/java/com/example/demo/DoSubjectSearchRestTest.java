package com.example.demo;

import com.example.demo.model.Book;
import com.example.demo.tokenConfig.Authentication;
import com.example.demo.tokenConfig.TokenAuthenticationController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DoSubjectSearchRestTest {

    private static final ObjectMapper om = new ObjectMapper();
    int randomServerPort;
    int timeout = 10_000;
    static String t;

    @Test
    public void test() {
        RestTemplate restTemplate = new RestTemplate();
        Book input = new Book();
        List<Book> bookList = new ArrayList<>();
        Authentication authInput = new Authentication();
        final String userName = "mmm7029";
        final String passWord = "137029@Sms";
        authInput.setUser(userName);
        authInput.setPassword(passWord);

        bookList.add(new Book("Pride and Prejudice", "Drama","Jane"));
        bookList.add(new Book("Little Dorit", "Period Darama","Charles"));
        bookList.add(new Book("Jane Eyre", "Romance","Emily"));
        bookList.add(new Book("Whethering heights", "Drama","Charlotte"));

        t = TokenAuthenticationController.getJWTToken(authInput);

        System.out.printf("Auth : " + authInput);
        authInput.setPassword("*******");
        printJSON(authInput);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", t);

        HttpEntity<String> entity = new HttpEntity( "Drama", headers);
        String url1 = "http://localhost:8889/doSubjectSearch_Vx0Test/";

        bookList = restTemplate.postForObject(url1, entity, List.class);

        System.out.printf("outPut : " + bookList);
        printJSON(bookList);
    }

    private static void printJSON(Object object) {
        String result;
        try {
            result = om.writerWithDefaultPrettyPrinter().writeValueAsString(object);
            System.out.println(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}