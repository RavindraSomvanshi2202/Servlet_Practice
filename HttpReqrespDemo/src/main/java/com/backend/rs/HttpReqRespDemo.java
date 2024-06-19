package com.backend.rs;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Form") // Ensure the mapping is correct and consistent
public class HttpReqRespDemo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String MyUName = req.getParameter("Username");
        String MyPass = req.getParameter("Password");
        
        System.out.println("MyUName: " + MyUName);
        System.out.println("MyPass: " + MyPass);
        
        resp.setContentType("text/html");
        try (PrintWriter out = resp.getWriter()) {
            out.println("MyUName: " + MyUName);
            out.println("MyPass: " + MyPass);
        }
    }
}
