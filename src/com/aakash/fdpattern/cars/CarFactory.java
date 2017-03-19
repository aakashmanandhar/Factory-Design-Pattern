/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.fdpattern.cars;

/**
 *
 * @author aakashm
 */
public class CarFactory {
    
    public Cars get(String param){
       if (param.equalsIgnoreCase("mazda")){
           return new Mazda();
       }
       return null;
    }
    
}
