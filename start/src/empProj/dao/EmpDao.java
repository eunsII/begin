package empProj.dao;

import java.sql.*;
import java.util.ArrayList;

import empProj.db.*;
import empProj.sql.*;
import empProj.vo.EmpVO;

public class EmpDao {
/*
	이 클래스를 사용한다는 것은
	이 클래스를 new 시킨다는 것이고
	그 의미는 오라클에 접속해서 scott 계정이 가지고있는 emp
	테이블의 내용을 조회하던지, 수정, 삭제... 등의 작업을 한다는 것이다.
	
	따라서 이 클래스가 객체가될 때는
	오라클을 사용할 준비가 되어있어야 한다.
	이말은 드라이버로딩이 되어있어야 한다는 것이다.
 */
	
	private ScottJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private EmpSQL eSQL;
	
	public EmpDao() {
		db = new ScottJDBC();
		// 이순간 ScottJDBC의 인스턴스가 만들어지면 오라클 드라이버를 로딩한 상태가 된다.
		
		// 질의명령을 사용할 준비
		eSQL = new EmpSQL();
	}
	
	// 모든 사원의 정보를 조회해서 반환해주는 함수
	public ArrayList<EmpVO> getAll() {
		// 할일
		// 반환값 변수 만들고
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		// 이미 드라이버로딩은 끝난 상태이므로 커넥션을 꺼내온다.
		con = db.getCON();
		
		// 질의명령 가져오고
		String sql = eSQL.getSQL(eSQL.SEL_ALL);

		// 명령 전달 도구 준비하고
		stmt = db.getSTMT(con);
		
		try {
			// 질의명령 보내고 결과 받고
			rs = stmt.executeQuery(sql);
			// 데이터 추출
			while(rs.next()) {
				// 한명의 데이터를 저장할 VO를 new 시키고
				EmpVO eVO = new EmpVO();
				
				// 데이터를 꺼내고
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				
				// VO 에 채우고
				
				eVO.setEno(eno);
				eVO.setEname(name);
				eVO.setJob(job);
				eVO.setHdate(hdate);
				eVO.setHtime(htime);
				eVO.setSdate();
				
				// VO가 완성이 됬으므로 list 에 채워준다.
				list.add(eVO);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		return list;
	}
	
	// 부서번호를 입력받아서 부서원들의 정보를 반환해주는 함수
	public ArrayList<EmpVO> getDnoInfo(int dno) {
		// 반환값 변수
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		
		return list;
	}
	
	
	// 직급을 입력받아서 해당직급 사원들의 정보를 반환해주는 함수
	public ArrayList<EmpVO> getJobInfo(String job){
		// 반환값 변수
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		
		
		
		return list;
	}
}
