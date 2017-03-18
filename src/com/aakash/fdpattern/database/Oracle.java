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
public class Oracle extends Database {

    @Override
    public void open() {
        System.out.println("Oracle database is now Open");
    }

    @Override
    public boolean execute(String sql) {
        System.out.println("Execute SQL query: " + sql);
        return true;
    }

    @Override
    public void close() {
        System.out.println("Oracle database is now Closed");
    }
    
}
