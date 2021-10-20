package com.serhiihonchar.work_with_junit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// http://localhost:8080/work_with_junit/hi?login=admin
@WebServlet("/hi")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        System.out.println("login ==> " + login);

        PrintWriter out = resp.getWriter();
        out.println("Hi, " + login + "!");
    }
}
