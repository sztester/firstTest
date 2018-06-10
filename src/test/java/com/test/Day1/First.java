package com.test.Day1;

import org.testng.Assert;
import org.testng.annotations.*;

public class First {
    @BeforeTest
    public void BeforeTest()
    {
        System.out.println("这个是BeforeTest的注解");
    }
    @BeforeMethod
    public  void BeforeMethod()
    {
        System.out.println("这个是BeforeMethod的注解");
    }
    @Test
    public void Test()
    {
        System.out.println("这个是Test的注解");
        //Assert.assertEquals(1,2);
    }
    @AfterMethod
    public void AfterMethod()
    {
        System.out.println("这个是AfterMethod的注解");
    }
    @AfterTest
    public void AfterTest()
    {
        System.out.println("这个是AfterTest的注解");
    }

}
