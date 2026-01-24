package de.demowebshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegisterPositiveTest() {
        // 1 click on Register
        // 2 enter First name
        // 3 enter Last name
        // 4 enter Email
        // 5 enter password
        // 6 enter confirm password
        //  сравнение паролей??
        // 7 click on the 'Register' button

        // Заполнение поля из 3х шагов 1.click (focus); 2.clear; 3.отправка значение (send)

        //1
        click(By.xpath("//a[@class='ico-register']"));
        //2
        type(By.name("FirstName"), "Dariia");
        //3
        type(By.name("LastName"), "Testova");
        //4
        type(By.name("Email"), "dariiatest1@gmail.com");
        //5
        type(By.name("Password"), "Test123$");
        //6
        type(By.name("ConfirmPassword"), "Test123$");
        //7
        click(By.xpath("//input[@id='register-button']"));


        Assert.assertTrue(isElementPresent(By.xpath("//a[@class='ico-logout']")));

    }

}