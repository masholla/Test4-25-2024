package javaFinalCodingProject;

import java.util.*;

public class Deck 
{
	List<Card> deck = new ArrayList<Card>();
	List<Card> originalDeck = new ArrayList<Card>();
	
	Deck()
	{
		String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
		String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		for(String suit : suits)
		{
			int count = 2;
			for(String name : names)
			{
				Card card = new Card(name, suit, count);
				this.originalDeck.add(card);
				count++; 
			}
		}
		deck = originalDeck;
	}
	
	public void describe()
	{
		for(Card card : this.deck)
		{
			card.describe();
		}
	}
	
	/*
	public List<Card> shuffle3(List<Card> deck)
	{
		List<Card> shuffle0 = new ArrayList<Card>();
		List<Card> shuffle1 = new ArrayList<Card>();
		List<Card> shuffle2 = new ArrayList<Card>();
		
		List<Card> rebuild = deck;
		
		//this is same as case, decides how shuffled the deck will be. whether to do once twice (technically between 3-9 times.
    	for(int i = 0; i < 3; i++)
    	{
    		//count is how we track which pile its shuffled to
    		int count = 0;
   		 
    		//sends each card 
            for(Card card : rebuild)
            {
            	//decides where the card goes
            	switch (count % 3)
            	{
            	case 0:
            		shuffle0.add(card);
            		break;
            		
            	case 1:
            		shuffle1.add(card);
            		break;
            		
            	case 2:
            		shuffle2.add(card);
            		break;
            	}
            	//iterates count to accurately send cards to different piles
           	 	count++;
            }
            
            //once all the cards are split, we need to clear the (rebuild) 
            rebuild.clear();
            
            //adding them back one pile at a time
            
            for(Card card : shuffle1)
            {
            	rebuild.add(card);
            }
            for(Card card : shuffle0)
            {
            	rebuild.add(card);
            }
            for(Card card : shuffle2)
            {
            	rebuild.add(card);
            }
            
            //clears the shuffle piles
            shuffle0.clear();
            shuffle1.clear();
            shuffle2.clear();
    	}
    	
    	return rebuild;
	}
	*/

	public void shuffle()
	{
		List<Card> deck = this.deck;
		//establishes 5 piles for splitting deck into, and one to put them back into
		List<Card> shuffle0 = new ArrayList<Card>();
		List<Card> shuffle1 = new ArrayList<Card>();
		List<Card> shuffle2 = new ArrayList<Card>();
		List<Card> shuffle3 = new ArrayList<Card>();
		List<Card> shuffle4 = new ArrayList<Card>();
		List<Card> rebuild = new ArrayList<Card>();
		
		//splits the deck into 5 piles at random
		for(Card card : deck)
		{
			double rand = Math.random() * 100;
			int temp = (int) rand;
			switch (temp % 5)
        	{
        	case 0:
        		shuffle0.add(card);
        		break;
        		
        	case 1:
        		shuffle1.add(card);
        		break;
        		
        	case 2:
        		shuffle2.add(card);
        		break;
        		
        	case 3:
        		shuffle2.add(card);
        		break;
        		
        	case 4:
        		shuffle2.add(card);
        		break;
        	}
		}
		
		//Rebuilds deck from shuffled piles
		for(Card card : shuffle0)
        {
        	rebuild.add(card);
        }
		for(Card card : shuffle1)
        {
        	rebuild.add(card);
        }
        for(Card card : shuffle2)
        {
        	rebuild.add(card);
        }
        for(Card card : shuffle3)
        {
        	rebuild.add(card);
        }
        for(Card card : shuffle4)
        {
        	rebuild.add(card);
        }
        
        //clears shuffled piles
        shuffle0.clear();
        shuffle1.clear();
        shuffle2.clear();
        shuffle3.clear();
        shuffle4.clear();
        
        //returns shuffled pile
        this.deck = rebuild;
	}
	
	public Card draw()
	{
		Card drew = this.deck.get(0);
		
		this.deck.remove(0);
		
		return drew;
	}

	
	public List<Card> getDeck() 
	{
		return deck;
	}
	

	public void setDeck(List<Card> deck) 
	{
		this.deck = deck;
	}
}
