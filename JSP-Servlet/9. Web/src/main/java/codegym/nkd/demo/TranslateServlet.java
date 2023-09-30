package codegym.nkd.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "translateServlet", value = "/translate-servlet")
public class TranslateServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
        String txtSearch = request.getParameter("txtSearch");
        PrintWriter writer = response.getWriter();
        if(txtSearch.isEmpty()) {
            writer.println("Not found");
        } else {
            String result = dictionary.get(txtSearch);
            writer.println("Word: " + txtSearch + " Result: " + result);
        }
    }

    public void destroy() {
    }
}