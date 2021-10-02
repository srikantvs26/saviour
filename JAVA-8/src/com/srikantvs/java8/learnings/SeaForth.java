package com.srikantvs.java8.learnings;

import java.util.ArrayList;
import java.util.List;

public class SeaForth {

	public static void main(String[] args) {
		
		List<String> players = new ArrayList<String>();
		players.add("Csec");
		// lets us see what happens if players is shared.
		
		List<String> madridPlayers = new ArrayList<String>();
		madridPlayers.add("Casemiro");
		madridPlayers.addAll(players);
		
		List<String> barcelonaPlayers = new ArrayList<String>();
		barcelonaPlayers.add("Xavi");
		barcelonaPlayers.addAll(players);
		
		System.out.println("players : "+players);
		System.out.println("madridPlayers : "+madridPlayers);
		System.out.println("barcelonaPlayers : "+barcelonaPlayers);
		
		testMe(players, madridPlayers, barcelonaPlayers);
		
	}
	
	private static void testMe(List<String> players, List<String> madridPlayers, List<String> barcelonaPlayers) {
		System.out.println("--------------------------testMe()-----------------------------------");
		players.add("Marcelo");
		System.out.println(madridPlayers);
		System.out.println(barcelonaPlayers);
		
	}
}
