package javaFinalCodingProject;

public class Card 
{ 
	public int value;
	public String name;
	public String suit;
	
	Card(String name, String suit, int value)
	{
		this.name = name;
		this.value = value;
		this.suit = suit;
	}
	
	
	public void describe()
	{
		
		System.out.println(this.name + " of " + this.suit + " with value -- " + this.value);
	}
	

	public int getValue() 
	{
		return value;
	}


	public void setValue(int value) 
	{
		this.value = value;
	}


	public String getName() 
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	public String getSuit() 
	{
		return suit;
	}


	public void setSuit(String suit) 
	{
		this.suit = suit;
	}
}
