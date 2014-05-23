/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.structural.bridge;

/**
 *
 * @author Wesley
 */
public abstract class Vehicle {
    Engine engine;
    int weightInKilos;
    
    public abstract String drive();
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    
    public String reportOnSpedd(int horsepower){
        int ratio = weightInKilos / horsepower;
        if(ratio < 3){
            return "fast";
        }
        else if ((ratio>=3)&& (ratio<8)){
        return "average";
    }
        else return "slow";
    }
}
