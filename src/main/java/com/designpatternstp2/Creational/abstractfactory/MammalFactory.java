/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.Creational.abstractfactory;

import com.designpatternstp2.Creational.factorymethod.Animal;
import com.designpatternstp2.Creational.factorymethod.Cat;
import com.designpatternstp2.Creational.factorymethod.Dog;

/**
 *
 * @author Wesley
 */
public class MammalFactory extends SpeciesFactory{
 
    public Animal getAnimal(String type){
        if("Canine".equals(type))
            return new Dog();
        else
            return new Cat();
    }
}