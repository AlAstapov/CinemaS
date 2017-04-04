import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Саня on 04.04.2017.
 */
@WebServlet(urlPatterns = "/seeOrder")
public class SeeOrder extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String filename = "D:\\output.txt";
        File f = new File(filename);
        String yourOrder = null;
        Scanner scanner = new Scanner(f);
        while (scanner.hasNextLine()) {
            String temp = scanner.nextLine();
            if (id == Integer.parseInt(temp.substring(0, 1))) ;
            yourOrder = temp;
            break;
        }
        scanner.close();
        req.setAttribute("order", yourOrder);
        getServletContext().getRequestDispatcher("/YourOrder.jsp").forward(req, resp);
    }
}
