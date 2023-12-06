/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafe_management_system.model;

/**
 *
 * @author Reji
 */
public class Calculate {

   private double tax;
private double subtotal; 
    
    public double getTax() {
        return calTax(subtotal);
    }

public double getTotal(){
return subtotal + getTax();
}    

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }


    private double calTax(double t) {
        if (t >= 10 && t <= 20) {
            tax = 0.5;
        } else if (t > 20 && t <= 40) {
            tax = 1.0;
        } else if (t > 40 && t <= 60) {
            tax = 2.0;
        } else if (t > 60 && t <= 80) {
            tax = 3.0;
        } else if (t > 80 && t <= 100) {
            tax = 4.0;
        } else if (t > 100 && t <= 150) {
            tax = 8.0;
        } else if (t > 150 && t <= 200) {
            tax = 10.0;
        } else if (t > 200) {
            tax = 15.0;
        }
        return tax;
    }

}
