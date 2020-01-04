package deptempl.dept.utils;

public class DeptUtils {
	public static String insertqry="insert into dept values(?,?,?)";
	public static final String GETDEPTS= "select * from dept";
	//public static final String GETEMPlBYCODE = "select * from emp where empno=?";
	public static final String DELDEPT="delete from dept where deptno=?";
	public static final String UPDATEDEPT="update dept set dname=?,loc=? where deptno=?";

}
