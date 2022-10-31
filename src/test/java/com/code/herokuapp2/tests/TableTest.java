package com.code.herokuapp2.tests;

import com.code.herokuapp2.pages.MainPage;
import com.code.herokuapp2.pages.TablePage;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class TableTest extends BaseTest{

    @Test
    public  void hashMapTest(){

        HashMap<String, String> map = new HashMap<>();
        map.put("Pon","Testing");
        map.put("Uto","Development");

        System.out.println(map.get("Pon"));

    }

    @Test
    public void readTestData(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openPages();
        mainPage.selectOption("Sortable Data Tables");

        TablePage tablePage = new TablePage(driver);
        List<HashMap<String, String>> tableMap = tablePage.getTableData("Email");
        System.out.println("TEST");
        System.out.println(tablePage.getCallData("First Name", 1));
        System.out.println(tablePage.getCallData("First Name", 2));
        System.out.println(tablePage.getCallData("Due", 2));
    }

}
