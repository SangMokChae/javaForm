package co.micol.shop.common.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.shop.border.command.DAO;
import co.micol.shop.border.vo.BorderVO;

public class BorderDAO extends DAO {
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public BorderDAO() {
		super();
	}
	
	public ArrayList<BorderVO> selectList() {
		ArrayList<BorderVO> list = new ArrayList<BorderVO>();
		//
		return list;
	}
	
	public int insert(BorderVO vo) {
		int n = 0;
		// 구문 작성
		return n;
	}
	
	public int delete(BorderVO vo) {
		int n = 0;
		//
		return n;
	}
	
	public int udate(BorderVO vo) {
		int n = 0;
		String sql = "update tableName set col = ? where id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setInt(2, vo.getId());
			n = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		//
		return n;
	}
	
	private void close() {
		try {
			if(rs != null)  rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
