package com.bridgeit.datastructure;

import java.util.Arrays;

import com.bridgeit.linkedlist_methods.LinkedLt;
import com.bridgeit.linkedlist_methods.Ordered_methods;

import Utility.util;

public class Ordered {

	public static void main(String[] args) throws Exception{
		int num = 0;
		Ordered_methods<Integer> list = new Ordered_methods<Integer>(); 
		
		int[] array = Ordered_methods.nodeFileReading();
		
		for(int i = 0 ; i< array.length ; i++) {
			
			list.insertordered(array[i]);
			
		}
		System.out.println();
		//list.show();
		
		list.sort();
	
		System.out.println("sorted linked list");
		
		list.show();
		
		System.out.println("Enter a Number ");
		 num = util.printint();
		
		 if(list.searchNumbere(num)) {
			 list.remove(num);
			 list.sort();
			 System.out.println("updated list is");
			// list.show();
		 }
		 else {
			 list.insertordered(num);
			 list.sort();
			 System.out.println("updated list is");
			 //list.show();
		 }
		
		 String contentToWriteinFile = list.getArray(list);
		 System.out.println(contentToWriteinFile);
		 list.fileWriter(contentToWriteinFile);
		
		
		
		
		
		
	}
	
}
