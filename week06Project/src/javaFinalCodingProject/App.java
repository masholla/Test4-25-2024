package javaFinalCodingProject;

import java.util.*;

public class App 
{

	public static void main(String[] args) 
	{
		//make an instance of Deck 
		Deck deck = new Deck();
		deck.describe();
		
		System.out.println();
		System.out.println();
		//shuffle deck
		deck.shuffle();
		deck.shuffle();
		deck.shuffle();
		deck.shuffle();
		deck.shuffle();
		deck.shuffle();
		deck.shuffle();
		deck.shuffle();
		deck.describe();
		
		System.out.println();
		System.out.println(deck.getDeck().size());
		System.out.println();
		//create players
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		//deals cards into players hands
		int deckSize = deck.getDeck().size();
		for(int i = 0; i < deckSize / 2; i++)
		{
			player1.draw(deck);
			player2.draw(deck);
		}
		
		player1.describe();
		player2.describe();
		
		System.out.println();
		System.out.println();
		
		//deck.describe();
		
		//System.out.println();
		//System.out.println();
		/*
		List<Card> pile = deck.getDeck();
		List<Card> player1Hand = new ArrayList<Card>();
		List<Card> player2Hand = new ArrayList<Card>();
		
		for(int i = 0; i < pile.size(); i++)
		{
			if(i % 2 == 0)
			{
				player1Hand.add(pile.get(i));
			}else
				if(i % 2 == 1)
				{
					player2Hand.add(pile.get(i));
				}
		}
		
		player1.setHand(player1Hand);
		player2.setHand(player2Hand);
		*/
		
		//players flip then compare cards 
		//whoever has the higher number wins the point, and the cards. 
		//if the cards have the same value, its a tie, and they flip again.
		List<Card> usedCards = new ArrayList<Card>();
		
		/*
		 * Ok, so around this point I learned that you can't use the list's size if you are going to be modifying
		 * or moving the contents of the list. So instead I made a variable set to the original size and used it 
		 * for the loops. handSize/deckSize
		 */
		int handSize = player1.hand.size();
		//System.out.println(handSize + " " + player2.hand.size());
		for(int i = 0; i < handSize; i++)
		{
			//each player flips a card
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			//finding the value of each card
			int play1val = player1Card.getValue();
			int play2val = player2Card.getValue();
			
			//the cards in usedCards will go to victory piles depending on who wins
			usedCards.add(player1Card);
			usedCards.add(player2Card);
			
			//compares cards, adds to winners score, and adds used cards to won cards
			System.out.println("player 1's card was: " + player1Card.getName() + " of " + player1Card.getSuit());
			System.out.println("player 2's card was: " + player2Card.getName() + " of " + player2Card.getSuit());
			
			if(play1val > play2val)
			{
				System.out.println("player 1 wins!");
				player1.incrementScore();
				player1.addWonCards(usedCards);
				usedCards.clear();
			}else
				if(play2val > play1val)
				{
					System.out.println("player 2 wins!");
					player2.incrementScore();
					player2.addWonCards(usedCards);
					usedCards.clear();
				}else
					if(play1val == play2val)
					{
						System.out.println("This round was a Tie!");
					}
			
			System.out.println();
			
			try 
			{
				Thread.sleep(250);
			} catch (InterruptedException e) 
			{
				System.out.println("This didn't work.");
				e.printStackTrace();
			}
			
		}
		
		System.out.println();
		
		//declare winner after x times
		if(player1.getScore() > player2.getScore())
		{
			System.out.print("The Winner is " + player1.getName() + " with a total score of " + player1.getScore());
			System.out.println(" after winning " + player1.getWonCards().size() + " cards total.");
		}else 
			if(player2.getScore() > player1.getScore())
			{
				System.out.print("The Winner is " + player2.getName() + " with a total score of " + player2.getScore());
				System.out.println(" after winning " + player2.getWonCards().size() + " cards total.");
			}else
			{
				System.out.print("The Winner is: Nobody! The score is tied with " + player2.getName() + " at ");
				System.out.println(player1.getScore() + " and player 2 at " + player2.getScore());
			}
		
		
		
		System.out.println(numsRhere(5));
	}
	
	
	public static String numsRhere(int num)
	{
		StringBuilder word = new StringBuilder();
		while(num >= 0)
		{
			word.append(num--);
		}
		return word.toString();
	}
	
	
	
	
	

}
