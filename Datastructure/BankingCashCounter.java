package com.bridgeit.datastructure;

import com.bridgeit.linkedlist_methods.Queue;

import Utility.util;

public class BankingCashCounter {
	public static void main(String[] args) {
		Queue<Integer> queue1 = new Queue<Integer>();

		System.out.println("Enter the number of people wants to be in queue");
		int line = util.printint();
		for (int i = 1; i <= line; i++) {
			queue1.enQueue(i);
		}
		System.out.println("people standing in a queue");
		queue1.show();

		int bankTotalCash = 100000;
		int q = queue1.size();
		// System.out.println(q);
		for (int k = 1; k <= q; k++) {
			int operation = queue1.print();

			if (operation == 1) {
				System.out.println("Enter the amount for deposit");

				int amtD = util.printint();

				bankTotalCash = bankTotalCash + amtD;

				queue1.deQueue();

				queue1.show();

				System.out.println("Updated Amount in Bank :" + bankTotalCash);
			}

			else {
				System.out.println("Enter the amount for withdraw");
				int amtW = util.printint();

				bankTotalCash = bankTotalCash - amtW;

				queue1.deQueue();

				queue1.show();

				System.out.println("Updated amount in Bank :" + bankTotalCash);
			}

		}

		/*
		 * queue1.enQueue(45); queue1.enQueue(25); queue1.enQueue(455);
		 * queue1.enQueue(453); queue1.enQueue(85); queue1.show(); queue1.deQueue();
		 * queue1.show(); boolean b = queue1.isEmpty(); System.out.println(b);
		 */
	}
}
