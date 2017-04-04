import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Саня on 04.04.2017.
 */
@WebServlet(urlPatterns = "/deleteOrder")
public class DeleteOrder extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/enterOrderId.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String filename = "D:\\output.txt";
        File f = new File(filename);

        Scanner scanner = new Scanner(f);
        ArrayList<String> orders = new ArrayList<>();
        while (scanner.hasNextLine()) {
            orders.add(scanner.nextLine());
        }
        scanner.close();
        new File(filename).delete();
        File out = new File("D:\\output.txt");
        out.createNewFile();
        FileWriter fileWriter = new FileWriter(out, true);
        for (String string : orders) {
            if (Integer.parseInt(string.substring(0, 1)) != id) {
                fileWriter.write(string + " \r\n");
            }
        }
        fileWriter.flush();
        fileWriter.close();
        getServletContext().getRequestDispatcher("/delete.jsp").forward(req, resp);
    }
}

