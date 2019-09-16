import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class login extends HttpServlet {
	private static final long serialVersionUID=1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String text = request.getParameter("text");
		String password = request.getParameter("password");
		if(text.equals("ssafy")&&password.equals("1111")) {
			String msg = "로그인이 성공되었습니다";
			request.setAttribute("msg", msg);
			request.setAttribute("text", text);
			RequestDispatcher rd = request.getRequestDispatcher("./jsp/LoginSuccess.jsp");
			
			
			rd.forward(request, response);
		}else {
			response.sendRedirect("./jsp/Error.jsp");
		}	
	}
//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//			
//			
//		
//	}
}
