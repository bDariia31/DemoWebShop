package de.demowebshop.tests;

import de.demowebshop.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test (enabled = false)
    public void newUserRegisterPositiveTest() {
        // 1 click on Register
        // 2 enter First name
        // 3 enter Last name
        // 4 enter Email
        // 5 enter password
        // 6 enter confirm password
        //  сравнение паролей??
        // 7 click on the 'Register' button

        //int i=(int)((System.currentTimeMillis()/1000)%3600);

        // Заполнение поля из 3х шагов 1.click (focus); 2.clear; 3.отправка значение (send)

        app.getUser().clickOnTheRegisterLink();
        app.getUser().fillRegisterForm("Dariia", "Testova", "dariiatest1@gmail.com", "Test123$");
        app.getUser().clickOnRegisterButton();
        Assert.assertTrue(app.getUser().isLogOutInHeaderPresent());

    }

}