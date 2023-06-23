package javafestival;

import java.util.Random;

public class Dice {

	Random rd = new Random();
	int move = 0;
	int dice1;
	int dice2;
	public int diceRoll() {
		dice1 = rd.nextInt(6) + 1;
		dice2 = rd.nextInt(6) + 1;
		
		
		move += dice1 + dice2;
		System.out.println("     주사위 결과는 " + (dice1 + dice2) + "입니다.");
		System.out.println("========================================");
		
		
		
		
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}
	public int dicePlus() {
		return dice1 + dice2;

	}

}
