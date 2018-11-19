/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodesignpattern;

/**
 *
 * @author TrangNguyen
 */
public class Logger {
    private static Logger logger;
    
    private Logger(){
    
    }
    
    public static Logger getInstance(){
        if(logger == null) {
            logger = new Logger();
        }
        return logger;
    }    
}
