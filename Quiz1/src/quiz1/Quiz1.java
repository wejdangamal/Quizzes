/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author wejdan
 */
public class Quiz1 {

    public static void main(String[] args) {
        Time time1=new Time();
         System.out.printf("%d:%d:%d%n",time1.getHour(),time1.getMinute(),time1.getSecond());
        Time time2 = new Time(555550000);
        System.out.printf("%d:%d:%d%n",time2.getHour(),time2.getMinute(),time2.getSecond());
    }
    
}
