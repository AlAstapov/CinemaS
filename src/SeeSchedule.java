import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Саня on 31.03.2017.
 */
@WebServlet(urlPatterns = "/seeSchedule")
public class SeeSchedule extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<String> schedule = new ArrayList<>();
        resp.setContentType("text/html");
        String filename = "/WEB-INF/in";
        ServletContext context = getServletContext();
        InputStream is = context.getResourceAsStream(filename);
        if (is != null) {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            String text;
            while ((text = reader.readLine()) != null) {
                schedule.add(text);
            }
            reader.close();
            is.close();
        }
        req.setAttribute("schedule", schedule);
        getServletContext().getRequestDispatcher("/schedule.jsp").forward(req, resp);
    }
}
