package com.Interface;

public class Cricketer extends Player implements Batter,Bowler {
 
	private int runs;
	private int wicket;
	

	
	public Cricketer(int id, String name, int age, int matches_played, int runs, int wicket) {
		super(id, name, age, matches_played);
		this.runs = runs;
		this.wicket = wicket;
	}

	@Override
	public int getWicket() {
		
		
		return wicket;
	}

	@Override
	public int getRuns() {
		
		return runs;
	}

	@Override
	public void accept() {

		super.accept();
		
		System.out.println("Enter runs scored: ");
		runs = sc.nextInt();
		
		System.out.println("Enter wickets taken: ");
		wicket =sc.nextInt();
		
	}
	public void display()
	{
		System.out.println("Player's Id:  "+id);
		System.out.println("Player's name: "+name);
		System.out.println("Player's age:  "+age);
		System.out.println("Player's matches played:  "+matches_played);
		System.out.println("Player's runs:  "+runs);
		System.out.println("Player's wicket:  "+wicket);
	}
	
	


	
}
