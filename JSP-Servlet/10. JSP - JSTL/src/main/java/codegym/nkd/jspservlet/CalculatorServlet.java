package codegym.nkd.jspservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculatorServlet", value = "/calculator-servlet")
public class CalculatorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            int number1 = Integer.parseInt(request.getParameter("number1"));
            int number2 = Integer.parseInt(request.getParameter("number2"));
            String operator = request.getParameter("operator");
            float result;
            if(operator.equals("+")) {
                result = number1 + number2;
            } else if(operator.equals("-")) {
                result = number1 - number2;
            } else if(operator.equals("*")) {
                result = number1 * number2;
            } else {
                result = number1 / number2;
            }
            request.setAttribute("result", result);
            request.setAttribute("number1", number1);
            request.setAttribute("number2", number2);
            request.setAttribute("operator", operator);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("calculator.jsp");
            requestDispatcher.forward(request, response);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("calculator.jsp");
    }

    public void destroy() {
    }
}