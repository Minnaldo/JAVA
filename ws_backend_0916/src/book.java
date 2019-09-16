import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/book.do")
public class book extends HttpServlet{
	private static final long serialVersionUID=1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String isbn = request.getParameter("isbn");
		String title = request.getParameter("title");
		String catalogue = request.getParameter("catalogue");
		String nation = request.getParameter("nation");
		String publisheDate = request.getParameter("publisheDate");
		String publisher = request.getParameter("publisher");
		String author = request.getParameter("author");
		String price = request.getParameter("price");
		String description = request.getParameter("description");
		
		RequestDispatcher rd = request.getRequestDispatcher("./jsp/bookinfo.jsp");
		
		rd.forward(request, response);
		
		
		
		
	}
}
