package codegym.nkd.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "converterServlet", value = "/converter-servlet")
public class ConverterServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int rate = Integer.parseInt(request.getParameter("rate"));
        int usd = Integer.parseInt(request.getParameter("usd"));
        PrintWriter writer = response.getWriter();
        writer.println(usd + "USD = " + (rate * usd));
    }

    public void destroy() {
    }
}