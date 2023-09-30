package codegym.nkd.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "discountServlet", value = "/discount-servlet")
public class DiscountServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String description = request.getParameter("description");
        String strPrice = request.getParameter("price");
        String strDiscount = request.getParameter("discount");

        PrintWriter writer = response.getWriter();
        if(description.isEmpty() || strPrice.isEmpty() || strDiscount.isEmpty()) {
            writer.println("Error");
        } else {
            int price = Integer.parseInt(strPrice);
            int discount = Integer.parseInt(strDiscount);writer.println("Ghi chú: " + description);
            writer.println("Giá: " + price);
            writer.println("Discount: " + discount);
            writer.println("Result: " + (float) (price * discount * 0.01f));
        }
    }

    public void destroy() {
    }
}