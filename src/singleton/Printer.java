/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author TrangNguyen
 */
public class Printer {
    private static Printer instance;
    
    private Printer() {
    
    }
    
    //API
    public static Printer getInstance() {
        if(instance == null){
            instance = new Printer();
        }
        return instance;
    }
    
    public void connect() {
        
    }
}

class Employee {
    public void print() {
        Printer p = Printer.getInstance();
        p.connect();
    }
}
