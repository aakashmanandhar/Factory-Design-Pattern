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
public class Mazda extends Cars {

    @Override
    public void opendoor() {
        System.out.println("Opening the car door");
    }

    @Override
    public void drive() {
        System.out.println("Driving the car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car");
    }

    @Override
    public void againopendoor() {
        System.out.println("Opening the door");
    }

    @Override
    public void closedoor() {
        System.out.println("Closing the door");
    }
    
}
