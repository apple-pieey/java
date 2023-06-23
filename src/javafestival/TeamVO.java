package javafestival;

public class TeamVO {
	
	private int t_no;
	private int t_score;
	private String t_name;
	
	public TeamVO(int t_no, int t_score, String t_name) {
		super();
		this.t_no = t_no;
		this.t_score = t_score;
		this.t_name = t_name;
	}

	public int getT_no() {
		return t_no;
	}

	public void setT_no(int t_no) {
		this.t_no = t_no;
	}

	public int getT_score() {
		return t_score;
	}

	public void setT_score(int t_score) {
		this.t_score = t_score;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
		
}
