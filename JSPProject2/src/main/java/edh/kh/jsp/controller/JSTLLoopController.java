package edh.kh.jsp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edh.kh.jsp.model.dto.Book;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/jstl/loop")
public class JSTLLoopController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		List<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("자바의 정석", "남궁성", 30000));
		bookList.add(new Book("개미", "베르나르베르베르", 25000));
		bookList.add(new Book("노동의 상실", "어밀리아 호건", 20000));
		bookList.add(new Book("산장살인사건", "게이코", 27000));
		
		req.setAttribute("bookList", bookList);
		
		req.getRequestDispatcher("/WEB-INF/views/jstl/loop.jsp").forward(req, resp);
	}
	
}