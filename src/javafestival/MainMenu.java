package javafestival;

import java.util.ArrayList;
import java.util.Scanner;


public class MainMenu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int choice;

		GameVO user = null;
		GameDAO dao = new GameDAO();

		while (true) {
			System.out.println("자바 페스티벌");
			System.out.println("1.로그인 2.회원가입 3.게임시작 4.회원상세보기 5.랭킹보기 6.도움말보기 7.종료");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("==로그인==");
				System.out.print("ID : ");
				String m_id = sc.next();
				System.out.print("PW : ");
				String m_pw = sc.next();
				String m_name = dao.login(m_id, m_pw);

				if (m_name != null) {
					System.out.println(m_name + "님 환영합니다!");
					user = dao.select(m_id);
				} else {
					System.out.println("로그인 실패...");
				}
			} else if (choice == 2) {
				System.out.println("회원가입");
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("패스워드 입력 : ");
				String pw = sc.next();
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("팀 번호 입력 : ");
				int teamno = sc.nextInt();

				int result = dao.join(id, pw, name, teamno);

				if (result > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}

			} else if (choice == 3) {
				System.out.println("==게임시작==");

				Play play = new Play(user.getM_teamno());
				
				int finalScore = play.playing();

				System.out.println("완주!!");
				System.out.println(finalScore);


				int updateScore = dao.updateScore(finalScore, user.getM_teamno());
				if (updateScore > 0) {
					System.out.println("점수 저장 성공");
				} else {
					System.out.println("점수 저장 실패");
				}

			} else if (choice == 4) {
				System.out.println("==회원상세보기==");
				System.out.print("아이디 입력 : ");
				String m_id = sc.next();
				
				GameVO vo = dao.select(m_id);
				if (vo != null) {
					System.out.print(vo.getM_id() + " - ");
					System.out.print(vo.getM_pw() + " - ");
					System.out.print(vo.getM_teamno() + " - ");
					System.out.print(vo.getM_name() + " - ");
					System.out.println(vo.getT_score() + "점");
				} else {
					System.out.println("해당 회원이 존재하지 않습니다");
				}
			} else if (choice == 5) {
				System.out.println("==랭킹보기==");

				ArrayList<TeamVO> list = dao.list();

				for (int i = 0; i < list.size(); i++) {
					System.out.print((i + 1) + "위. ");
					System.out.print(list.get(i).getT_name() + "점 - ");
					System.out.println(list.get(i).getT_score());
				}
			} else if (choice == 6) {
				System.out.println("도움말보기");
				System.out.println("==========================================\n" + "1. PC에 아래와 같은 보드판 공개 \r\n"
						+ "  - 게임은 모든 팀원들이 기회를 2번씩 소진했을 때 종료된다.\r\n"
						+ "  - 팀원 전부 기회 소진시 팀사진찍기를(포즈정해져있음) 통해서 기회를 1회 획득 가능하다");
				System.out.println("2. 팀 별 게임 시작\n" + "  2-1 주사위를 굴린다.\n" + "  2-2 주사위에서 나온 숫자대로 보드판 이동 \n"
						+ "  2-3 보드판에 나온 문제 풀이");
				System.out.println("\t- 담당자는 시간 안에 문제 풀이를 할 수 있도록 스톱워치를 틀어두고 진행 할 것\r\n"
						+ "\t- 이 때, 문제를 푸는 사람은 ‘도전자’이고 나머지는 ‘서포터’이다.\r\n"
						+ "\t- 도전자가 문제를 풀었을 경우에는 만점을, 서포터가 문제를 풀었을 경우에는 ((문제 점수/팀 별 서포터 수) * 성공한 서포터 수)를 획득한다.\r\n"
						+ "\t    - ex) 총 인원이 5명인 팀에서 도전자 1명과 서포터 2명이 30점짜리 문제를 풀었다면?\r\n" + "        \r\n"
						+ "\t        도전자 : 30점 \r\n" + "        \r\n" + "\t        서포터 : (30/4)*2 = 15점 \r\n"
						+ "        \r\n" + "\t        총 점 45점");
				System.out.println("3. 찬스 획득 기준 \r\n" + "  - 주사위의 합이 7인 경우 \r\n" + "  - 마지막 지점을 1회 통과한 경우 \r\n"
						+ "  - 찬스 획득 문제를 성공한 경우");
				System.out.println("4. 점수 획득 기준\r\n" + "  - 점수 책정 기준\n" + "\t|\t번호\t|\t점수\t|\n"
						+ "\t|     1 - 4 \t|\t10\t|\n" + "\t|     5 - 7 \t|\t15\t|\n" + "\t|     8 - 12\t|\t20\t|\n"
						+ "\t|     13- 16\t|\t25\t|\n" + "\t|     17- 18\t|\t30\t|\n" + "\t|     19- 22\t|\t35\t|\n"
						+ "\t|     23- 27\t|\t40\t|\n" + "\t|     28- 31\t|\t45\t|\n" + "  - 도착 점수\n" + "  - 랜드마크 점수\n"
						+ "\t동일한 색상의 문제를 모두 풀었을 경우 성공 점수의 2배 획득\n " + "  - 우주선 점수\n"
						+ "\tGO 버튼에 정확히 도착시, 어디로든 이동 가능\n");
				System.out.println("==================================");
			} else if (choice == 7) {
				System.out.println("종료");
				break;
			}
		}
		sc.close();
	}
}
