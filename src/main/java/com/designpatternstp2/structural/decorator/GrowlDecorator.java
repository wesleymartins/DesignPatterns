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
public class GrowlDecorator extends AnimalDecorator{
    public GrowlDecorator(Animal animal){
    super(animal);
    }

    @Override
    public String describe() {
       return animal.describe()+ growl();
       
    }
    public String growl(){
        return " Grr";
    }
}