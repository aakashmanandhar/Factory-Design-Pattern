/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.fdpattern.instruments;

/**
 *
 * @author aakashm
 */
public class InstrumentFactory {
    
    public Instruments get(String param){
        if(param.equalsIgnoreCase("violin")){
            return new Violin();
        }else if(param.equalsIgnoreCase("guitar")){
            return new Guitar();
        }
        return null;
    }
    
}
