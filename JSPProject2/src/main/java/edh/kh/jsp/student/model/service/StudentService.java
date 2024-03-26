package edh.kh.jsp.student.model.service;

import java.sql.Connection;
import java.util.List;

import edh.kh.jsp.student.model.dao.StudentDAO;
import edh.kh.jsp.student.model.dto.Student;

import static edu.kh.jsp.common.JDBCTemplate.*;

public class StudentService {
	
	private StudentDAO dao = new StudentDAO();

	/** 학생 전체 조회 서비스
	 * @return stdList
	 */
	public List<Student> selectAll() throws Exception {
		
		// 1. 커넥션 생성
		Connection conn = getConnection();
		
		// 2. DAO 호출
		List<Student> stdList = dao.selectAll(conn);
		
		// 3. 트랜잭션 제어 X
		
		// 4. Connection 반환
		close(conn);
		
		// 5. stdList 반환 
		return stdList;
		
	}

	/** 건축공학과인 학생만 찾기
	 * @return stdList
	 */
	public List<Student> selectArch() throws Exception{
		
		Connection conn = getConnection();
		
		List<Student> stdList = dao.selectArch(conn);
		
		close(conn);
		
		return stdList;
		
		
	}

	/** 작성한 학과의 학생만 조회
	 * @return
	 */
	public List<Student> selectOne(String deptName) throws Exception{
		
		Connection conn = getConnection();
		
		List<Student> stdList = dao.selectOne(conn, deptName);
		
		close(conn);
		
		return stdList;
	}
	
}
