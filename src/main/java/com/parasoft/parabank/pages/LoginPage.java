package com.parasoft.parabank.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    // Locators
    private final SelenideElement loginInput = $x("//input[@name='username']");
    private final SelenideElement passwordInput = $x("//input[@name='password']");
    private final SelenideElement loginButton = $x("//input[@value='Log In']");

    public LoginPage(String url){
        open(url);
    }


    // Methods
    public IndexPage login(String login, String password){
        loginInput.setValue(login);
        passwordInput.setValue(password);
        loginButton.click();
        return new IndexPage();
    }


}
