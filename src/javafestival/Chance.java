package javafestival;

import java.util.Scanner;
import com.ChanceSelect;
public class Chance {

	ChanceSelect c2 = new ChanceSelect();
	Scanner sc = new Scanner(System.in);
	Dice di = new Dice();
	int[] chance = { 0, 0, 0, 0, 0 }; // ���� ������ �����ϴ� �迭 --> ��Ȱ, �븮��, ������, -10��,�� ��
	private int chanceChoice; // ������ ������ ��ȣ�� �޴� ����

	public void rollChance() { // ��������������
		System.out.println("����ȹ��!!!!");
		c2.test();
		System.out.println("1.��Ȱ 2.�븮�� 3.������ 4.-10�� 5.��");
		System.out.print("ȹ���Ͻ� ������ �Է����ּ��� >>");
		chanceChoice = sc.nextInt() - 1;
		if (chanceChoice ==4) {
		//10����	
		}else {
		chance[chanceChoice]++;
		}
		di.dicePlus();
	}

	public void haveChance() { // ��������
		System.out.println("====================");
		System.out.println("    ���� ��������");
		System.out.println("     1.��Ȱ" + chance[0]);
		System.out.println("     2.�븮��" + chance[1]);
		System.out.println("     3.������" + chance[2]);
		System.out.println("====================");
	}

	public void useChance(String[] str, int[] life) {
		System.out.print("����� ���� ��ȣ�� �Է����ּ���>>");
		chanceChoice = sc.nextInt() - 1;
		if (chanceChoice == 0) {
			System.out.println("��Ȱ�� ����� �������ּ���");
			chance[chanceChoice]--;
			for (int i = 0; i < str.length; i++) {
				System.out.print(i + 1 + "." + str[i] + " ");
			}
			int answer = sc.nextInt();
			life[answer - 1]++;
		} else if (chanceChoice == 1) {
			System.out.println("�븮�� ���� ���! �븮�� �尡��~");
			chance[chanceChoice]--;
		} else if (chanceChoice == 2) {
			System.out.println("������ ���� ���! 1�е��� ������ �����!");
			chance[chanceChoice]--;
		}
	}
}
