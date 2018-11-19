/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3_interface;

/**
 *
 * @author TrangNguyen
 */
public class ClassB implements ClassA{

    @Override
    public void methodA() {
        System.out.println("A-MB");
    }
    
    public void methodB() {
        System.out.println("B-MB");
    }
   
}
