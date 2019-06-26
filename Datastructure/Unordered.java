package com.bridgeit.datastructure;

import java.io.IOException;

import com.bridgeit.linkedlist_methods.LinkedLt;

import Utility.util;

public class Unordered {
	public static void main(String[] args) {
		LinkedLt<String> list = new LinkedLt<String>(); 
		
		String[] arr = LinkedLt.nodeFileReading();
		
		for (int i = 0; i < arr.length; i++) {
			list.insertnode(arr[i]);
		}
		list.show();
		
		System.out.println("Enter the word to search ");
		
		String word = util.printstring();
		
		boolean b = list.searchWord(word);
		
		if (b) {
			list.removel(word);
		} else {
			list.append(word);
		}
		// list.show();
		String contentToWriteinFile = list.getArray(list);
		
		System.out.println(contentToWriteinFile);
		
		list.fileWriter(contentToWriteinFile);

	}
}