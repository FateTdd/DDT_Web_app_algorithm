package com.algorithm.controller;

import com.algorithm.AlgorithmApplication;
import com.algorithm.utils.EgsApplication;
import com.algorithm.utils.Man;
import com.algorithm.utils.Woman;
import org.apache.tomcat.websocket.WsSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.DeploymentException;
import javax.websocket.Session;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AlgorithmApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EgsServerTest {

    @Autowired
    private EgsServer egsServer;

//    @Autowired
//    private HttpServletRequest request;

    @Test
    public void match() {
    }

    /**
     * Get the code in each man according to the man array, and return it as a string
     */
    @Test
    public void getCodeStr() {
        Man man = new Man(2);
        Man man2 = new Man(5);
        Man[] mans = new Man[2];
        mans[0] = man;
        mans[1] = man2;
        String codeStr = egsServer.getCodeStr(mans);
        System.out.println(codeStr);

    }

}