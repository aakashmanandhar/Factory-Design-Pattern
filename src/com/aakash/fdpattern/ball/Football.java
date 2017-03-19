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
public class Football extends Ball {

    @Override
    public void play() {
        System.out.println("Play with the football");
    }

    @Override
    public void get(String cmd) {
        System.out.println(cmd);
    }

    @Override
    public void score() {
        System.out.println("You have scored a goal");
    }

    
}
