package deptempl.dept.dao;

import java.util.List;

import deptempl.dept.beans.Dept;

public interface DeptDao {
	void openConnection();
	void close();
	int addDept(Dept dept); 
	List<Dept> getDepts();
	//Emp getEmpByCode(int empcode);
	int delDept(int deptno);
	int updateDept(String dname,String loc,int deptno);
	int addDept(int deptno, String dname, String loc);
}
