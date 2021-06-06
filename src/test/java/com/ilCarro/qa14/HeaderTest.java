package com.ilCarro.qa14;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTest extends TestBase {

    @Test
    public void searchTest() {
        wd.findElement(By.cssSelector("[href='/search']")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector(".search-sidebar__inner")));
    }

    @Test
    public void letTheCarWorkTest() {
        wd.findElement(By.cssSelector("[href='/car']")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector(".let-carwork-style_let_car__location__30BIh")));
    }

    @Test
    public void termsOfUseTest() {
        wd.findElement(By.cssSelector("[href='/terms']")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector(".container-full")));
    }

    @Test
    public void logInTest() {
        wd.findElement(By.cssSelector("[href='/login']")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector(".signup__fields")));
    }
}
