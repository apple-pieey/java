package javafestival;

public class Board {

	String[] point = new String[38]; // 말판 위치
	int move;

	public Board(String[] point, int move) {
		this.point = point;
		this.move = move;
	}

	public Board() {

	}

	public void boardLook(int move) {
		for (int i = 0; i < point.length; i++) { // 말판 초기화
			point[i] = "     ";
			point[move] = " 우빈 ";
		}
		System.out.println(
				"+-------------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println(
				"|  JAVAQUIZ |     8    |     9    |    10    |    11    |    12    | 문제적남자  |    13    |    14    |    15    |    16    |  그림맞추기  |");
		System.out.println("|   " + point[8] + "   |   " + point[9] + "  |   " + point[10] + "  |   " + point[11]
				+ "  |   " + point[12] + "  |   " + point[13] + "  |   " + point[14] + "  |   " + point[15] + "  |   "
				+ point[16] + "  |   " + point[17] + "  |   " + point[18] + "  |   " + point[19] + "   |");
		System.out.println(
				"|           |          |          |          |          |          |          |          |          |          |          |           |");
		System.out.println(
				"|-----------+-------------------------------------------------------------------------------------------------------------+-----------|");
		System.out.println(
				"|     7     |                                                                                                             |     17    |");
		System.out.println("|   " + point[7]
				+ "   |                                                                                                             |   "
				+ point[20] + "   |");
		System.out.println(
				"|           |                                                                                                             |           |");
		System.out.println(
				"|-----------|                                                                                                             |-----------|");
		System.out.println(
				"|     6     |      ##    ###    ##     ##    ###    ######## ########  ######  ######## #### ##     ##    ###    ##       |     18    |");
		System.out.println("|   " + point[6]
				+ "   |      ##   ## ##   ##     ##   ## ##   ##       ##       ##    ##    ##     ##  ##     ##   ## ##   ##       |   "
				+ point[21] + "   |");
		System.out.println(
				"|           |      ##  ##   ##  ##     ##  ##   ##  ##       ##       ##          ##     ##  ##     ##  ##   ##  ##       |           |");
		System.out.println(
				"|-----------|      ## ##     ## ##     ## ##     ## ######   ######    ######     ##     ##  ##     ## ##     ## ##       |-----------|");
		System.out.println(
				"|     5     |##    ## #########  ##   ##  ######### ##       ##             ##    ##     ##   ##   ##  ######### ##       |  문제적남자  |");
		System.out.println("|   " + point[5]
				+ "   |##    ## ##     ##   ## ##   ##     ## ##       ##       ##    ##    ##     ##    ## ##   ##     ## ##       |   "
				+ point[22] + "   |");
		System.out.println(
				"|           | ######  ##     ##    ###    ##     ## ##       ########  ######     ##    ####    ###    ##     ## ######## |           |");
		System.out.println(
				"|-----------|                                                                                                             |-----------|");
		System.out.println(
				"|     4     |                                                                                                             |     19    |");
		System.out.println("|   " + point[4]
				+ "   |                                                                                                             |   "
				+ point[23] + "   |");
		System.out.println(
				"|           |                                                                                                             |           |");
		System.out.println(
				"|-----------|                                                                                                             |-----------|");
		System.out.println(
				"|     3     |                                                                                                             |     20    |");
		System.out.println("|   " + point[3]
				+ "   |                                                                                                             |   "
				+ point[24] + "   |");
		System.out.println(
				"|           |                                                                                                             |           |");
		System.out.println(
				"|-----------|                                                                                                             |-----------|");
		System.out.println(
				"|     2     |                                                                                                             |     21    |");
		System.out.println("|   " + point[2]
				+ "   |                                                                                                             |   "
				+ point[25] + "   |");
		System.out.println(
				"|           |                                                                                                             |           |");
		System.out.println(
				"|-----------|                                                                                                             |-----------|");
		System.out.println(
				"|     1     |                                                                                                             |     22    |");
		System.out.println("|   " + point[1]
				+ "   |                                                                                                             |   "
				+ point[26] + "   |");
		System.out.println(
				"|           |                                                                                                             |           |");
		System.out.println(
				"|-----------+-------------------------------------------------------------------------------------------------------------+-----------|");
		System.out.println(
				"|    GO     |    31    |    30    |    29    |    28    |  그림맞추기 |    27    |    26    |    25    |    24    |    23    |  타자연습   |");
		System.out.println("|   " + point[0] + "   |   " + point[37] + "  |   " + point[36] + "  |   " + point[35]
				+ "  |   " + point[34] + "  |   " + point[33] + "  |   " + point[32] + "  |   " + point[31] + "  |   "
				+ point[30] + "  |   " + point[29] + "  |   " + point[28] + "  |   " + point[27] + "   |");
		System.out.println(
				"|           |          |          |          |          |          |          |          |          |          |          |           |");
		System.out.println(
				"+-------------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println();
	}

}
