/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.behavioral.chainofresponsibility;

/**
 *
 * @author Wesley
 */
public class EarthHandler extends PlanetHandler{
     public String handleRequest(PlanetEnum request){
        if(request== PlanetEnum.EARTH){
            return "earth";
        }
        else
            return successor.handleRequest(request);
    }
}
