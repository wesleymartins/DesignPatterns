/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.behavioral.mediator;

/**
 *
 * @author Wesley
 */
public class Buyer {
    Mediator mediator;
    String unitOfCurrency;
    
    public Buyer(Mediator mediator, String unitOfCurrency){
        this.mediator = mediator;
        this.unitOfCurrency = unitOfCurrency;
    }
    
    public boolean attemptToPurchase(float bid){
        return mediator.placeBid(bid, unitOfCurrency);
    }
}
