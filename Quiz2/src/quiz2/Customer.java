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
public class Customer {
    private String Cust_Name;
    private boolean IsMember;
    private String memberType;
    
    public Customer(String name,String type){
        Cust_Name=name;
        memberType=type;
    }
    public boolean ISaMemeber(String type){
        if( type=="Gold" || type=="Silver" || type=="premium" )
        return true;
        else
        return false;
    }
}
