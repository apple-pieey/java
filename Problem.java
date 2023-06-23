package javafestival;

public class Problem {

	public void proNum(int num) {

		System.out.println("<문제!!>");
		switch (num) {
		case 0:
			System.out.println("세계여행");
			break;
		case 1:
			System.out.println("제한시간 : 8분");
			System.out.println("획득점수 : 10점");
			System.out.println("일한 시간을 입력받아 총 임금을 계산하는 시급 계산기입니다.");
			System.out.println("시급은 5000원이며 8시간보다 초과 근무한 시간에 대해");
			System.out.println("1.5배의 시급이 책정됩니다.");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("일한시간을 입력하세요 : 10");
			System.out.println("총 임금은 55000원 입니다.");
			break;
		case 2:
			System.out.println("제한시간 : 8분");
			System.out.println("획득점수 : 10점");
			System.out.println("1-2+3-4+....+99-100를 계산하여");
			System.out.println("답을 출력하시오.");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("1 -2 3 -4 5 -6 7 -8 9 -10 11 -12....");
			System.out.println("결과 : -50");
			break;
		case 3:
			System.out.println("제한시간 : 8분");
			System.out.println("획득점수 : 10점");
			System.out.println("거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는");
			System.out.println("프로그램을 작성하시오.");
			System.out.println("단, 최대단위는 10000원, 최소단위는 100원");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("총금액 입력 : 25600");
			System.out.println();
			System.out.println("잔돈 : 25600원");
			System.out.println("10000원 : 2개");
			System.out.println("5000원 : 1개");
			System.out.println("1000원 : 0개");
			System.out.println("500원 : 1개");
			System.out.println("100원 : 1개");
			break;
		case 4:
			System.out.println("제한시간 : 15분");
			System.out.println("획득점수 : 10점");
			System.out.println("행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오.");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("행 개수 : 8");
			System.out.println("*");
			System.out.println("**");
			System.out.println("***");
			System.out.println("****");
			System.out.println("*****");
			System.out.println("******");
			System.out.println("*******");
			System.out.println("********");
			break;
		case 5:
			System.out.println("제한시간 : 15분");
			System.out.println("획득점수 : 10점");
			System.out.println("(77*1)+(76*2)+(75*3)+...+(1*77)를 계산하여");
			System.out.println("결과를 출력하시오.");
			System.out.println("<결과화면>");
			System.out.println("79079");
			break;
		case 6:
			System.out.println("제한시간 : 8분");
			System.out.println("획득점수 : 15점");
			System.out.println("행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오.");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("행 개수 : 7");
			System.out.println("*******");
			System.out.println("******");
			System.out.println("*****");
			System.out.println("****");
			System.out.println("***");
			System.out.println("**");
			System.out.println("*");
			break;
		case 7:
			System.out.println("제한시간 : 10분");
			System.out.println("획득점수 : 15점");
			System.out.println("다음과 같은 프로그램을 작성하시오.");
			System.out.println("A,B숫자를 입력받는다.");
			System.out.println("A-B를 출력한다.");
			System.out.println("A와 B가 모두 0을 입력받으면 프로그램이 종료된다.");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("A 입력>> 1");
			System.out.println("B 입력>> 1");
			System.out.println("결과>> 0");
			System.out.println("A 입력>> 2");
			System.out.println("B 입력>> 3");
			System.out.println("결과>> -1");
			System.out.println("A 입력>> 9");
			System.out.println("B 입력>> 8");
			System.out.println("결과>> 1");
			System.out.println("A 입력>> 0");
			System.out.println("B 입력>> 0");
			break;
		case 8:
			System.out.println("자바퀴즈");
			break;
		case 9:
			System.out.println("제한시간 : 8분");
			System.out.println("획득점수 : 20점");
			System.out.println("for문을 사용하여 A~Z까지 출력하시오.");
			break;
		case 10:
			System.out.println("제한시간 : 20분");
			System.out.println("획득점수 : 20점");
			System.out.println("8칸 크기의 배열을 선언하고 랜덤수로 초기화 한 후");
			System.out.println("가장 큰 수와 작은 수를 각각 출력하시오.");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("배열에 있는 모든 값 : 10 56 21 55 35 54 14 26");
			System.out.println("가장 큰 값 : 56");
			System.out.println("가장 작은 값 : 10");
			break;
		case 11:
			System.out.println("제한시간 : 13분");
			System.out.println("획득점수 : 20점");
			System.out.println("두 개의 정수를 매개변수로 받아 앞의 정수가");
			System.out.println("뒤의 정수로 나누어지는지를 판별하는 메소드 isDivide()");
			System.out.println("를 작성하세요. 이때, 나누어지면 true,");
			System.out.println("나누어지지 않으면 false을 반환함.");
			System.out.println();
			System.out.println("<main>");
			System.out.println("Public static void main(String[] args) {");
			System.out.println();
			System.out.println("\tint num1 = 10;");
			System.out.println("\tint num2 = 2;");
			System.out.println("\tboolean result = isDivide(num1, num2);");
			System.out.println("\tSystem.out.println(\"결과확인 : \" + result);");
			System.out.println("}");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("결과 확인 : true");
			break;
		case 12:
			System.out.println("제한시간 : 15분");
			System.out.println("획득점수 : 20점");
			System.out.println("정수 N을 입력받아 N * N 배열에");
			System.out.println("다음과 같이 숫자를 저장하고 출력하시오.");
			System.out.println("+-----+-----+-----+-----+-----+");
			System.out.println("|  1  |  6  | 11  | 16  | 21  |");
			System.out.println("+-----+-----+-----+-----+-----+");
			System.out.println("|  2  |  7  | 12  | 17  | 22  |");
			System.out.println("+-----+-----+-----+-----+-----+");
			System.out.println("|  3  |  8  | 13  | 18  | 23  |");
			System.out.println("+-----+-----+-----+-----+-----+");
			System.out.println("|  4  |  9  | 14  | 19  | 24  |");
			System.out.println("+-----+-----+-----+-----+-----+");
			System.out.println("|  5  | 10  | 15  | 20  | 25  |");
			System.out.println("+-----+-----+-----+-----+-----+");
			break;
		case 13:
			System.out.println("제한시간 : 13분");
			System.out.println("획득점수 : 20점");
			System.out.println("가운데 글자 구하기");
			System.out.println("getMiddle메소드는 하나의 단어를 입력 받습니다.");
			System.out.println("단어를 입력 받아서 가운데 글자를 반환하도록 getMiddle메소드를 만들어 보세요.");
			System.out.println("단어의 길이가 짝수일경우 가운데 두글자를 반환하면 됩니다.");
			System.out.println("예를들어 입력받은 단어가 power이라면 w를 반환하면 되고,");
			System.out.println("입력받은 단어가 test라면 es를 반환하면 됩니다.");
			System.out.println();
			System.out.println("<Main>");
			System.out.println("public static void main(String[] args) {");
			System.out.println("\tSystem.out.println(getMiddle(\"power\"));");
			System.out.println("}");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("w");
			break;
		case 14:
			System.out.println("문제적남자");
			break;
		case 15:
			System.out.println("제한시간 : 15분");
			System.out.println("획득점수 : 25점");
			System.out.println("정수 N을 입력받아 N * N 배열에");
			System.out.println("다음과 같이 숫자를 저장하고 출력하시오.");
			System.out.println("+-----+-----+-----+-----+-----+");
			System.out.println("|  1  |  2  |  3  |  4  |  5  |");
			System.out.println("+-----+-----+-----+-----+-----+");
			System.out.println("|  10 |  9  |  8  |  7  |  6  |");
			System.out.println("+-----+-----+-----+-----+-----+");
			System.out.println("|  11 |  12 | 13  | 14  | 15  |");
			System.out.println("+-----+-----+-----+-----+-----+");
			System.out.println("|  20 |  19 | 18  | 17  | 16  |");
			System.out.println("+-----+-----+-----+-----+-----+");
			System.out.println("|  21 |  22 | 23  | 24  | 25  |");
			System.out.println("+-----+-----+-----+-----+-----+");
			break;
		case 16:
			System.out.println("제한시간 : 15분");
			System.out.println("획득점수 : 25점");
			System.out.println("정수 n을 입력받아");
			System.out.println("1, 2, 4, 7, 11과 같은 수열의");
			System.out.println("n번쨰 항까지 출력하시오.");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("n 입력 : 7");
			System.out.println("1 2 4 7 11 16 22");
			break;
		case 17:
			System.out.println("제한시간 : 15분");
			System.out.println("획득점수 : 25점");
			System.out.println("8자리 정수를 입력받아 반복문을 활용하여");
			System.out.println("입력받은 정수의 합을 구하여");
			System.out.println("출력하는 프로그램을 작성하시오.");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("정수 입력 : 25462581");
			System.out.println("합은 33입니다.");
			System.out.println("Hint) 25462581 => 2+5+4+6+2+5+8+1");
			break;
		case 18:
			System.out.println("제한시간 : 15분");
			System.out.println("획득점수 : 25점");
			System.out.println("num1, num2, op(+,-,*,/)를 매개변수로 받아");
			System.out.println("num1과 num2를 op에 맞게 연산한 결과값을");
			System.out.println("반환해주는 cal 메소드를 작성하세요.");
			System.out.println();
			System.out.println("<Main>");
			System.out.println("public static void main(String[] args) {");
			System.out.println("\tint num1 = 50;");
			System.out.println("\tint num2 = 15;");
			System.out.println("\tchar op = '-';");
			System.out.println("\tSystem.out.println(cal(num1, num2, op));");
			System.out.println("}");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("35");
			break;
		case 19:
			System.out.println("그림맞추기");
			break;
		case 20:
			System.out.println("제한시간 : 15분");
			System.out.println("획득점수 : 30점");
			System.out.println("중복이 없이 숫자를 뽑는 로또 프로그램을 만드시오");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("행운의 숫자 : 3");
			System.out.println("행운의 숫자 : 22");
			System.out.println("행운의 숫자 : 40");
			System.out.println("행운의 숫자 : 17");
			System.out.println("행운의 숫자 : 9");
			System.out.println("행운의 숫자 : 41");
			break;
		case 21:
			System.out.println("제한시간 : 15분");
			System.out.println("획득점수 : 30점");
			System.out.println("사용자에게 입력받아 배열의");
			System.out.println("인덱스의 수 만큼 별을 출력해보세요.");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("0번째 별의 수 : 9");
			System.out.println("1번째 별의 수 : 4");
			System.out.println("2번째 별의 수 : 5");
			System.out.println("3번째 별의 수 : 2");
			System.out.println("4번째 별의 수 : 1");
			System.out.println("9:*********");
			System.out.println("4:****");
			System.out.println("5:*****");
			System.out.println("2:**");
			System.out.println("1:*");
			break;
		case 22:
			System.out.println("문제적남자");
			break;
		case 23:
			System.out.println("제한시간 : 20분");
			System.out.println("획득점수 : 35점");
			System.out.println("10진수 정수를 입력받아");
			System.out.println("2진수로 변환해서 출력하시오.");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("숫자입력>> 10");
			System.out.println("1 0 1 0");
			break;
		case 24:
			System.out.println("제한시간 : 20분");
			System.out.println("획득점수 : 35점");
			System.out.println("아래와 같이 숫자가 담긴 1차원 배열이 주어졌을 때,");
			System.out.println("두개의 숫자를 뽑아 서로의 거리를 비교한 후");
			System.out.println("거리가 가장 작은 숫자의 위치(index)를 출력하시오.");
			System.out.println("int[] point = {92,32,52,9,81,2,68}");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("result = [3, 5]");

			break;
		case 25:
			System.out.println("제한시간 : 20분");
			System.out.println("획득점수 : 35점");
			System.out.println("다음과 같은 결과를 출력하세요");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("     *");
			System.out.println("    **");
			System.out.println("   ***");
			System.out.println("  ****");
			System.out.println(" *****");
			break;
		case 26:
			System.out.println("제한시간 : 17분");
			System.out.println("획득점수 : 35점");
			System.out.println("5개의 정수를 입력 받아");
			System.out.println("오름차순 정렬하여 출력하는 프로그램을 구현하시오.");
			System.out.println();
			System.out.println("<결과화면>");
			System.out.println("1번째 수 입력 : 9");
			System.out.println("2번째 수 입력 : 8");
			System.out.println("3번째 수 입력 : 5");
			System.out.println("4번째 수 입력 : 7");
			System.out.println("5번째 수 입력 : 2");
			System.out.println("정렬 후");
			System.out.println("2 5 7 8 9");
			break;
		case 27:
			System.out.println("타자연습");
			break;
		case 28:
			System.out.println("제한시간 : 25분");
			System.out.println("획득점수 : 40점");
			System.out.println("다음과 같은 프로그램을 작성하시오.");
			System.out.println("N과 X를 입력 받는다.");
			System.out.println("N개의 정수를 입력받는다.");
			System.out.println("N개의 숫자 중 X보다 작은 수만 출력 한다.");
			System.out.println();
			System.out.println("N 입력>> 10");
			System.out.println("X 입력>> 5");
			System.out.println("1번째 정수 입력>> 1");
			System.out.println("2번째 정수 입력>> 10");
			System.out.println("3번째 정수 입력>> 4");
			System.out.println("4번째 정수 입력>> 9");
			System.out.println("5번째 정수 입력>> 2");
			System.out.println("6번째 정수 입력>> 3");
			System.out.println("7번째 정수 입력>> 8");
			System.out.println("8번째 정수 입력>> 5");
			System.out.println("9번째 정수 입력>> 7");
			System.out.println("10번째 정수 입력>> 6");
			System.out.println("결과 >> 1 4 2 3");
			break;
		case 29:
			System.out.println("제한시간 : 20분");
			System.out.println("획득점수 : 40점");
			System.out.println("대시('_')문자로 구성된 형태의 숫자를\n" + "주어진 숫자와 같이 출력하고 싶을 때 사용되게 되는\n"
					+ "대시의 개수를 출력하는 프로그램을 작성하라\n" + " _     _  _       _   _  _   _   _       \n"
					+ "| | |  _| _| |_| |_  |_   | |_| |_|      \n" + "|_| | |_  _|   |  _| |_|  | |_|  _|      \n");
			System.out.println("<결과화면>\n" + "첫자리 0을 제외한 숫자를 입력해주세요 >> 1234567890\n" + "대시('_')의 총 합 >> 49\n"
					+ "첫자리 0을 제외한 숫자를 입력해주세요 >> 3392\n" + "대시('_')의 총 합 >> 21\n" + "첫자리 0을 제외한 숫자를 입력해주세요 >> 2018\n"
					+ "대시('_')의 총 합 >> 20\n" + "");
			break;
		case 30:
			System.out.println("제한시간 : 25분");
			System.out.println("획득점수 : 40점");
			System.out.println("세 자리 수의 두 값을 입력받아 결과 화면 처럼 출력하는 프로그램을 작성하시오.\n");
			System.out.println("<결과화면>\n" + "첫 번째 숫자 입력 >> 472\n" + "두 번째 숫자 입력 >> 385\n" + "2360\n" + "3776\n"
					+ "1416\n" + "181720\n");
			break;
		case 31:
			System.out.println("제한시간 : 25분");
			System.out.println("획득점수 : 40점");
			System.out.println("스마트미디어인재개발원의 인쌤이 Java 시험문제를 채점하고 있다.\n"
					+ "문제마다 'o'또는 'x'로 표시가 되어 있는데 점수를 매기는 방식이 특이하다.\n" + "'o'는 점수가 누적되는 방식으로 채점되는데 이전부터 자신을 포함한 연속된\n"
					+ "'o'의 개수 만큼의 점수로 채점이 됩니다. 예를 들어 'oooxoo'라는 표시가\n"
					+ "있다면 순서대로 1+2+3+0+1+2=9으로 총점이 계산됩니다. 학생이 푼 시험지에\n"
					+ "정답, 오답 여부가 표시되어 있을 때 총점을 구하는 프로그램을 작성하세요\n");
			System.out.println("<결과화면>\n" + "====채점하기====\n" + "oooxoo\n" + "9");
			break;
		case 32:
			System.out.println("제한시간 : 25분");
			System.out.println("획득점수 : 40점");
			System.out.println("2개의 정수 base, n을 받아 base의 n제곱 만큼\n" + "값을 반환하는 powerN() 메소드를 작성하세요.\n");
			System.out.println("<결과화면>\n" + "powerN(2,3) -> 8을 반환\n" + "powerN(3,3) -> 27을 반환\n"
					+ "powerN(10,2) -> 100을 반환\n" + "결과 확인 : 8");
			break;
		case 33:
			System.out.println("그림맞추기");
			break;
		case 34:
			System.out.println("제한시간 : 30분");
			System.out.println("획득점수 : 45점");
			System.out.println("랜덤으로 정수 2개를 뽑아 아래와 같이 출력\n" + "사용자는 두 수의 합을 입력\n" + "두 수의 합과 입력한 수가 일치하면 Success!\n"
					+ "두 수의 합과 입력한 수가 일치하지 않으면 Fail을 출력" + "* 기회는 5번! 5번 틀리면 GAME OVER\n");
			System.out.println("<결과화면>\n" + "4 + 1 = 5\n" + "SUCCESS!\n" + "2 + 1 = 2\n" + "Fail...\n" + "9 + 1 = 3\n"
					+ "Fail...\n" + "3 + 9 = 2\n" + "Fail...\n" + "1 + 8 = 2\n" + "Fail...\n" + "0 + 9 = 2\n"
					+ "Fail...\n" + "GAME OVER!");
			break;
		case 35:
			System.out.println("제한시간 : 30분");
			System.out.println("획득점수 : 45점");
			System.out.println("입력된 문장에 포함된 알파벳의 빈도를\n" + "대소문자 구별없이 구하는 프로그램을 작성하시오.\n");
			System.out.println("<결과화면>\n" + "==== 알파벳 빈도수 구하기 ====\n" + "입력 >> smart Media\n"
					+ "a : 2\nb : 0\nc : 0\nd : 1\n  .\n  .\n  .\nx : 0\ny : 0\nz : 0");
			break;
		case 36:
			System.out.println("제한시간 : 30분");
			System.out.println("획득점수 : 45점");
			System.out.println("1보다 큰 정수(N)를 입력하여 N!값을 구하시오\n" + "*팩토리얼이란 N의 수보다 작거나 같은 모든 양의 정수 곱\n"
					+ "ex)3! = 1 x 2 x 3 => 6\n");
			System.out.println("<결과화면>\n" + "입력 : 10\n" + "출력 : 362800");
			break;
		case 37:
			System.out.println("제한시간 : 35분");
			System.out.println("획득점수 : 45점");
			System.out.println(
					"현재 몸무게와 목표몸무게를 각각 입력받고\n" + "주차 별 감량 몸무게를 입력 받아 목표 달성 시\n" + "축하 메세지를 띄우는 프로그램을 구현하시오.\n");
			System.out.println("<결과화면>\n" + "현재몸무게 : 80\n" + "목표몸무게 : 60\n" + "1주차 감량 몸무게 : 2\n" + "2주차 감량 몸무게 : 5\n"
					+ "3주차 감량 몸무게 : 3\n" + "4주차 감량 몸무게 : 4\n" + "5주차 감량 몸무게 : 2\n" + "6주차 감량 몸무게 : 1\n"
					+ "7주차 감량 몸무게 : 6\n" + "57kg 달성!! 축하합니다!");
			break;

		}

	}
}
