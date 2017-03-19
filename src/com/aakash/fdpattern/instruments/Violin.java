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
public class Violin extends Instruments {

    @Override
    public void open() {
        System.out.println("Openning the Violin Case");
    }

    @Override
    public void play() {
        System.out.println("Playing the Violin");
    }

    @Override
    public void close() {
        System.out.println("Closing the Violin Case");
    }
    
}
