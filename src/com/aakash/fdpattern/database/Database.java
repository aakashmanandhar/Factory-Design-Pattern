/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.fdpattern.database;

/**
 *
 * @author aakashm
 */
public abstract class Database {
    
    public void test(){
        System.out.println("Testing Database");
    }
    public abstract void open();
    public abstract boolean execute(String sql);
    public abstract void close();
    
}
