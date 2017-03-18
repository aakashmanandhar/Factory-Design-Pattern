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
public class DatabaseFactory {
    
    public Database get(String param){
        
        
        if(param.equalsIgnoreCase("mysql")){
            return new MySql();
        }else if (param.equalsIgnoreCase("oracle")){
            return new Oracle();
        }else if (param.equalsIgnoreCase("postgresql")){
            return new PostGreSql();
        }else if (param.equalsIgnoreCase("sqlserver")){
            return new SqlServer();
        }
        return null;
    }
    
}
