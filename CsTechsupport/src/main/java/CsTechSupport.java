import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CsTechSupport extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                PrintWriter out = resp.getWriter();
                out.print("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h2>HTML Forms</h2>\n" +
                        "\n" +
                        "<form action=\"/action_page.php\">\n" +
                        "  First name:<br>\n" +
                        "  <input type=\"text\" name=\"firstname\" value=\"Mickey\">\n" +
                        "  <br>\n" +
                        "  Last name:<br>\n" +
                        "  <input type=\"text\" name=\"lastname\" value=\"Mouse\">\n" +
                        "  <br><br>\n" +
                        "  <input type=\"submit\" value=\"Submit\">\n" +
                        "</form> \n" +
                        "\n" +
                        "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/action_page.php\".</p>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
            }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print(" ");
    }
}

