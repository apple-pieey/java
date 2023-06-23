package javafestival;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GameDAO {

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	// Ŀ�ؼ� �����ϴ� ���
	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_ur1 = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_c_0120_4";
			String db_pw = "smhrd4";

			conn = DriverManager.getConnection(db_ur1, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// �������
	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	// �α���
	public String login(String m_id, String m_pw) {
		String m_name = null;

		getConnection();

		try {

			String sql = "select * from member where m_id=? and m_pw=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, m_id);
			psmt.setString(2, m_pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				// �α��� ����
				// �α��� ������ ����� ������ ��������
//				System.out.println(rs.getString("id"));
//				System.out.println(rs.getString("pw"));
//				teamName = rs.getString("teamName");
				m_name = rs.getString("m_name");
//				System.out.println(rs.getString("addr"));
			}

		} catch (SQLException e) {
		} finally {
			close();
		}
		return m_name;
	}

	// ȸ���󼼺���
	public GameVO select(String input_id) {

		GameVO vo = null;
		getConnection();
		try {

			String sql = "select m_id, m_pw, m_teamno, m_name, t_score from member, team where m_id = ? and member.m_teamno = team.t_no";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, input_id);

			rs = psmt.executeQuery();

			if (rs.next()) {
				String m_id = rs.getString("m_id");
				String m_pw = rs.getString("m_pw");
				int m_teamno = rs.getInt("m_teamno");
				String m_name = rs.getString("m_name");
				int t_score = rs.getInt("t_score");
				vo = new GameVO(m_id, m_pw, m_teamno, m_name, t_score);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}


	// ��ŷ����
	public ArrayList<TeamVO> list() {

		// ��ŷ ������ ����
		ArrayList<TeamVO> list = new ArrayList<TeamVO>();

		getConnection();
		try {

			String sql = "select * from team order by t_score desc";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {
				int t_score = rs.getInt("t_score");
				int t_no = rs.getInt("t_no");
				String t_name = rs.getString("t_name");
				TeamVO vo = new TeamVO(t_no, t_score, t_name);
				list.add(vo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	// ȸ������ ���
	public int join(String id, String pw, String name, int teamno) {
		int result = 0;
		int count = 0;
		
		getConnection();
		
		try {
			String sql = "select m_teamno from member where m_teamno = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1,teamno);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				count++;
			}
						
			if(count == 4) {
				System.out.println("�ش� ���� ������ �� �̻� ���� �� �����ϴ�..");
			}else {
				sql = "insert into member (m_no, m_id, m_pw, m_name, m_teamno) values(m_no_seq.nextval, ?,?,?,?)";

				psmt = conn.prepareStatement(sql);

				psmt.setString(1, id);
				psmt.setString(2, pw);
				psmt.setString(3, name);
				psmt.setInt(4, teamno);
				
				result = psmt.executeUpdate();				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return result;
	}

	// ���� �̸� �������� �޼ҵ�
	public String[] m_name(int m_teamno) {
		String[] m_name = new String[4];
		getConnection();
		try {

			String sql = "select m_name from member where m_teamno = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, m_teamno);

			rs = psmt.executeQuery();
			
			int i = 0;

			while (rs.next()) {
				m_name[i++] = rs.getString("m_name");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return m_name;
	}

	// ���� ����, ĭ�� db���� �������� �޼ҵ�
	public ArrayList<ProblemVO> problem() {
		ArrayList<ProblemVO> problemList = new ArrayList<ProblemVO>();
		
		getConnection();
		
		try {
			String sql = "select * from problem";
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				problemList.add(new ProblemVO(rs.getInt("p_no"), rs.getInt("p_score"), rs.getInt("p_time"), rs.getString("p_desc")));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}	
		return problemList;
	}

	
	public int updateScore(int score, int t_no) {
		getConnection();
		int result = 0;
		
		try {
			String sql = "update team set t_score = ? where t_no = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, score);
			psmt.setInt(2, t_no);
			result = psmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return result;
	}
}
