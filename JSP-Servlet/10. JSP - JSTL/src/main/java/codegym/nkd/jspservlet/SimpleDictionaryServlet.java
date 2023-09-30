package codegym.nkd.jspservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "simpleDictionaryServlet", value = "/simple-dictionary-servlet")
public class SimpleDictionaryServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String search = request.getParameter("search");
        Map<String, String> dic = new HashMap<>();
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");
        String result = dic.get(search);
        if(result == null) {
            result = "Not found";
        }
        request.setAttribute("search", search);
        request.setAttribute("result", result);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("simple-dictionary.jsp");
        requestDispatcher.forward(request, response);

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("simple-dictionary.jsp");
    }

    public void destroy() {
    }
}