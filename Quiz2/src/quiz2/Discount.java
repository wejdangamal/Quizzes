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
public class Discount {
  
    private double goldService = 0.2;
    private double silverService=0.15;
    private double premiumService=0.1;
    private double goldProduct =0.1;
    private double silverProduct =0.1;
    private double premiumProduct =0.1;
    private double constantDiscountProduct=0.1;
   public double getdiscountservice(String customerType){
       
        if(customerType == "Gold"){
            return  goldService;
        }
        else if(customerType == "Silver"){
            return silverService;
        }
        else if(customerType == "Premium"){
            return premiumService;
        }
        else
            throw new IllegalArgumentException("Enter The True Type (Gold) || (Silver) || (Premium)");
    }
   public double getdiscountproduct(String customerType){
       if(customerType == "Gold"){
            return goldProduct;
        }
        else if(customerType == "Silver"){
            return silverProduct;
        }
        else if(customerType == "Premium"){
            return premiumProduct;
        }
        
        else
            throw new IllegalArgumentException("Enter The True Type (Gold) || (Silver) || (Premium)");
       
    }
}
