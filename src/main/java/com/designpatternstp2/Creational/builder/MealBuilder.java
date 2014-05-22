/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.Creational.builder;

/**
 *
 * @author Wesley
 */
public interface MealBuilder {
 public void buildDrink();
 public void buildFood();
 public Meal getMeal();
}
