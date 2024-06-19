package com.backend.rs;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SubmitForm")
public class MyServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String MyName = req.getParameter("Name");
		String MyEmail = req.getParameter("Email");
		
		System.out.println("MyName: "+MyName);
		System.out.println("MyEmail: "+MyEmail);
		
		PrintWriter Out = resp.getWriter();
		Out.println("Name: "+MyName);
		Out.println("Email: "+MyEmail);
		
	}

}
