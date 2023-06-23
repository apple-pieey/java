package javafestival;

import java.util.ArrayList;
import java.util.Scanner;

public class CalScore {
	
	Scanner sc = new Scanner(System.in);
	
	private int score;

	Board bo;
	
	ArrayList<ProblemVO> problemList;

	public CalScore(int score, Board bo, ArrayList<ProblemVO> pb) {
		this.score = score;
		this.bo = bo;
		this.problemList = pb;
	}
	
	public int cal () {
		if (bo.point[1] == "  O  " && bo.point[2] == "  O  " && bo.point[3] == "  O  "
				&& bo.point[4] == "  O  ") {
			score += problemList.get(1).getScore();
			score += problemList.get(2).getScore();
			score += problemList.get(3).getScore();
			score += problemList.get(4).getScore();
		}
		if (bo.point[5] == "  O  " && bo.point[6] == "  O  " && bo.point[7] == "  O  ") {
			score += problemList.get(5).getScore();
			score += problemList.get(6).getScore();
			score += problemList.get(7).getScore();
		}
		if (bo.point[9] == "  O  " && bo.point[10] == "  O  " && bo.point[11] == "  O  "
				&& bo.point[12] == "  O  " && bo.point[13] == "  O  ") {
			score += problemList.get(9).getScore();
			score += problemList.get(10).getScore();
			score += problemList.get(11).getScore();
			score += problemList.get(12).getScore();
			score += problemList.get(13).getScore();
		}
		if (bo.point[15] == "  O  " && bo.point[16] == "  O  " && bo.point[17] == "  O  "
				&& bo.point[18] == "  O  ") {
			score += problemList.get(15).getScore();
			score += problemList.get(16).getScore();
			score += problemList.get(17).getScore();
			score += problemList.get(18).getScore();
		}
		if (bo.point[20] == "  O  " && bo.point[21] == "  O  ") {
			score += problemList.get(20).getScore();
			score += problemList.get(21).getScore();
		}
		if (bo.point[23] == "  O  " && bo.point[24] == "  O  " && bo.point[25] == "  O  "
				&& bo.point[26] == "  O  ") {
			score += problemList.get(23).getScore();
			score += problemList.get(24).getScore();
			score += problemList.get(25).getScore();
			score += problemList.get(26).getScore();
		}
		if (bo.point[28] == "  O  " && bo.point[29] == "  O  " && bo.point[30] == "  O  "
				&& bo.point[31] == "  O  " && bo.point[32] == "  O  ") {
			score += problemList.get(28).getScore();
			score += problemList.get(29).getScore();
			score += problemList.get(30).getScore();
			score += problemList.get(31).getScore();
			score += problemList.get(32).getScore();
		}
		if (bo.point[34] == "  O  " && bo.point[35] == "  O  " && bo.point[36] == "  O  "
				&& bo.point[37] == "  O  ") {
			score += problemList.get(34).getScore();
			score += problemList.get(35).getScore();
			score += problemList.get(36).getScore();
			score += problemList.get(37).getScore();
		}


		System.out.println("몇등으로 완주했나요?");
		int rank = sc.nextInt();
		if (rank == 1) {
			score += 300;
		} else if (rank == 2) {
			score += 280;
		} else if (rank == 3) {
			score += 260;
		} else if (rank == 4) {
			score += 240;
		} else if (rank == 5) {
			score += 220;
		} else if (rank == 6) {
			score += 200;
		}
		System.out.println("최종점수 >> " + score);
		
		return score;
	}
	
	
	
	

}
