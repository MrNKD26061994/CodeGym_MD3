package codegym.nkd.jspservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "currencyConverterServlet", value = "/currency-converter-servlet")
public class CurrencyConverterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            int rate = Integer.parseInt(request.getParameter("rate"));
            int usd = Integer.parseInt(request.getParameter("usd"));
            request.setAttribute("rate", rate);
            request.setAttribute("usd", usd);
            request.setAttribute("result", rate * usd);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("currencyConverter.jsp");
            requestDispatcher.forward(request, response);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("currencyConverter.jsp");
    }

    public void destroy() {
    }
}