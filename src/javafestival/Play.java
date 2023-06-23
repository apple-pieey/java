package javafestival;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Play {

	final int MAX_TURN = 6;
	private int move = 0; // ���� ĭ ��
	private int turn = 1; // ���� ��
	private int score = 0; // ���� ���� ����

	private int answer; // �������� �Է¹޴� ����
	

	int[] life = { 2, 2, 2, 2 }; // ������ ����� �����ϴ� �迭
	
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
				System.out.println("�������� �����ϴ� �տ��� ������� ������!");
				System.out.print("1. ���Խ��ϴ�.");
				int an = sc.nextInt();
				if (an == 1) {
					for(int i= 0 ; i<life.length;i++) {
						life[i]++;
					}
				}
			}
			System.out.println("========================================");
			System.out.print("�ֻ����� �������� 1�� �Է����ּ���. >> ");
			int playChoice = sc.nextInt();

			if (playChoice == 1) {

				move = di.diceRoll();

				if (di.dicePlus() == 7) {
					System.out.println("      777777   LUCKEY!!   77777");
					System.out.println("      7 �ֻ�����7�� ���ͼ� ����ȹ��! 7 ");
					System.out.println("      7777777777777777777777777");
					ch.rollChance();
				}
				if (move >= 38) {
					move -= 38;
					++turn;
					System.out.println("      ooooooooooooooooooooooo");
					System.out.println("      o �ѹ����� ���Ƽ� ����ȹ��! o");
					System.out.println("      ooooooooooooooooooooooo");
					ch.rollChance();
				}

				while (bo.getPoint(move) == "  O  ") {
					System.out.println("������ Ǭ �ڸ��� ���������� �ѹ��� �����ڽ��ϴ�.");
					score += problemList.get(move).getScore() / 2;
					move = di.diceRoll();
					if (di.dicePlus() == 7) {
						System.out.println("      77777777   LUCKEY!!   77777777");
						System.out.println("      7 �ֻ�����7�� ���ͼ� ����ȹ��! 7 ");
						System.out.println("      777777777777777777777777777777");
						ch.rollChance();
					}
					if (move >= 38) {
						move -= 38;
						++turn;
						System.out.println("      ooooooooooooooooooooooo");
						System.out.println("      o �ѹ����� ���Ƽ� ����ȹ��! o");
						System.out.println("      ooooooooooooooooooooooo");
						ch.rollChance();
					}
				}

				while (bo.getPoint(move) == "world") {
					System.out.print("�̵��ϰ���� ĭ���� �Է����ּ���! >>");
					move += sc.nextInt();
					if (move >= 38) {
						move -= 38;
						++turn;
						System.out.println("      ooooooooooooooooooooooo");
						System.out.println("      o �ѹ����� ���Ƽ� ����ȹ��! o");
						System.out.println("      ooooooooooooooooooooooo");
						ch.rollChance();
					}
					bo.boardLook(move);
					di.setMove(move);

				}
				di.setMove(move); // ���� �ű�� �޼ҵ�

				

				System.out.println(problemList.get(move).getPoint());

				bo.boardLook(move); // ������ ����ϴ� �޼ҵ�
				ch.haveChance();
				System.out.println("    "+(turn) + "���� ������!!");
				if (bo.getPoint(move) == "javaQ") {
					System.out.println("       VVVVVVVVVVVVVVVVVVVVVVVVVVVVV");
					System.out.println("      >�ڹ� ����������! �������� ���� �ּ���~<");
					System.out.println("       ���������������������������������������� ");
					System.out.print("        1.ȹ�� 2.����>>");
					int num1 = sc.nextInt();
					if (num1 == 1) {
						System.out.println("��� ���缭 ����ȹ��! ");
						ch.rollChance();
					}
				} else if (bo.getPoint(move) == "MoonQ") {
					System.out.println("       VVVVVVVVVVVVVVVVVVVVVVVVV");
					System.out.println("      >����������! �������� ���� �ּ���~<");
					System.out.println("       ������������������������������������ ");
					System.out.print("         1.ȹ�� 2.���� >>");
					int num1 = sc.nextInt();
					if (num1 == 1) {
						System.out.println("������ ���缭 ����ȹ��! ");
						ch.rollChance();
					}
				} else if (bo.getPoint(move) == "drawi") {
					System.out.println("        V V V V V V V V V V V V V V V V V ");
					System.out.println("       > https://quickdraw.withgoogle.com <");
					System.out.println("       >        �����ؼ� 5���̻� �����ϱ�!!     <");
					System.out.println("        ������������������������������������������������ ");
					System.out.print("             1.ȹ�� 2.���� >>");
					int num1 = sc.nextInt();
					if (num1 == 1) {
						System.out.println("5���̻� �����ؼ� ����ȹ��! ");
						ch.rollChance();
					}
				} else if (bo.getPoint(move) == "speed") {
					System.out.println("        V V V V V V V V V V V V V V V  ");
					System.out.println("       > ��Ÿ ª����Ÿ�� ��� 150�� �ѱ⼼��! <");
					System.out.println("        ���������������������������������������� ");
					System.out.print("        1.ȹ�� 2.���� >>");
					int num1 = sc.nextInt();
					if (num1 == 1) {
						System.out.println("��Ÿ�� ���ļ� ����ȹ��! ");
						ch.rollChance();
					}
				} else {
					if (turn >= MAX_TURN) {
						break;
					} else {
						System.out.println("==============================================");
						System.out.println("                    ��� ����");
						for (int i = 0; i < str.length; i++) {
							System.out.print(str[i] + "(");
							for (int j = 0; j < life[i]; j++) {
								System.out.print("��");
							}
							System.out.print(") ");
						}
						System.out.println(); 
						System.out.println("==============================================");// ��� ���� ����ϴ� �ڵ�

						pr.proNum(move); // ���� ����ϴ� �޼ҵ�

						System.out.println("      ���� ����Ͻðڽ��ϱ�?");
						System.out.print("       1.�� 2.�ƴϿ� >>");
						answer = sc.nextInt();
						if (answer == 1) {
							ch.haveChance();
							ch.useChance(str,life);
						}
						while (true) {
							System.out.println("           ����Ǫ����?");
							for (int i = 0; i < str.length; i++) {
								System.out.print(i + 1 + "." + str[i] + " ");
							}
							answer = sc.nextInt();
							if (life[answer - 1] == 0) {
								System.out.println(" �� ����� ����� �����!");
							} else {
								life[answer - 1]--;
								break;
							}
						}
						System.out.println("����Ȯ�� 1.���� 2.���� 3.�ð��ʰ�");
						answer = sc.nextInt(); // ������ ������� Ȯ���ϴ� �ڵ�
						bo.boardLook(move, answer);
						if (answer == 1) {
							score += problemList.get(move).getScore();
						} else if (answer == 2) {
							score -= 17;
						} else if (answer == 3) {
							score -= 14;
						}

						System.out.println("������ ����Ȯ�� �����ο� ���� �Է��Ͻÿ�");
						answer = sc.nextInt(); // ���� �������� ���� Ȯ���ϴ� �ڵ�
						score += (problemList.get(move).getScore() / (str.length - 1)) * answer;
						System.out.println("���� �� ���� : " + score);
					}
				}
			}
		}

		cs = new CalScore(score, bo, problemList);

		score = cs.cal();

		return score;

	}

	
	

}
