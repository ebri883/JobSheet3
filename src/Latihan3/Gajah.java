/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author GokuJawa
 */
public class Gajah extends Hewan 
{
 public static void tetsClassMethod() 
    {
        System.out.println("The Class Method in Hewan...");
    }
    //meng-override method pada class Animal
    public void testInstanceMethod() 
    {
        System.out.println("The Instance Method in Gajah...");
    }
    
    public static void main(String[] args) 
    {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.tetsClassMethod();
        myHewan.testInstanceMethod();
    }
}
