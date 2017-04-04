import Entities.Order;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Саня on 01.04.2017.
 */
@WebServlet(urlPatterns = "/makeBooking")
public class makeBooking extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/makeBooking.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cinema = req.getParameter("Cinema");
        String tiketsCount = req.getParameter("tiketsCount");
        String startTime = req.getParameter("beginingTime");
        String endTime = null;
        boolean isFind = false;
        String filename = "/WEB-INF/in";

        ServletContext context = getServletContext();
        InputStream is = context.getResourceAsStream(filename);
        if (is != null) {
            InputStreamReader isr = new InputStreamReader(is);
            Scanner scanner = new Scanner(isr);
            while (scanner.hasNext()) {
                String tempCinema = scanner.next();
                scanner.next();
                String tempStartTime = scanner.next();
                scanner.next();
                endTime = scanner.next();
                if (tempCinema.equals(cinema) && tempStartTime.equals(startTime)) {
                    isFind = true;
                    break;
                }
            }
            is.close();
            scanner.close();

            if (isFind) {
                File out = new File("D:\\output.txt");
                out.createNewFile();
                FileWriter fileWriter = new FileWriter(out, true);
                Order.id++;
                String line = Long.toString(++Order.id) + " " + cinema + " : " + startTime + " - " +
                        endTime + " ticketsCount: " + tiketsCount + " \r\n";
                fileWriter.write(line);
                fileWriter.flush();
                fileWriter.close();
                getServletContext().getRequestDispatcher("/succsesfull.jsp").forward(req, resp);
            } else {
                getServletContext().getRequestDispatcher("/fail.jsp").forward(req, resp);
            }

        }

    }
}
