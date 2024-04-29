package com.Interface;

import java.util.Scanner;

public abstract class Player {
	
	int id;
	String name;
	int age;
	int matches_played;
	
	Scanner sc = new Scanner(System.in);
	
	public Player(int id, String name, int age, int matches_played) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.matches_played = matches_played;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMatches_played() {
		return matches_played;
	}

	public void setMatches_played(int matches_played) {
		this.matches_played = matches_played;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (matches_played != other.matches_played)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public void accept() {
	
		
		System.out.println("Enter player name: ");
		name = sc.nextLine();
		
		System.out.println("Enter player id: ");
		id = sc.nextInt();
		
		System.out.println("Enter player's age: ");
		age = sc.nextInt();
		
		System.out.println("Enter matches played by player: ");
		matches_played = sc.nextInt();

	}
	
	
	
	
	
}
