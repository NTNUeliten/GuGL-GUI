/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmg.gui;

import java.util.Scanner;



/**
 *
 * @author Olav Rune
 */
public class KeyboardInput extends Thread{
    
    
    
    public void run(){
        
        while(true){
    Scanner keyboard = new Scanner(System.in);
System.out.println("enter an integer");
String myint = keyboard.next();
        System.out.println(myint);

        }
    }
    
}
