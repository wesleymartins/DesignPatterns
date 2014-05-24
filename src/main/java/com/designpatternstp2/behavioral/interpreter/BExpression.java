/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.behavioral.interpreter;

/**
 *
 * @author Wesley
 */
public class BExpression extends Expression{

    @Override
    public void interpret(Context context) {
       String input = context.getInput();
     context.setInput(input.substring(1));
     context.setOutPut(context.getOutput()+"2");
    }
    
}
