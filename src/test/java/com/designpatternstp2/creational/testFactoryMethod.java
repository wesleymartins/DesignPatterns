/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.creational;

import com.designpatternstp2.creational.factorymethod.Animal;
import com.designpatternstp2.creational.factorymethod.AnimalFactory;
import org.testng.Assert;
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
public class testFactoryMethod {
    
    public testFactoryMethod() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestAnimalFactory() {
         AnimalFactory animFact = new AnimalFactory();
         
         Animal cats = animFact.getAnimal("Feline");
         
         Animal Dogs = animFact.getAnimal("Canine");
         
         Assert.assertEquals(Dogs.makeSound(), "Woof");
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
