package javafestival;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javafestival.GameDAO;
import javafestival.GameVO;

public class Main {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		Problem pr = new Problem();
		Board bo = new Board();
		Dice di = new Dice();
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		int choice;

		GameDAO dao = new GameDAO();

		while (true) {
			System.out.println("�ڹ� �佺Ƽ��");
			System.out.println("1.�α��� 2.ȸ������ 3.���ӽ��� 4.ȸ���󼼺��� 5.��ŷ���� 6.���򸻺��� 7.����");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("==�α���==");
				System.out.print("ID : ");
				String m_id = sc.next();
				System.out.print("PW : ");
				String m_pw = sc.next();
				String m_name = dao.login(m_id, m_pw);

				if (m_name != null) {
					System.out.println(m_name + "�� ȯ���մϴ�!");
				} else {
					System.out.println("�α��� ����...");
				}
			} else if (choice == 2) {
				System.out.println("ȸ������");
				System.out.print("���̵� �Է� : ");
				String id = sc.next();
				System.out.print("�н����� �Է� : ");
				String pw = sc.next();
				System.out.print("�̸� �Է� : ");
				String name = sc.next();
				System.out.print("�� ��ȣ �Է� : ");
				int teamno = sc.nextInt();

				int result = dao.join(id, pw, name, teamno);
		

				if (result > 0) {
					System.out.println("ȸ������ ����");
				} else {
					System.out.println("ȸ������ ����");
				}
				
				
			} else if (choice == 3) {
				System.out.println("==���ӽ���==");
				int trun = 1;
				int score = 0;

				int move = 0;
				bo.boardLook(move);

				while (trun != 6) {
					System.out.println("1.�ֻ��� ������");
					int playChoice = sc.nextInt();

					switch (playChoice) {
					case 1:
						move = di.diceRoll();
						if (move >= 38) {
							move -= 38;
							trun++;
						}
						di.setMove(move);
						System.out.println(trun + "���� ������!!");
						bo.boardLook(move);
						pr.proNum(move);

						break;
					}

				}
				System.out.println("����!!");
			} else if (choice == 4) {
				System.out.println("==ȸ���󼼺���==");
				System.out.print("���̵� �Է� : ");
				String m_id = sc.next();
				// ����. id�� ��ġ�ϴ� ȸ���� id, pw, nick, addr ��������
				// �ش� id�� ��ġ�ϴ� ȸ���� �ִٸ� MemberVO�� �޾ƿ�
				// ���̵� - ��й�ȣ - ���̸� - �̸� - ���� �� ���
				// �ش� id�� ��ġ�ϴ� ȸ���� ���ٸ�
				// "�ش� ȸ���� �������� �ʽ��ϴ�" ���
				GameVO vo = dao.select(m_id);
				if (vo != null) {
					System.out.print(vo.getM_id() + " - ");
					System.out.print(vo.getM_pw() + " - ");
					System.out.print(vo.getM_teamno() + " - ");
					System.out.print(vo.getM_name() + " - ");
					System.out.println(vo.getM_score()+"��");
				}
				else {
					System.out.println("�ش� ȸ���� �������� �ʽ��ϴ�");
				}
			} else if (choice == 5) {
				System.out.println("==��ŷ����==");
//				int score;

				ArrayList<GameVO> list = dao.list();
				// ���� �Ʒ����� ��ŷ ������ ����Ͻÿ�
				// 1. ���� - ���̸� - �̸� 
				// 2. ���� - ���̸� - �̸�
				for (int i = 0; i < list.size(); i++) {
					System.out.print(i + 1 + ".");
					System.out.print(list.get(i).getM_score() + "-");
					System.out.print(list.get(i).getM_teamno() + "-");
					System.out.println(list.get(i).getM_name());
				}
			} else if (choice == 6) {
				System.out.println("���򸻺���");
				System.out.println("==========================================\n" + "1. PC�� �Ʒ��� ���� ������ ���� \r\n"
						+ "  - ������ ��� �������� ��ȸ�� 2���� �������� �� ����ȴ�.\r\n"
						+ "  - ���� ���� ��ȸ ������ ��������⸦(��������������) ���ؼ� ��ȸ�� 1ȸ ȹ�� �����ϴ�");
				System.out.println("2. �� �� ���� ����\n" + "  2-1 �ֻ����� ������.\n" + "  2-2 �ֻ������� ���� ���ڴ�� ������ �̵� \n"
						+ "  2-3 �����ǿ� ���� ���� Ǯ��");
				System.out.println("\t- ����ڴ� �ð� �ȿ� ���� Ǯ�̸� �� �� �ֵ��� �����ġ�� Ʋ��ΰ� ���� �� ��\r\n"
						+ "\t- �� ��, ������ Ǫ�� ����� �������ڡ��̰� �������� �������͡��̴�.\r\n"
						+ "\t- �����ڰ� ������ Ǯ���� ��쿡�� ������, �����Ͱ� ������ Ǯ���� ��쿡�� ((���� ����/�� �� ������ ��) * ������ ������ ��)�� ȹ���Ѵ�.\r\n"
						+ "\t    - ex) �� �ο��� 5���� ������ ������ 1��� ������ 2���� 30��¥�� ������ Ǯ���ٸ�?\r\n" + "        \r\n"
						+ "\t        ������ : 30�� \r\n" + "        \r\n" + "\t        ������ : (30/4)*2 = 15�� \r\n"
						+ "        \r\n" + "\t        �� �� 45��");
				System.out.println("3. ���� ȹ�� ���� \r\n" + "  - �ֻ����� ���� 7�� ��� \r\n" + "  - ������ ������ 1ȸ ����� ��� \r\n"
						+ "  - ���� ȹ�� ������ ������ ���");
				System.out.println("4. ���� ȹ�� ����\r\n" + "  - ���� å�� ����\n" + "\t|\t��ȣ\t|\t����\t|\n"
						+ "\t|     1 - 4 \t|\t10\t|\n" + "\t|     5 - 7 \t|\t15\t|\n" + "\t|     8 - 12\t|\t20\t|\n"
						+ "\t|     13- 16\t|\t25\t|\n" + "\t|     17- 18\t|\t30\t|\n" + "\t|     19- 22\t|\t35\t|\n"
						+ "\t|     23- 27\t|\t40\t|\n" + "\t|     28- 31\t|\t45\t|\n" + "  - ���� ����\n" + "  - ���帶ũ ����\n"
						+ "\t������ ������ ������ ��� Ǯ���� ��� ���� ������ 2�� ȹ��\n " + "  - ���ּ� ����\n"
						+ "\tGO ��ư�� ��Ȯ�� ������, ���ε� �̵� ����\n");
				System.out.println("==================================");
			} else if (choice == 7) {
				System.out.println("����");
				break;
			}
		}
	

	}
}
