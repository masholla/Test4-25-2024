package javaFinalCodingProject;

import java.util.*;

public class Player 
{
	public List<Card> hand = new ArrayList<Card>(); 
	public int score;
	public String name;
	
	//added this for extra info and for more accuracy on how war is normally played
	public List<Card> wonCards = new ArrayList<Card>();
	
	Player(String name)
	{
		this.name = name;
		clearScore();
	}
	
	public void draw(Deck deck)
	{
		hand.add(deck.draw());
	}

	public void describe()
	{
		System.out.println(this.name + "'s hand is: ");
		for(Card card : hand)
		{
			card.describe();
		}
		System.out.println();
	}

	public Card flip()
	{
		Card card = hand.get(0);
		hand.remove(0);
		return card;
	}

	public void incrementScore()
	{
		score++;
	}
	
	public void clearScore()
	{
		score = 0;
	}
	
	public void addWonCards(List<Card> cards)
	{
		for(Card card : cards)
		{
			wonCards.add(card);
		}
	}
	
	public List<Card> getHand() 
	{
		return hand;
	}

	public void setHand(List<Card> hand) 
	{
		this.hand = hand;
	}

	public int getScore() 
	{
		return score;
	}

	public void setScore(int score) 
	{
		this.score = score;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public List<Card> getWonCards() 
	{
		return wonCards;
	}

	public void setWonCards(List<Card> wonCards) 
	{
		this.wonCards = wonCards;
	}

}