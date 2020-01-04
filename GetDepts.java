package crudoperations;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import deptempl.dept.beans.Dept;
import deptempl.dept.dao.DeptDao;
import deptempl.dept.dao.impl.DeptDaoImpl;

/**
 * Servlet implementation class GetDepts
 */
@WebServlet("/GetDepts")
public class GetDepts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		DeptDao dao=new DeptDaoImpl();
		List<Dept> deptlist = dao.getDepts();
		out.println("<table border=2>");
		out.println("<tr><th>DEPTNO<TH>DEPTNAME<TH>LOC</tr>");
		for(Dept e : deptlist){
			out.println("<tr>");
			out.println("<td>"+e.getDeptno()+"</td>");
			out.println("<td>"+e.getDname()+"</td>");
			out.println("<td>"+e.getLoc()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}

}
