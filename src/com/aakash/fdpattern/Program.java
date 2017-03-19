/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.fdpattern;

import com.aakash.fdpattern.ball.Ball;
import com.aakash.fdpattern.ball.BallFactory;
import com.aakash.fdpattern.cars.CarFactory;
import com.aakash.fdpattern.cars.Cars;
import com.aakash.fdpattern.database.Database;
import com.aakash.fdpattern.database.DatabaseFactory;
import com.aakash.fdpattern.instruments.InstrumentFactory;
import com.aakash.fdpattern.instruments.Instruments;

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
        
        InstrumentFactory inf = new InstrumentFactory();
        Instruments in = inf.get("guitar");
        if(in != null){
            in.open();
            in.play();
            in.close();
        }else{
            System.out.println("There is no such instruments");
        }
        
        BallFactory bf = new BallFactory();
        Ball b = bf.get("baskedtball");
        if (b != null){
            b.play();
            b.get("Shoot the ball");
            b.score();
        }else{
            System.out.println("There are no such balls");
        }
        
        CarFactory cf = new CarFactory();
        Cars c = cf.get("dfd");
        if (c != null){
            c.opendoor();
            c.drive();
            c.stop();
            c.againopendoor();
            c.closedoor();
        }else{
            System.out.println("There are no such cars");
        }
    }

}
