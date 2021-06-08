package com.ilCarro.qa14;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FooterTest extends TestBase {

    @Test
    public void footerTest() {
        jumpToFooter();
        wd.findElement(By.cssSelector(".active")).click();
        Assert.assertTrue(isFindCarFormPresent());
    }
}
