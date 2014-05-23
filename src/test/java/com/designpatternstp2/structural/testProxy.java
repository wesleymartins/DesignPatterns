/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.structural;

import com.designpatternstp2.structural.proxy.FastThing;
import com.designpatternstp2.structural.proxy.Proxy;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Wesley
 */
public class testProxy {
    
    public testProxy() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void proxytest() {
     Proxy proxy = new Proxy();
     FastThing fastThing = new FastThing();
     assertEquals(fastThing.sayHello(),"FastThing Hello ");
     assertEquals(proxy.sayHello(), "SlowThing Hello ");
          
     }


    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
