package edu.kh.test.controller;

import java.io.IOException;

import edu.kh.test.model.dto.Member;

import edu.kh.test.model.service.MemberService;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet{

	private MemberService service = new MemberService();
	
	@Override
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
			try {
			
				String id = req.getParameter("inputId");
				
				String pw = req.getParameter("inputPw");
				
				Member member = service.login(id, pw);
				
				req.setAttribute("member", member);
				
				req.getRequestDispatcher("/WEB-INF/views/result.jsp").forward(req, resp);
				
			} catch (Exception e) {
			
				e.printStackTrace();
			
			}
		
		}

}