/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.fdpattern;

import com.aakash.fdpattern.database.Database;
import com.aakash.fdpattern.database.DatabaseFactory;

/**
 *
 * @author aakashm
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatabaseFactory dbf = new DatabaseFactory();
        Database db = dbf.get("mysql");
        if (db != null) {
            db.test();
            db.open();
            db.execute("Select * from Tables");
            db.close();
        } else {
            System.out.println("Such Database is not Available!");
        }
    }

}
