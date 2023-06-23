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

	// 커넥션 연결하는 기능
	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_ur1 = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_c_0120_4";
			String db_pw = "smhrd4";

			conn = DriverManager.getConnection(db_ur1, db_id, db_pw);

//			if(conn != null) {
//			System.out.println("커넥션 연결 성공!");
//		}
//		else {
//			System.out.println("커넥션 연결 실패...");
//		}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 연결끊기
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
	

	// 로그인
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
				// 로그인 성공
				// 로그인 성공한 사람의 데이터 가져오기
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

	// 회원상세보기
	public GameVO select(String input_id) {

		GameVO vo = null;
		getConnection();
		try {

			String sql = "select * from member where m_id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, input_id);

			rs = psmt.executeQuery();

			if (rs.next()) {
				String m_id = rs.getString("m_id");
				String m_pw = rs.getString("m_pw");
				int m_teamno = rs.getInt("m_teamno");
				String m_name = rs.getString("m_name");
				int m_score = rs.getInt("m_score");
				vo = new GameVO(m_id, m_pw, m_teamno, m_name, m_score);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}

	// 랭킹보기
	public ArrayList<GameVO> list() {

		// 랭킹 저장할 변수
		ArrayList<GameVO> list = new ArrayList<GameVO>();

		getConnection();
		try {

			String sql = "select * from member order by m_score asc";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {
				int m_score = rs.getInt("m_score");
				int m_teamno = rs.getInt("m_teamno");
				String m_name = rs.getString("m_name");
				GameVO vo = new GameVO(m_teamno, m_name, m_score);
				list.add(vo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	public int join(String id, String pw, String name, int teamno) {
		int result = 0;
		
		getConnection();
		
		try {
			String sql = "insert into member (m_no, m_id, m_pw, m_name, m_teamno) values(m_no_seq.nextval, ?,?,?,?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, teamno);
			
			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return result;
	}
}
