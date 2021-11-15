/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author wejdan
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Discount d =new Discount();
        
        System.out.println(d.getdiscountservice("Gold"));
         System.out.println(d.getdiscountproduct("Premium"));
    }
    
}
