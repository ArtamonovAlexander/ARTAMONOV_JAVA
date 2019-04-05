import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

public class NewServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String name = request.getParameter("name");

        pw.print("<html>");
        pw.print("<h1>Hello me</h1>");
        pw.print("Hello " + name);
        pw.print("</html>");

//        response.sendRedirect("https://google.com");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/newJsp.jsp");
        dispatcher.forward(request, response);
    }
}
