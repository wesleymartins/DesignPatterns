/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.structural.composite;

/**
 *
 * @author Wesley
 */
public class Leaf implements Component{
    
    private String name;
    public Leaf(String name) 
    {
    this.name=name;
    }
    @Override
    public String sayHello() {
        return "Hello "+ name;
    }

    @Override
    public String sayGoodbye() {
        return "Goodbye " + name;
    }
    
}