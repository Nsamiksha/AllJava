package com.bridgeit.objectprograms;

import java.util.Random;

public class Deck_Of_Cards {

private String[] suits= { "Hearts", "Clubs", "Diamonds", "Spades"};
			private String[] ranks= { "2", "3","4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
			private static String[] cards=new String[52];
			
			public static void main(String[] args) 
			{
				Deck_Of_Cards deck=new Deck_Of_Cards();
				deck.getCards();
				deck.shuffle();
				String player[][] = deck.distribution(4, 9);
				deck.display(player);
			}
			public String[] getCards()
			{
				int i=0;
				for(String suit:suits)
				{
					for(String card : ranks)
					{
						cards[i] = card + ":" + suit;
						i++;
					}
				}
				return cards;
			}
			public void shuffle()
			{
				Random rand=new Random();
				for(int i=0;i<cards.length;i++)
				{
					int index = rand.nextInt(52);
					String temp=cards[index];
					cards[index] = cards[i];
					cards[i] = temp;
				}
			}
			public String[][] distribution(int numOfPlayers, int numOfCards)
			{
				String player[][] = new String[numOfPlayers][numOfCards];
				int k=0;
				for(int i=0;i<numOfPlayers;i++)
				{
					for(int j=0;j<numOfCards;j++)
					{
						player[i][j] = cards[k];
						k++;
					}
				}
				return player;
			}
			public void display(String[][] player)
			{
				int i=1;
				for(String[] card : player)
				{
					System.out.println();
					System.out.println("player : " + (i++) + " cards : ");
					for(String str : card)
					{
						System.out.print(str + " ");
					}
					System.out.println();
				}
			
			}
			

		
			
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
