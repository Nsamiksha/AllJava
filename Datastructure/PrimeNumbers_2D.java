package com.bridgeit.datastructure;

import Utility.util;

public class PrimeNumbers_2D {
	
	public static void main(String[] args) {
		
		int[] prime = util.primenumbers();
		int[][] primenumbers = new int[10][26]; 
int first = 0, second = 0, third = 0, forth = 0, fifth = 0, sixth = 0, seventh =0, eighth = 0, nineth = 0, tenth = 0;
		
		for(int i = 0 ; i< prime.length ; i++ ) {
			
			if(prime[i]>0 && prime[i]<100) {
				primenumbers[0][first]=prime[i];
				first++;
				
			}
			else if(prime[i]>101 && prime[i]<200) {
				primenumbers[1][second]=prime[i];
				second++;
			}
			
			else if(prime[i]>201 && prime[i]<300) {
				primenumbers[2][third]=prime[i];
				third++;
			}
		
			else if(prime[i]>301 && prime[i]<400) {
				primenumbers[3][forth]=prime[i];
				forth++;
			}
		
		
			else if(prime[i]>401 && prime[i]<500) {
				primenumbers[4][fifth]=prime[i];
				fifth++;
			}
		
		
			else if(prime[i]>501 && prime[i]<600) {
				primenumbers[5][sixth]=prime[i];
				sixth++;
			}
		
		
			else if(prime[i]>600 && prime[i]<700) {
				primenumbers[6][seventh]=prime[i];
				seventh++;
			}
		
		
			else if(prime[i]>700 && prime[i]<800) {
				primenumbers[7][eighth]=prime[i];
				eighth++;
			}
			
			else if(prime[i]>800 && prime[i]<900) {
				primenumbers[8][nineth]=prime[i];
				nineth++;
			}
		
			else if(prime[i]>900 && prime[i]<1000) {
				primenumbers[9][tenth]=prime[i];
				tenth++;
			}
			
		}
		

		
		for(int i = 0; i < primenumbers.length ; i++ ) {
			for(int j = 0 ; primenumbers[i][j]!= 0 ; j++ ) {
				System.out.print(primenumbers[i][j] + " ");
		
			}
			System.out.println("\n");	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
