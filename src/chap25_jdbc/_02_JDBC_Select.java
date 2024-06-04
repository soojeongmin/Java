package chap25_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _02_JDBC_Select {

	public static void main(String[] args) {
		// JDBC를 이용해서 과목별 기말고사 평균 성적 조회
		// (과목번호, 과목이름, 교수번호, 교수이름, 기말고사 성적의 평균점수)
	
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = JDBCUtil.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##study", "!dkdlxl1234");
			stmt  = conn.createStatement();
			String selectStudentInfo = "SELECT C.CNO"
					+ "						 , C.CNAME"
					+ "						 , P.PNO"
					+ "						 , P.PNAME"
					+ "						 , ROUND(AVG(SC.RESULT),2) AS AVG_RES"
					+ "						FROM COURSE C" 
					+ "						JOIN PROFESSOR P"
					+ "						  ON C.PNO = P.PNO" 
					+ "						JOIN SCORE SC"
					+ "						  ON SC.CNO = C.CNO" 
					+ "						GROUP BY C.CNO, C.CNAME, P.PNO, P.PNAME";
			rs = stmt.executeQuery(selectStudentInfo);

			while (rs.next()) {
				Integer cno = rs.getInt("CNO");
				String cname = rs.getString("CNAME");
				Integer pno = rs.getInt("PNO");
				String pname = rs.getString("PNAME");
				Double avgRes = rs.getDouble("AVG_RES");
				System.out.println("[과목번호] " + cno + " [과목명] " + cname + 
									" [교수번호] " + pno + " [교수명] "+pname +
									" [기말고사 평균점수] " + avgRes);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(stmt, rs, conn);
		}
	}

}
