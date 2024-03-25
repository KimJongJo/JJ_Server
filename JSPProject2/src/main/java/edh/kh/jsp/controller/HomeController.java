package edh.kh.jsp.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/homeTest")
public class HomeController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 위치 webapp 기준
		RequestDispatcher dispatcher =  req.getRequestDispatcher("/WEB-INF/views/home/test.jsp");
		
		
		
		
		// request scope
		req.setAttribute("reqValue", "reqValue 입니다");
		
		// session scope
		HttpSession session = req.getSession();
		session.setAttribute("sessionValue", "sessionValue 입니다");
		
		// application
		ServletContext application = session.getServletContext();
		application.setAttribute("appValue", "appValue 입니다");
		
		
		
		dispatcher.forward(req, resp);
		
	}

}
