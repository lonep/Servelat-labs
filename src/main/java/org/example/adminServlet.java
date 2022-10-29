package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.example.User;

@WebServlet(name = "adminServlet", value = "/admin-panel")
public class adminServlet extends HttpServlet {





    List <User> userList = new ArrayList<User>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();


        req.getRequestDispatcher("admin-panel.jsp").forward(req, resp);
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {


        req.getRequestDispatcher("admin-panel.jsp").forward(req, resp);

    }

}