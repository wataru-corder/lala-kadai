package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Member;

public class MemberDAO {
	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/example";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";
	
	static {
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバの読み込みができません");
			
		}
	}

	
	
	public List<Member> findAll(){
		List<Member> memberList = new ArrayList<>();
		
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバの読み込みができません");
		}
		
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			String sql = "SELECT id,name,birthday,address,telephone,created_at, gender FROM member";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				Date sqlDate = rs.getDate("birthday");
				LocalDate birthday = sqlDate.toLocalDate();
				String address = rs.getString("address");
				String  telephone = rs.getString("telephone");
				String gender = rs.getString("gender");
				Timestamp createdAt = rs.getTimestamp("created_at");
				
				Member member = new Member(id, name, address, telephone, birthday, gender, createdAt, createdAt);
				memberList.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return memberList;
	}

	public boolean create(Member member){
		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)) {
			String sql = 
					"""
					INSERT INTO member(name, address, telephone, birthday, gender,created_at)
					VALUES (?,?,?,?,?)
					""";
			PreparedStatement  pStmt = conn.prepareStatement(sql);
		
			pStmt.setString(1, member.getName());
			pStmt.setString(2, member.getAddress());
			pStmt.setString(3, member.getTelephone());
			pStmt.setDate(4, Date.valueOf(member.getBirthday()) );
			pStmt.setString(5, member.getGender());
			pStmt.setTimestamp(6, member.getCreatedAt());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return true;
	}
	
}
	
