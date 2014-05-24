/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.behavioral;

import com.designpatternstp2.behavioral.mediator.AmericanSeller;
import com.designpatternstp2.behavioral.mediator.Buyer;
import com.designpatternstp2.behavioral.mediator.DollarConverter;
import com.designpatternstp2.behavioral.mediator.FrenchBuyer;
import com.designpatternstp2.behavioral.mediator.Mediator;
import com.designpatternstp2.behavioral.mediator.SwedishBuyer;
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
public class testMediator {
    
    public testMediator() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testMediator() {
     
         Mediator m = new Mediator();
         Buyer swedish = new SwedishBuyer(m);
         Buyer french = new FrenchBuyer(m);
         float sellingPriceInDollars = 10.0f;
         //AmericanSeller americanSeller = new AmericanSeller(m, sellingPriceInDollars);
         //DollarConverter dollarConverter = new DollarConverter(m);
         
         //float swedishBidInKronor = 55.0f;
         //float frenchBidInEuro = 70.0f;
           //assertTrue(swedish.attemptToPurchase(swedishBidInKronor));
          //assertTrue(french.attemptToPurchase(frenchBidInEuro));
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
