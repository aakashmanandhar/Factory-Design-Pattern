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
public class Guitar extends Instruments {

    @Override
    public void open() {
        System.out.println("Opening the Guitar Case");
    }

    @Override
    public void play() {
        System.out.println("Playing Guitar");
    }

    @Override
    public void close() {
        System.out.println("Closing the Guitar Case");
    }
    
}
