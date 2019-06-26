package com.bridgeit.objectprograms;

import com.bridgeit.linkedlist_methods.Queue;

public class Player extends Deck_Of_Cards {

	public static void main(String[] args) {
		
		Deck_Of_Cards deck = new Player();
		deck.getCards();
		deck.shuffle();
		
		 String[][] player = deck.distribution(4, 9);
		 
		
			int i=1;
			for(String[] card:player)
			{
				System.out.println();
				System.out.println("player : "+ (i++) + " cards : ");
				for(String str:card)
				{
					Queue queue = new Queue();
					queue.enQueue(str);
					System.out.print(str+" ");
				}
				System.out.println();
			}

	}

}
