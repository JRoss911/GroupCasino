package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.CasinoAccount;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class CasinoAccountTest {
    @Test
    public void casinoAccountConstructorTest(){
        String firstName = "Anthony";
        String lastName = "Pearson";
        Date birthDate = new Date("01/01/2000");
        String userName = "zip";
        String password = "ZipCode";

        Object actual = new CasinoAccount(firstName, lastName, birthDate, userName, password);

        Assert.assertTrue(actual instanceof CasinoAccount);
    }

    @Test
    public void casinoAccountGetFirstNameTest(){
        String firstName = "Anthony";
        String lastName = "Pearson";
        Date birthDate = new Date("01/01/2000");
        String userName = "zip";
        String password = "ZipCode";

        CasinoAccount account = new CasinoAccount(firstName, lastName, birthDate, userName, password);
        String actualFirstName = account.getFirstName();

        Assert.assertEquals(firstName, actualFirstName);
    }

    @Test
    public void casinoAccountGetLastNameTest(){
        String firstName = "Anthony";
        String lastName = "Pearson";
        Date birthDate = new Date("01/01/2000");
        String userName = "zip";
        String password = "ZipCode";

        CasinoAccount account = new CasinoAccount(firstName, lastName, birthDate, userName, password);
        String actualLastName = account.getLastName();

        Assert.assertEquals(lastName, actualLastName);
    }

    @Test
    public void casinoAccountGetBirthDateTest(){
        String firstName = "Anthony";
        String lastName = "Pearson";
        Date birthDate = new Date("01/01/2000");
        String userName = "zip";
        String password = "ZipCode";

        CasinoAccount account = new CasinoAccount(firstName, lastName, birthDate, userName, password);
        Date actualBirthDate = account.getBirthDate();

        Assert.assertEquals(birthDate, actualBirthDate);
    }

    @Test
    public void casinoAccountGetUserNameTest(){
        String firstName = "Anthony";
        String lastName = "Pearson";
        Date birthDate = new Date("01/01/2000");
        String userName = "zip";
        String password = "ZipCode";

        CasinoAccount account = new CasinoAccount(firstName, lastName, birthDate, userName, password);
        String actualUserName = account.getUserName();

        Assert.assertEquals(userName, actualUserName);
    }

    @Test
    public void casinoAccountGetPasswordTest(){
        String firstName = "Anthony";
        String lastName = "Pearson";
        Date birthDate = new Date("01/01/2000");
        String userName = "zip";
        String password = "ZipCode";

        CasinoAccount account = new CasinoAccount(firstName, lastName, birthDate, userName, password);
        String actualPassword = account.getPassword();

        Assert.assertEquals(password, actualPassword);
    }


}
