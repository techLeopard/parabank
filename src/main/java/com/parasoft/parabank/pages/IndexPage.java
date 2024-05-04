package com.parasoft.parabank.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class IndexPage {

    private final SelenideElement usernameText = $x("//div[@id='leftPanel']/p[contains(text(), '')]");

    public String getUsernameText(){
        return usernameText.getText();
    }


}
