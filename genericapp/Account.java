/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericapp;

/**
 *
 * @author LENOVO
 */
public class Account {
    public enum AccountType {
    CURRENT("CU", 1.0),
    SAVINGS("SA", 2.0),
    DEPOSIT("DP", 3.0);
    private String code;
    private double rate;
    private AccountType(String code, double rate){
        this.code = code;
        this.rate = rate;

        }
    
    public String getCode() {
        return code;
        }//end method getCode
    public double getRate() {
        return rate;
        }//end method getRate
    }
}
