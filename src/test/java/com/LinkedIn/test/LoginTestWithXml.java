package com.LinkedIn.test;

import Utility.ReadPropertyXmlFile;
import base.BaseProgram;
import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class LoginTestWithXml extends BaseProgram {

    @Test
    public void Login() throws InterruptedException, DocumentException {
        ReadPropertyXmlFile config = new ReadPropertyXmlFile();

        driver.findElement(By.id(config.id)).sendKeys(config.Email);
        Thread.sleep(1000);

        driver.findElement(By.name(config.name)).sendKeys(config.Password);
        Thread.sleep(1000);

        driver.findElement(By.xpath(config.type)).click();
        Thread.sleep(100);

    }

}
