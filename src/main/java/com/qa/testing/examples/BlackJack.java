package com.qa.testing.examples;

public class BlackJack {

	public static int play(int dealer, int player) {
		if (dealer > 21 && player > 21) {
			
			return 0;
			
		} else if (dealer > 21) {
			return player;
		} else if (player > 21) {
			return dealer;
		}
		
		return Math.max(dealer, player);
		
	}

	public static double add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}
