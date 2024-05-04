package com.parasoft.parabank;

import com.parasoft.parabank.pages.IndexPage;
import com.parasoft.parabank.pages.LoginPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class LoginTest extends BaseTest{

    private final static String BASE_URL = "https://para.testar.org/parabank/index.htm";
    private final static String USERNAME = "john";
    private final static String PASSWORD = "demo";
    private final static String EXPECTED_USERNAME_TEXT = ("Welcome " + USERNAME + " " + "smith");


    @Test
    public void testLogin(){
        new LoginPage(BASE_URL)
                .login(USERNAME, PASSWORD);
        Assertions.assertTrue(EXPECTED_USERNAME_TEXT.equalsIgnoreCase(new IndexPage().getUsernameText()));
    }

}
