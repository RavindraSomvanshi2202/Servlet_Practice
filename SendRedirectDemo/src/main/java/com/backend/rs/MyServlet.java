package com.backend.rs;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Search")
public class MyServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String MySearch = req.getParameter("Search");
		
		//resp.sendRedirect("https://www.google.com");
		resp.sendRedirect("https://www.google.com/search?q="+MySearch);
	}

}
