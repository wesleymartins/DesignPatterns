/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.structural;

import com.designpatternstp2.structural.decorator.Animal;
import com.designpatternstp2.structural.decorator.GrowlDecorator;
import com.designpatternstp2.structural.decorator.LegDecorator;
import com.designpatternstp2.structural.decorator.LivingAnimal;
import com.designpatternstp2.structural.decorator.WingDecorator;
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
public class testDecorator {
    
    public testDecorator() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
      @Test
     public void decoratorT() {
     Animal animal= new LivingAnimal();
         assertEquals(animal.describe(), "living");
      animal= new LegDecorator(animal);
       assertEquals(animal.describe(), "living dance");
       animal= new WingDecorator(animal);
        assertEquals(animal.describe(), "living dance fly");
        animal = new GrowlDecorator(animal);
        animal = new GrowlDecorator(animal);
         assertEquals(animal.describe(), "living dance fly Grr Grr");
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
