package com.algorithm.controller;

import com.algorithm.AlgorithmApplication;
import com.algorithm.utils.MessageResult;
import com.algorithm.utils.Suggest;
import org.apache.catalina.connector.Request;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AlgorithmApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AdminControllerTest {

    @Autowired
    private AdminController adminController;

    @Before
    public void before(){
        System.out.println("Test started----------------------------");
    }

    @After
    public void after(){
        System.out.println("End of test----------------------------");
    }

    @Test
    public void home() {
        System.out.println("test home method ..............");
    }

    /**
     * Write the specified content to the file under the specified path.
     * str: The content of the file to be written.
     * The save file path is: D:\suggest You can view the saved file under this path
     */
    @Test
    public void saveSuggest() {
        String str = "My Name is LiHua";
        adminController.saveSuggest(str);
    }

    /**
     * Read the file under the specified path and encapsulate the content in the Suggest collection object and return
     * A Suggest object corresponds to a file
     * Read the file in the D:\suggest path
     */
    @Test
    public void getAllSuggest() {
        MessageResult allSuggest = adminController.getAllSuggest("");
        System.out.println(allSuggest);
        List<Suggest> lists = (List<Suggest>) allSuggest.getData();
        System.out.println(lists);
    }

    /**
     * Write the specified content to the log file of the specified path and return the saved file path
     * The saved file path is D: under disk
     */
    @Test
    public void saveLog() {
        String str = "Hello, I am a log file";
        MessageResult mr = adminController.saveLog(str);
        System.out.println(mr);
    }

    /**
     * Return the created results based on the number of men and women
     * manNum: Number of men
     * woMan: Number of women
     */
    @Test
    public void doCreate() {
        int manNum = 3;
        int woman = 3;
        MessageResult messageResult = adminController.doCreate(manNum, woman);
        Object data = messageResult.getData();  //Result data
        System.out.println(messageResult);
        System.out.println(data);
    }

}