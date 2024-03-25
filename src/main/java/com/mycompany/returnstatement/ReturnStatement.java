/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.returnstatement;

/**
 *
 * @author USER
 */
public class ReturnStatement {

    public static void main(String[] args) {
        String shouting = caps ("stop disturbing me");
         System.out.println(shouting);
        printAMessage();
       int sum =   addTwoNumbers(4,8 );
        System.out.println(sum);
        int[] bestArray = INeedMyArray(3,6,8);
        System.out.println(bestArray[0]);
        System.out.println(bestArray[1]);
        System.out.println(bestArray[2]);
    }
    
    public static void printAMessage() {
System.out.println("My first method");
}
    
    public static int addTwoNumbers(int a, int b) {
    return(a+b);
    }
    
    public static String caps(String s){
    return s.toUpperCase();
    }
            
    public static int[] INeedMyArray (int a, int b, int c) {
    int array[]= new int[3];
    array[0] = a; 
      array[1] = b;
        array[2] = c;
        return array;
    }
    
}
