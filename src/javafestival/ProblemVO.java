package javafestival;

public class ProblemVO {
	
	private int num;
	private int score;
	private int time;
	private String point;
	
	public ProblemVO(int num, int score, int time, String point) {
		super();
		this.num = num;
		this.score = score;
		this.time = time;
		this.point = point;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}

}
