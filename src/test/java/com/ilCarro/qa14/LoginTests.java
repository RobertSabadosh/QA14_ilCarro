package com.ilCarro.qa14;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        if (!isSignUpFormPresent()) {
            logout();
        }
    }

    @Test
    public void loginRegisteredUserPositiveTest() {
        //go to login page
        click(By.xpath("//ul[@class='header__nav desktop']/li[5]"));
        //fill login form
        type(By.cssSelector("[name='email']"), "hummels@gmail.com");
        type(By.name("password"), "Hummels098765");
        submit();
        isLogoutTabPresent();
        //assert user logged in
    }
}
