package com.Interface;
import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		Cricketer [] team = new Cricketer[11];
		int count =0;
		int choice ;
		
		do {
			System.out.println("*************************-MENU-*********************");
			System.out.println("0} Exit");
			System.out.println("1} Add Cricketer ");
			System.out.println("2} Display all Cricketers");
            System.out.println("3} Display sum of total runs scored");
			System.out.println("4} Display total wickets taken ");
			System.out.println("5} Display sum of all matches played");
			System.out.println("6} Display name of cricketers along with total matches played ");
			System.out.println("****************************************************");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			
			case 0: System.out.println("See ya!!....");
				break;
			
			case 1:	
				if(count<11) {
					team[count] = new Cricketer(count, null, count, count, count, count);
					team[count].accept();
					System.out.println("Cricketer added succuessfully...");
					count++;
				}
				else {
					System.out.println("Squad is full..! ");
				}
				break;
				
			case 2: 
				System.out.println("All cricketers: ");
				for(int i = 0;i<count;i++)
				{
					System.out.println("**************************************");
					team[i].display();
					System.out.println("**************************************");
				}
				break;
			case 3: displayTotalRuns(team,count);
			break;
			
			case 4: displayTotalWickets(team,count);
			break;
			
			case 5: displayTotalMatchesPlayed(team,count);
			break;
			
			case 6: displayCricketerDetails(team,count);
			break;
					
			default: System.out.println("Invalid choice..! ");
				break;
			}
				
		} while (choice!=0);
		
	}
	static void displayTotalRuns(Cricketer[] team,int count) {
		int totalRuns =0;
		for(int i = 0; i<count;i++)
		{
			totalRuns = totalRuns + team[i].getRuns();
		}
        System.out.println("Total runs scored by all players: " + totalRuns);

	}
	
	static void displayTotalWickets(Cricketer[] team,int count) {
		int totalWicket = 0;

		for(int i =0; i<count;i++)
		{
			totalWicket = totalWicket + team[i].getWicket();
			
		}
        System.out.println("Total Wickets taken by all players: " + totalWicket);

	}
	static void displayTotalMatchesPlayed(Cricketer [] team,int count)
	{
		int TotalMatchesPlayed = 0;
		for(int i=0;i<count;i++)
		{
			TotalMatchesPlayed = TotalMatchesPlayed +team[i].getMatches_played();
		}
        System.out.println("Total Wickets taken by all players: " + TotalMatchesPlayed);

	}
	static void displayCricketerDetails(Cricketer [] team,int count) 
	{
		for(int i=0;i<count;i++)
		{
			System.out.println("Cricketer's name: "+team[i].getName());
			System.out.println("Cricketer's no. of matches played: "+team[i].getMatches_played());
		}
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
