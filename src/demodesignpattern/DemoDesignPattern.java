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
public class DemoDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        
        System.out.println(log1.hashCode());
        
    }
    
}
