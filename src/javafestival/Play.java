package javafestival;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Play {

	final int MAX_TURN = 6;
	private int move = 0; // 薄仙 牒 呪
	private int turn = 1; // 郊訂 呪
	private int score = 0; // 得据 置曽 繊呪

	private int answer; // 識澱走研 脊径閤澗 痕呪
	

	int[] life = { 2, 2, 2, 2 }; // 得据税 鯉需聖 煽舌馬澗 壕伸
	
	String[] str = new String[4];

	Board bo = new Board();
	Dice di = new Dice();
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	Problem pr = new Problem();
	Chance ch = new Chance();
	CalScore cs;

	GameDAO dao = new GameDAO();

	ArrayList<ProblemVO> problemList = dao.problem();

	public Play(int m_teamno) {
		this.str = dao.m_name(m_teamno);
	}

	public int playing() {

		move = 0;

		for (int i = 0; i < bo.point.length; i++) {
			bo.point[i] = problemList.get(i).getPoint();
		}

		bo.boardLook(move);
		while (turn < (MAX_TURN)) {

			if(life[0] == 0 && life[1] == 0 && life[2] ==0 && life[3] ==0) {
				System.out.println("虞戚覗亜 蒸柔艦陥 蒋拭辞 紫遭啄壱 神室推!");
				System.out.print("1. 啄壱尽柔艦陥.");
				int an = sc.nextInt();
				if (an == 1) {
					for(int i= 0 ; i<life.length;i++) {
						life[i]++;
					}
				}
			}
			System.out.println("========================================");
			System.out.print("爽紫是研 閏軒形檎 1聖 脊径背爽室推. >> ");
			int playChoice = sc.nextInt();

			if (playChoice == 1) {

				move = di.diceRoll();

				if (di.dicePlus() == 7) {
					System.out.println("      777777   LUCKEY!!   77777");
					System.out.println("      7 爽紫是杯7戚 蟹人辞 濁什塙究! 7 ");
					System.out.println("      7777777777777777777777777");
					ch.rollChance();
				}
				if (move >= 38) {
					move -= 38;
					++turn;
					System.out.println("      ooooooooooooooooooooooo");
					System.out.println("      o 廃郊訂研 宜焼辞 濁什塙究! o");
					System.out.println("      ooooooooooooooooooooooo");
					ch.rollChance();
				}

				while (bo.getPoint(move) == "  O  ") {
					System.out.println("庚薦研 葱 切軒拭 亀鐸梅生艦 廃腰希 閏軒畏柔艦陥.");
					score += problemList.get(move).getScore() / 2;
					move = di.diceRoll();
					if (di.dicePlus() == 7) {
						System.out.println("      77777777   LUCKEY!!   77777777");
						System.out.println("      7 爽紫是杯7戚 蟹人辞 濁什塙究! 7 ");
						System.out.println("      777777777777777777777777777777");
						ch.rollChance();
					}
					if (move >= 38) {
						move -= 38;
						++turn;
						System.out.println("      ooooooooooooooooooooooo");
						System.out.println("      o 廃郊訂研 宜焼辞 濁什塙究! o");
						System.out.println("      ooooooooooooooooooooooo");
						ch.rollChance();
					}
				}

				while (bo.getPoint(move) == "world") {
					System.out.print("戚疑馬壱粛精 牒呪研 脊径背爽室推! >>");
					move += sc.nextInt();
					if (move >= 38) {
						move -= 38;
						++turn;
						System.out.println("      ooooooooooooooooooooooo");
						System.out.println("      o 廃郊訂研 宜焼辞 濁什塙究! o");
						System.out.println("      ooooooooooooooooooooooo");
						ch.rollChance();
					}
					bo.boardLook(move);
					di.setMove(move);

				}
				di.setMove(move); // 源毒 薪奄澗 五社球

				

				System.out.println(problemList.get(move).getPoint());

				bo.boardLook(move); // 左球毒 窒径馬澗 五社球
				ch.haveChance();
				System.out.println("    "+(turn) + "郊訂 亀澗掻!!");
				if (bo.getPoint(move) == "javaQ") {
					System.out.println("       VVVVVVVVVVVVVVVVVVVVVVVVVVVVV");
					System.out.println("      >切郊 訂戚戚戚綜! 姶偽淫還 訂綜 爽室推~<");
					System.out.println("       ささささささささささささささささささささ ");
					System.out.print("        1.塙究 2.叔鳶>>");
					int num1 = sc.nextInt();
					if (num1 == 1) {
						System.out.println("訂綜研 限仲辞 濁什塙究! ");
						ch.rollChance();
					}
				} else if (bo.getPoint(move) == "MoonQ") {
					System.out.println("       VVVVVVVVVVVVVVVVVVVVVVVVV");
					System.out.println("      >庚薦旋害切! 姶偽淫還 庚薦 爽室推~<");
					System.out.println("       ささささささささささささささささささ ");
					System.out.print("         1.塙究 2.叔鳶 >>");
					int num1 = sc.nextInt();
					if (num1 == 1) {
						System.out.println("庚薦研 限仲辞 濁什塙究! ");
						ch.rollChance();
					}
				} else if (bo.getPoint(move) == "drawi") {
					System.out.println("        V V V V V V V V V V V V V V V V V ");
					System.out.println("       > https://quickdraw.withgoogle.com <");
					System.out.println("       >        羨紗背辞 5鯵戚雌 失因馬奄!!     <");
					System.out.println("        ささささささささささささささささささささささささ ");
					System.out.print("             1.塙究 2.叔鳶 >>");
					int num1 = sc.nextInt();
					if (num1 == 1) {
						System.out.println("5鯵戚雌 失因背辞 濁什塙究! ");
						ch.rollChance();
					}
				} else if (bo.getPoint(move) == "speed") {
					System.out.println("        V V V V V V V V V V V V V V V  ");
					System.out.println("       > 慎展 捉精越展呪 汝液 150聖 角奄室推! <");
					System.out.println("        ささささささささささささささささささささ ");
					System.out.print("        1.塙究 2.叔鳶 >>");
					int num1 = sc.nextInt();
					if (num1 == 1) {
						System.out.println("慎展研 設団辞 濁什塙究! ");
						ch.rollChance();
					}
				} else {
					if (turn >= MAX_TURN) {
						break;
					} else {
						System.out.println("==============================================");
						System.out.println("                    鯉需 鯵呪");
						for (int i = 0; i < str.length; i++) {
							System.out.print(str[i] + "(");
							for (int j = 0; j < life[i]; j++) {
								System.out.print("⊂");
							}
							System.out.print(") ");
						}
						System.out.println(); 
						System.out.println("==============================================");// 鯉需 鯵呪 窒径馬澗 坪球

						pr.proNum(move); // 庚薦 窒径馬澗 五社球

						System.out.println("      濁什 紫遂馬獣畏柔艦猿?");
						System.out.print("       1.革 2.焼艦神 >>");
						answer = sc.nextInt();
						if (answer == 1) {
							ch.haveChance();
							ch.useChance(str,life);
						}
						while (true) {
							System.out.println("           刊亜祢蟹推?");
							for (int i = 0; i < str.length; i++) {
								System.out.print(i + 1 + "." + str[i] + " ");
							}
							answer = sc.nextInt();
							if (life[answer - 1] == 0) {
								System.out.println(" 益 紫寓精 鯉需戚 蒸嬢推!");
							} else {
								life[answer - 1]--;
								break;
							}
						}
						System.out.println("舛岩溌昔 1.限茶 2.匂奄 3.獣娃段引");
						answer = sc.nextInt(); // 庚薦研 限宙澗走 溌昔馬澗 坪球
						bo.boardLook(move, answer);
						if (answer == 1) {
							score += problemList.get(move).getScore();
						} else if (answer == 2) {
							score -= 17;
						} else if (answer == 3) {
							score -= 14;
						}

						System.out.println("辞匂斗 舛岩溌昔 限秩昔据 呪研 脊径馬獣神");
						answer = sc.nextInt(); // 限秩 辞匂斗税 呪研 溌昔馬澗 坪球
						score += (problemList.get(move).getScore() / (str.length - 1)) * answer;
						System.out.println("薄仙 恥 繊呪 : " + score);
					}
				}
			}
		}

		cs = new CalScore(score, bo, problemList);

		score = cs.cal();

		return score;

	}

	
	

}
