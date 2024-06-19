package com.backend.rs;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Form")
public class RequestDispature extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String MyEmail = req.getParameter("Email");
		String MyPassword = req.getParameter("Password");
		
		PrintWriter Out = resp.getWriter();
		
		if(MyEmail.equals("abc@gmail.com") && MyPassword.equals("abc123")) {
			
			req.setAttribute("name_key", "Ravindra Somvanshi");
			RequestDispatcher rd = req.getRequestDispatcher("/Profile.jsp");
			rd.forward(req, resp);
			
		}else {
			
			resp.setContentType("text/html");
			Out.println("<h3 style='color:red'> Email & Password not matched..! </h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}

}
