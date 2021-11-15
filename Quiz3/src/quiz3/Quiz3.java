/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3;

/**
 *
 * @author wejdan
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(4,2);
        MyPoint p2 = new MyPoint(1,3);
        System.out.println("Distance = "+ p1.distance(3, 6));
        System.out.println("Distance = "+ p1.distance(p2));
    }
    
}
