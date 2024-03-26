package edu.kh.todoList.todo.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import edu.kh.todoList.todo.model.dto.Todo;

import static edu.kh.todoList.common.JDBCTemplate.*;



public class TodoDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	public TodoDAO() {
		
		try {
			String filePath = TodoDAO.class.getResource("/edu/kh/todoList/sql/todo-sql.xml").getPath();
			
			prop = new Properties();
			prop.loadFromXML(new FileInputStream(filePath));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	/** 로그인한 회원이 등록한 todoList 전체 조회 SQL 실행 DAO
	 * @param conn
	 * @param memberNo
	 * @return todoList
	 */
	public List<Todo> selectAll(Connection conn, int memberNo) throws Exception{
		
		List<Todo> todoList = new ArrayList<Todo>();
		
		try {
			
			String sql = prop.getProperty("selectAll");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, memberNo);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				Todo todo = new Todo();
				
				todo.setTodoNo(rs.getInt("TODO_NO"));
				todo.setTodoTitle(rs.getString("TODO_TITLE"));
				todo.setTodoMemo(rs.getString("TODO_MEMO"));
				todo.setTodoDate(rs.getString("TODO_DATE"));
				
				todoList.add(todo);
				
			}
			
			
		}finally {
			
			close(rs);
			close(pstmt);
			
		}
		
		return todoList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
