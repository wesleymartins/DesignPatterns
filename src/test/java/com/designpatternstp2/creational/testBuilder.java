/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.creational;

import com.designpatternstp2.Creational.builder.ItalianMealBuilder;
import com.designpatternstp2.Creational.builder.Meal;
import com.designpatternstp2.Creational.builder.MealBuilder;
import com.designpatternstp2.Creational.builder.MealDirector;
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
public class testBuilder {
    
    public testBuilder() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void BuilderTest()
     {
         MealBuilder mealBuilder = new ItalianMealBuilder() {};
         MealDirector mealDirector = new MealDirector(mealBuilder);
         Meal meal = mealDirector.getMeal();
         Assert.assertEquals(meal, meal);
     
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
