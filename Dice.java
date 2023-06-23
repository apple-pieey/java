package javafestival;

import java.util.Random;

public class Dice {

	Random rd = new Random();
	int move = 0;

	public int diceRoll() {
		int dice1 = rd.nextInt(6) + 1;
		int dice2 = rd.nextInt(6) + 1;
		
		move += dice1 + dice2;
		System.out.println("주사위 결과는 " + (dice1 + dice2) + "입니다.");

		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}
	

}
