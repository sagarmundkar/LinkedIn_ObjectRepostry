package com.LinkedIn.test;

import base.BaseProgram;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class LoginTest extends BaseProgram {

    /**
     * Create Properties file object to read property file
     *Load() used to load file into our script
     * getProperty() fetches the value of target key from property file
     */
    public static Properties pro;


    @Test
    public void LoginWithPropertyFile() throws InterruptedException, IOException {
        File src = new File("C:\\Users\\Administrator\\IdeaProjects\\ObjectRepostoryDemo\\src\\test\\resources\\config.properties");
        FileInputStream fis = new FileInputStream(src);
        pro = new Properties();
        pro.load(fis);


        driver.findElement(By.id(pro.getProperty("id"))).sendKeys(pro.getProperty("Email"));
        Thread.sleep(1000);

        driver.findElement(By.name(pro.getProperty("name"))).sendKeys(pro.getProperty("Password"));
        Thread.sleep(1000);

        driver.findElement(By.xpath(pro.getProperty("type"))).click();
        Thread.sleep(1000);

    }
}
