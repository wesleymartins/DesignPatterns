/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.behavioral;

import com.designpatternstp2.behavioral.interpreter.AExpression;
import com.designpatternstp2.behavioral.interpreter.BExpression;
import com.designpatternstp2.behavioral.interpreter.Context;
import com.designpatternstp2.behavioral.interpreter.Expression;
import java.util.ArrayList;
import java.util.List;
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
public class testInterpreter {
    
    public testInterpreter() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
     public void hello() {
     String str = "ab"; 
     Context context = new Context(str); 
     
     List<Expression> list = new ArrayList(); 
     list.add(new AExpression()); 
     list.add(new BExpression());
     
      for(Expression ex : list) { 
        ex.interpret(context); 
     }
         assertEquals(context.getOutput(), "12");
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
