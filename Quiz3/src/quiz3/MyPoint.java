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
public class MyPoint {
    private double x;
    private double y;
    
    public MyPoint(){
       this(0,0);
    }
    public MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void sety(double y){
        this.y=y;
    }
    public double getX(){
        return x;
    }
     public double gety(){
        return y;
    }
    public double distance(double anotherX,double anotherY){
        
        return Math.sqrt(Math.pow( ( x - anotherX) , 2) + Math.pow( y - anotherY, 2) );
                
    }
    
    public double distance(MyPoint p){
        return Math.sqrt(Math.pow( (x - p.x ) , 2) + Math.pow(y - p.y, 2) );
    }
}
