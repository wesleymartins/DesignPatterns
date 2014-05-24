/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatternstp2.creational.singleton;

import java.util.Date;

/**
 *
 * @author Wesley
 */
public class Singleton {
    private static Singleton onlyOne;
    private Date d = new Date();
    
    private Singleton(){
        
    }
    
    public synchronized static Singleton instance(){
        if (onlyOne == null)
        {  onlyOne = new Singleton(); }
        return onlyOne;
    }
    public Date getDate(){
        return d;
    }
    
}
