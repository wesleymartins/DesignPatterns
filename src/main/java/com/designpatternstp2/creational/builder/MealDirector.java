/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.creational.builder;

/**
 *
 * @author Wesley
 */
public class MealDirector {
    
    private MealBuilder mealBuilder = null;
    
    public MealDirector(MealBuilder mealBuilder)
    {
        this.mealBuilder = mealBuilder;
    }
    
    public void ConstructMeal()
    {
        mealBuilder.buildDrink();
        mealBuilder.buildFood();
    }
    
    public Meal getMeal()
    {
        return mealBuilder.getMeal();
    }
}
