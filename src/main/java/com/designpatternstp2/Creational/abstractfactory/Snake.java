/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.Creational.abstractfactory;

import com.designpatternstp2.Creational.factorymethod.Animal;

/**
 *
 * @author Wesley
 */
public class Snake extends Animal{

   
    public String makeSound() {
        return "Hiss";
    }
    
}
