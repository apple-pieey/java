package javafestival;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Play {

	final int MAX_TURN = 6;
	private int move = 0; // 현재 칸 수
	private int turn = 1; // 바퀴 수
	private int score = 0; // 팀원 최종 점수

	private int answer; // 선택지를 입력받는 변수
	

	int[] life = { 2, 2, 2, 2 }; // 팀원의 목숨을 저장하는 배열
	
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
				System.out.println("라이프가 없습니다 앞에서 사진찍고 오세요!");
				System.out.print("1. 찍고왔습니다.");
				int an = sc.nextInt();
				if (an == 1) {
					for(int i= 0 ; i<life.length;i++) {
						life[i]++;
					}
				}
			}
			System.out.println("========================================");
			System.out.print("주사위를 굴리려면 1을 입력해주세요. >> ");
			int playChoice = sc.nextInt();

			if (playChoice == 1) {

				move = di.diceRoll();

				if (di.dicePlus() == 7) {
					System.out.println("      777777   LUCKEY!!   77777");
					System.out.println("      7 주사위합7이 나와서 찬스획득! 7 ");
					System.out.println("      7777777777777777777777777");
					ch.rollChance();
				}
				if (move >= 38) {
					move -= 38;
					++turn;
					System.out.println("      ooooooooooooooooooooooo");
					System.out.println("      o 한바퀴를 돌아서 찬스획득! o");
					System.out.println("      ooooooooooooooooooooooo");
					ch.rollChance();
				}

				while (bo.getPoint(move) == "  O  ") {
					System.out.println("문제를 푼 자리에 도착했으니 한번더 굴리겠습니다.");
					score += problemList.get(move).getScore() / 2;
					move = di.diceRoll();
					if (di.dicePlus() == 7) {
						System.out.println("      77777777   LUCKEY!!   77777777");
						System.out.println("      7 주사위합7이 나와서 찬스획득! 7 ");
						System.out.println("      777777777777777777777777777777");
						ch.rollChance();
					}
					if (move >= 38) {
						move -= 38;
						++turn;
						System.out.println("      ooooooooooooooooooooooo");
						System.out.println("      o 한바퀴를 돌아서 찬스획득! o");
						System.out.println("      ooooooooooooooooooooooo");
						ch.rollChance();
					}
				}

				while (bo.getPoint(move) == "world") {
					System.out.print("이동하고싶은 칸수를 입력해주세요! >>");
					move += sc.nextInt();
					if (move >= 38) {
						move -= 38;
						++turn;
						System.out.println("      ooooooooooooooooooooooo");
						System.out.println("      o 한바퀴를 돌아서 찬스획득! o");
						System.out.println("      ooooooooooooooooooooooo");
						ch.rollChance();
					}
					bo.boardLook(move);
					di.setMove(move);

				}
				di.setMove(move); // 말판 옮기는 메소드

				

				System.out.println(problemList.get(move).getPoint());

				bo.boardLook(move); // 보드판 출력하는 메소드
				ch.haveChance();
				System.out.println("    "+(turn) + "바퀴 도는중!!");
				if (bo.getPoint(move) == "javaQ") {
					System.out.println("       VVVVVVVVVVVVVVVVVVVVVVVVVVVVV");
					System.out.println("      >자바 퀴이이이즈! 감독관님 퀴즈 주세요~<");
					System.out.println("       ㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅ ");
					System.out.print("        1.획득 2.실패>>");
					int num1 = sc.nextInt();
					if (num1 == 1) {
						System.out.println("퀴즈를 맞춰서 찬스획득! ");
						ch.rollChance();
					}
				} else if (bo.getPoint(move) == "MoonQ") {
					System.out.println("       VVVVVVVVVVVVVVVVVVVVVVVVV");
					System.out.println("      >문제적남자! 감독관님 문제 주세요~<");
					System.out.println("       ㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅ ");
					System.out.print("         1.획득 2.실패 >>");
					int num1 = sc.nextInt();
					if (num1 == 1) {
						System.out.println("문제를 맞춰서 찬스획득! ");
						ch.rollChance();
					}
				} else if (bo.getPoint(move) == "drawi") {
					System.out.println("        V V V V V V V V V V V V V V V V V ");
					System.out.println("       > https://quickdraw.withgoogle.com <");
					System.out.println("       >        접속해서 5개이상 성공하기!!     <");
					System.out.println("        ㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅ ");
					System.out.print("             1.획득 2.실패 >>");
					int num1 = sc.nextInt();
					if (num1 == 1) {
						System.out.println("5개이상 성공해서 찬스획득! ");
						ch.rollChance();
					}
				} else if (bo.getPoint(move) == "speed") {
					System.out.println("        V V V V V V V V V V V V V V V  ");
					System.out.println("       > 영타 짧은글타수 평균 150을 넘기세요! <");
					System.out.println("        ㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅㅅ ");
					System.out.print("        1.획득 2.실패 >>");
					int num1 = sc.nextInt();
					if (num1 == 1) {
						System.out.println("영타를 잘쳐서 찬스획득! ");
						ch.rollChance();
					}
				} else {
					if (turn >= MAX_TURN) {
						break;
					} else {
						System.out.println("==============================================");
						System.out.println("                    목숨 개수");
						for (int i = 0; i < str.length; i++) {
							System.out.print(str[i] + "(");
							for (int j = 0; j < life[i]; j++) {
								System.out.print("♥");
							}
							System.out.print(") ");
						}
						System.out.println(); 
						System.out.println("==============================================");// 목숨 개수 출력하는 코드

						pr.proNum(move); // 문제 출력하는 메소드

						System.out.println("      찬스 사용하시겠습니까?");
						System.out.print("       1.네 2.아니오 >>");
						answer = sc.nextInt();
						if (answer == 1) {
							ch.haveChance();
							ch.useChance(str,life);
						}
						while (true) {
							System.out.println("           누가푸나요?");
							for (int i = 0; i < str.length; i++) {
								System.out.print(i + 1 + "." + str[i] + " ");
							}
							answer = sc.nextInt();
							if (life[answer - 1] == 0) {
								System.out.println(" 그 사람은 목숨이 없어요!");
							} else {
								life[answer - 1]--;
								break;
							}
						}
						System.out.println("정답확인 1.맞춤 2.포기 3.시간초과");
						answer = sc.nextInt(); // 문제를 맞췄는지 확인하는 코드
						bo.boardLook(move, answer);
						if (answer == 1) {
							score += problemList.get(move).getScore();
						} else if (answer == 2) {
							score -= 17;
						} else if (answer == 3) {
							score -= 14;
						}

						System.out.println("서포터 정답확인 맞춘인원 수를 입력하시오");
						answer = sc.nextInt(); // 맞춘 서포터의 수를 확인하는 코드
						score += (problemList.get(move).getScore() / (str.length - 1)) * answer;
						System.out.println("현재 총 점수 : " + score);
					}
				}
			}
		}

		cs = new CalScore(score, bo, problemList);

		score = cs.cal();

		return score;

	}

	
	

}
