/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.structural.decorator;

/**
 *
 * @author Wesley
 */
public class LivingAnimal implements Animal{

    @Override
    public String describe() {
     return "living";
    }
    
}