package javafestival;

public class GameVO {

	private String m_id;
	private String m_pw;
	private int m_teamno;
	private String m_name;
	private int t_score;
	
	@Override
	public String toString() {
		return "GameVO [m_id=" + m_id + ", m_pw=" + m_pw + ", m_teamno=" + m_teamno + ", m_name=" + m_name + ", t_score=" + t_score +"]";
	}


	public GameVO() {
		
	}


	public GameVO(int m_teamno, String m_name, int t_score) {
		super();
		this.m_teamno = m_teamno;
		this.m_name = m_name;
		this.t_score = t_score;
	}

	public GameVO(String m_id, String m_pw, int m_teamno, String m_name, int t_score) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_teamno = m_teamno;
		this.m_name = m_name;
		this.t_score = t_score;
	}


	public String getM_id() {
		return m_id;
	}


	public void setM_id(String m_id) {
		this.m_id = m_id;
	}


	public String getM_pw() {
		return m_pw;
	}


	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}


	public int getM_teamno() {
		return m_teamno;
	}


	public void setM_teamno(int m_teamno) {
		this.m_teamno = m_teamno;
	}


	public String getM_name() {
		return m_name;
	}


	public void setM_name(String m_name) {
		this.m_name = m_name;
	}


	public int getT_score() {
		return t_score;
	}


	public void setT_score(int t_score) {
		this.t_score = t_score;
	}



	


	
	
}
