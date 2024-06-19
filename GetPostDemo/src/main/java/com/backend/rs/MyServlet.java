package com.backend.rs;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")
public class MyServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String MyEmail = req.getParameter("Email");
		String MyPass = req.getParameter("Password");
		
		if(MyEmail.equals("ravi@gmail.com") && MyPass.equals("Ravi123")) {
			System.out.println("Login Success");
		}else {
			System.out.println("Login Failed");
		}
	}

}
