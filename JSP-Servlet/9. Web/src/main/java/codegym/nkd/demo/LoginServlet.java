package codegym.nkd.demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "loginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        List<Student> list = new ArrayList<>();
        if("admin".equals(username) && "admin".equals(password)) {
            Student student = new Student(1, "NKD", 7);
            request.setAttribute("loginTime", new Date());
            request.setAttribute("student", student);
            list.add(student);
            list.add(student);
            list.add(student);
            request.setAttribute("list", list);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
            requestDispatcher.forward(request, response);

        } else {
           response.sendRedirect("index.jsp");
        }
    }

}