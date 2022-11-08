/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericapp;

import genericapp.Account.AccountType;

/**
 *
 * @author Tigo S Yoga
 */
public class GenericApp {

    
    public static void main(String[] args) {
        
        // Enum ==> Account.java
        // Start Enum        
        AccountType account = AccountType.DEPOSIT;
        System.out.println("Type: " + account.name()
        +"\nCode: " + account.getCode()
        +"\nRate: " + account.getRate());   
        // End Enum
        
        // Generic Class ==> Cell.java
        // Start Generic Class
        Cell<Integer> integerCell = new Cell<Integer>();
        Cell<String> stringCell = new Cell<String>();
        integerCell.setValue(1);
        stringCell.setValue("One");
        int num = integerCell.getValue();
        String str = stringCell.getValue();
        System.out.println("Integer Value: " + num);
        System.out.println("String Value : " + str);
        // End generic Class
        
        // Generic Method ==> GenericMethod.java
        // Start Generic Method
        GenericMethod gmc = new GenericMethod();
        Integer[] integerArray = {1, 2, 3};
        String[] stringArray = {"This","is","fun"};
        gmc.printArray(integerArray);
        gmc.printArray(stringArray); 
        // End Generic Method
    }
    
}
