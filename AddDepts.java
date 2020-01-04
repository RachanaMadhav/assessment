package crudoperations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import deptempl.dept.beans.Dept;
import deptempl.dept.dao.DeptDao;
import deptempl.dept.dao.impl.DeptDaoImpl;

/**
 * Servlet implementation class AddDepts
 */
@WebServlet("/AddDepts")
public class AddDepts extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		String dname=request.getParameter("dname");
		String loc=request.getParameter("loc");
		Dept dept = new Dept(deptno,dname,loc);
		DeptDao dao = new DeptDaoImpl();
		int rows = dao.addDept(deptno,dname,loc);
		if(rows>0)
			out.println("inserted");
		else
			out.println("not inserted");

	}

}
