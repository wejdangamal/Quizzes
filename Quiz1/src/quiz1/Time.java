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
public class Time {
    private int hour;
    private int minute;
    private int second;
    private long time;
    
    public Time(){
        time = System.currentTimeMillis()/1000; 
    }
    public Time(long elapseTime){
        time=elapseTime/1000;
    }
    public Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    
    public void setTime(long elapseTime){
        time=elapseTime;
    }
    public int getHour(){
        return (int)(time / ( 60 * 60)) % 24;
    }
    public int getSecond(){
        return (int)(time / ( 60)) % 60;
    }
    public int getMinute(){
        return (int)(time ) % 60;
    }
}
