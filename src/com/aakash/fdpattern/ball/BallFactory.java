/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.fdpattern.ball;

/**
 *
 * @author aakashm
 */
public class BallFactory {
    
    public Ball get(String param){
        
        if(param.equalsIgnoreCase("football")){
            return new Football();
        }else if (param.equalsIgnoreCase("basketball")){
            return new Basketball();
        }
        return null;
    }
    
}
