package javafestival;

import java.util.Scanner;
import com.ChanceSelect;
public class Chance {

	ChanceSelect c2 = new ChanceSelect();
	Scanner sc = new Scanner(System.in);
	Dice di = new Dice();
	int[] chance = { 0, 0, 0, 0, 0 }; // 찬스 개수를 저장하는 배열 --> 부활, 대리인, 오지랖, -10점,꽝 순
	private int chanceChoice; // 선택할 찬스의 번호를 받는 변수

	public void rollChance() { // 찬스돌리러가기
		System.out.println("찬스획득!!!!");
		c2.test();
		System.out.println("1.부활 2.대리인 3.오지랖 4.-10점 5.꽝");
		System.out.print("획득하신 찬스를 입력해주세요 >>");
		chanceChoice = sc.nextInt() - 1;
		if (chanceChoice ==4) {
		//10점감	
		}else {
		chance[chanceChoice]++;
		}
		di.dicePlus();
	}

	public void haveChance() { // 보유찬스
		System.out.println("====================");
		System.out.println("    현재 보유찬스");
		System.out.println("     1.부활" + chance[0]);
		System.out.println("     2.대리인" + chance[1]);
		System.out.println("     3.오지랖" + chance[2]);
		System.out.println("====================");
	}

	public void useChance(String[] str, int[] life) {
		System.out.print("사용할 찬스 번호를 입력해주세요>>");
		chanceChoice = sc.nextInt() - 1;
		if (chanceChoice == 0) {
			System.out.println("부활할 사람을 선택해주세요");
			chance[chanceChoice]--;
			for (int i = 0; i < str.length; i++) {
				System.out.print(i + 1 + "." + str[i] + " ");
			}
			int answer = sc.nextInt();
			life[answer - 1]++;
		} else if (chanceChoice == 1) {
			System.out.println("대리인 찬스 사용! 대리인 드가자~");
			chance[chanceChoice]--;
		} else if (chanceChoice == 2) {
			System.out.println("오지랖 찬스 사용! 1분동안 오지랖 떨어보자!");
			chance[chanceChoice]--;
		}
	}
}
