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

@WebServlet(name = "MainServlet")
public class MainServlet extends HttpServlet {

   public MainServlet() {
      init();
    }

    public void init()
    {
        User user1 = new User("admin", "admin", true);
        User user2 = new User("user", "user", false);
        userList.add(user1);
        userList.add(user2);
    }

    List <User> userList = new ArrayList<User>();
    boolean loginFlag = false;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        req.setAttribute("ErrorLabel", "hidden");
        req.setAttribute("state", "hidden");

        req.getRequestDispatcher("mypage.jsp").forward(req, resp);
        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String login = req.getParameter("login");
        String pass = req.getParameter("pass");



        System.out.println(login + " login");
        System.out.println(pass + " pass");


//        for (User user: userList)
//        {
//            if ((user.getLogin().equals(login)) && user.getPassword().equals(pass))
//            {
//                if (user.getAdminRight()) {
//                    resp.sendRedirect(req.getContextPath()+"/admin-panel");
//                } else {
//                    resp.sendRedirect(req.getContextPath()+"/user-panel");
//                }
//            }
//            else
//            {
//
//                req.setAttribute("errorLabel", "visible");
////                req.getRequestDispatcher("mypage.jsp").forward(req, resp);
//            }
//        }

        for (User user: userList)
        {
            if ((user.getLogin().equals(login)) && user.getPassword().equals(pass))
            {

//                req.setAttribute("state", "visible");
                req.setAttribute("ErrorLabel", "hidden");

                if (user.getAdminRight()) {
                    req.setAttribute("Role", "User with admin rights");
                } else {
                    req.setAttribute("Role", "User with basic right");
                }
                loginFlag = true;
                break;

            }
        }

//        if (!loginFlag)
//        {
////            req.setAttribute("ErrorLabel", "visible");
////            req.setAttribute("state", "hidden");
//            req.setAttribute("Role", "Incorrect password");
//        }

                req.getRequestDispatcher("mypage.jsp").forward(req, resp);
    }

}