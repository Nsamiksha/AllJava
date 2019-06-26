package com.bridgeit.designpattern.facade;

public class ShopKeeper {
	private MobileShop redmi;  
    private MobileShop lenovo;  
    private MobileShop oneplus;  
      
    public ShopKeeper(){  
        redmi= new Redmi();  
        lenovo=new Lenovo();  
        oneplus=new OnePlus();  
    }  
    public void redmiSale(){  
    	redmi.modelNo();  
    	redmi.price();  
    }  
        public void lenovoSale(){  
        	lenovo.modelNo();  
        	lenovo.price();  
    }  
   public void oneplusSale(){  
	   oneplus.modelNo();  
	   oneplus.price();  
        }  

}
