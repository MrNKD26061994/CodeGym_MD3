package codegym.nkd.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet(name = "timeServlet", value = "/time-servlet")
public class TimeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        LocalDateTime time = LocalDateTime.now();

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + time + "</h1>");
        out.println("</body></html>");
    }

}
