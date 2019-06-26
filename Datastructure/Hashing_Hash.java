package com.bridgeit.datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import com.bridgeit.linkedlist_methods.LinkedLt;

import Utility.util;

public class Hashing_Hash {



	
	public static LinkedLt<String> slot[] = new LinkedLt[11];

	public static String stringInput(String s) {
		System.out.print(s);
		String string = util.printstring();
		return string;
	}

	public static int hash(String str) {
		int index = Integer.parseInt(str) % 11;
		return index;
	}


	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path = "/home/user/integer.txt";

		for (int i = 0; i < 11; i++) {
			slot[i] = new LinkedLt<String>();
		}

		BufferedReader br = new BufferedReader(new FileReader(path));
		String str = br.readLine();
		System.out.println(str);
		String[] strA = str.split(" ");
		br.close();

		for (int i = 0; i < strA.length; i++) {
			int slotNum = hash(strA[i]);
			slot[slotNum].insertnode(strA[i]);
		}
		System.out.println();

		for (int i = 0; i < 11; i++) {
			System.out.print("Slot " + i + " : ");

			System.out.println();
         	slot[i].show();
			System.out.println();
			System.out.println();
		}

		String key = stringInput("enter the element to search:");
		int slotNumber = hash(key);
		boolean value = slot[slotNumber].searchWord(key);
		

		if (value) {
			System.out.println("element Found at slot " + slotNumber + " and deleted");
			slot[slotNumber].remove(key);
		} else {
			System.out.println("element not Found at slot " + slotNumber + " and added");
			slot[slotNumber].insertnode(key);
		}

		System.out.println();
		for (int i = 0; i < 11; i++) {
			System.out.println("Slot " + i + " :");
			System.out.println();
			slot[i].show();
			System.out.println();
		}

	}

}

