package crudoperations;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import deptempl.dept.dao.DeptDao;
import deptempl.dept.dao.impl.DeptDaoImpl;

/**
 * Servlet implementation class UpdatedDeptList
 */
@WebServlet("/UpdatedDeptList")
public class UpdatedDeptList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatedDeptList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		String dname=request.getParameter("dname");
		String loc=request.getParameter("loc");
		DeptDao dao = new DeptDaoImpl();
		int rows=dao.updateDept(dname, loc, deptno);
		if(rows>0)
			out.println("updated");
		else
			out.println("not updated");
	}

	
}
