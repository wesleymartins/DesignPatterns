/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.behavioral;

import com.designpatternstp2.behavioral.templatemethod.BurgerMeal;
import com.designpatternstp2.behavioral.templatemethod.CheeseBurgerMeal;
import com.designpatternstp2.behavioral.templatemethod.Meal;
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
public class testTemplateMethod {
    
    public testTemplateMethod() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testMeal() {
     Meal meal1 = new BurgerMeal();
     Meal meal2 = new CheeseBurgerMeal();
         assertEquals(meal1.doMeal(), " get burger cooking burger mmm cleaning");
         assertEquals(meal2.doMeal(), " get cheese cooking yumclean");
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
