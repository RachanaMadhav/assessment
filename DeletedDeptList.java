package crudoperations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import deptempl.dept.dao.DeptDao;
import deptempl.dept.dao.impl.DeptDaoImpl;

/**
 * Servlet implementation class DeletedDeptList
 */
@WebServlet("/DeletedDeptList")
public class DeletedDeptList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		DeptDao dao=new DeptDaoImpl();
		dao.delDept(deptno);
		System.out.println("Deleted");
	}

}
