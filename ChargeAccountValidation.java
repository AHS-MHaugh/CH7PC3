/**
 *Michael Haugh
 *CH7PC3 ChargeAccountValidation
 *AP CS
 *12-18-18
 */
package ch7pc3;

//Imports classes to be utilized.
import java.util.Arrays;
import java.util.Scanner;
import static java.util.Arrays.binarySearch;

public class ChargeAccountValidation {

    //Establishes the array of acceptable account numbers.
    final static int[] ACCOUNT_NUMS = {5658845, 4520125, 7895122, 8777541, 
    8451277, 1302850, 8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 
    1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
    
    
     public static void main(String[] args) {
    
    //Initial statement indicates that the user is to enter an account number.
    System.out.println("Please enter your charge account number.");         
       
    //Estabishes the scanner object and declares the account.
    Scanner kb = new Scanner(System.in);    
    int account;
    account = kb.nextInt();
    
    /*
    /Assigns the input a boolean value depending on the result of the 
    /accountValidation method.
    */
    boolean isValid = accountValidation(account);
    
    /*
    /If statement indicates what is to be printed out depending on if the
    /account number was found or not.
    */
    if (isValid == true){
           System.out.println("This account number is valid.");
        }
        else
        {
            System.out.println("This account number is not valid.");
        }
    
    }
     
    /*
    /accountValidation method determines if the input is located in the array
    /using the binarySearch method 
    */
    public static boolean accountValidation(int account){
        Arrays.sort(ACCOUNT_NUMS);
        int indexFound = binarySearch(ACCOUNT_NUMS, account);
       
        //If statement assigns a boolean value to the method
        if(indexFound < 0){
            return false;
        }
        else
        {
            return true;
        }
                       
    }

}
    

