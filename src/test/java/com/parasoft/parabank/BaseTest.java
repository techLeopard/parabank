package com.parasoft.parabank;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;

abstract class BaseTest {

    public void setUp(){
        Configuration.browser = "firefox";
        Configuration.browserSize = "1280x920";
        Configuration.headless = false; // browser without user interface
        Configuration.fastSetValue = true; // sets value by javascript instead of using Selenium built-in "sendKey" function.
        Configuration.pageLoadStrategy = "eager"; // eager`: return after DOMContentLoaded fires
        Configuration.timeout = 20000; // timeout in milliseconds to fail the test (default: 4000 milliseconds)
    }

    @Before
    public void init(){
        setUp();
    }

    @After
    public void tearDown(){
        WebDriverRunner.closeWebDriver();
    }


}
