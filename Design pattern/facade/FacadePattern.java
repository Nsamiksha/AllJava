package com.bridgeit.designpattern.facade;

import java.io.IOException;

import Utility.util;

public class FacadePattern {
	 private static int  choice;  
	    public static void main(String args[]) throws NumberFormatException, IOException{  
	        do{       
	            System.out.print("========= Mobile Shop ============ \n");  
	            System.out.print("            1. Redmi            \n");  
	            System.out.print("            2. Lenovo             \n");  
	            System.out.print("            3. onePlus           \n");  
	            System.out.print("            4. Exit.                     \n");  
	            System.out.print("Enter your choice: ");  
	              
	             
	            choice = util.printint();
	            ShopKeeper sk=new ShopKeeper();  
	              
	            switch (choice) {  
	            case 1:  
	                {   
	                  sk.redmiSale();
	                    }  
	                break;  
	       case 2:  
	                {  
	                  sk.lenovoSale();      
	                    }  
	                break;    
	       case 3:  
	                           {  
	                           sk.oneplusSale();      
	                           }  
	                   break;     
	            default:  
	            {    
	                System.out.println("Nothing You purchased");  
	            }         
	                return;  
	            }  
	              
	      }while(choice!=4);  
	   }  
}
