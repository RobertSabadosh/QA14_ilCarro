package com.ilCarro.qa14;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    //preconditions: user should be logged out
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isSignUpFormPresent()) {
            logout();
        }
    }

    @Test
    public void signUpTest() {
        click(By.cssSelector("[href='/signup']"));
        isLoginFormPresent();

        type(By.cssSelector("#first_name"), "Mats");
        type(By.cssSelector("#second_name"), "Hummels");
        type(By.cssSelector("#email"), "hummels1@gmail.com");
        type(By.cssSelector("#password"), "Hummels098765");

        click(By.cssSelector("#check_policy"));
        submit();
        Assert.assertTrue(isElementPresent(By.xpath("//ul[@class='header__nav desktop']/li[5]")));
    }

}
