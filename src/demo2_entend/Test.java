/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2_entend;

/**
 *
 * @author TrangNguyen
 */
public class Test {
    public static void main(String[] args) {
        
        System.out.println("Print Class A");
        ClassA obj1 = new ClassA();
        obj1.demoMethodA();
        
        System.out.println("Print Class B");
        ClassB obj2 = new ClassB();
        obj2.demoMethodA();
        obj2.demomethodB();

        System.out.println("Object");
        int x = 10;
        ClassA obj = new ClassB();
        obj.demoMethodA();
    }
}
