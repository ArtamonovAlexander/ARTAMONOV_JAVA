package ru.home.servlets;

import ru.home.form.AuthUserForm;
import org.springframework.context.ApplicationContext;
import ru.home.services.UsersService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {

    private UsersService usersService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        ApplicationContext context = (ApplicationContext) config.getServletContext().getAttribute("springContext");
        usersService = context.getBean(UsersService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.print("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<title>SignUp</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div>\n" +
                "\t<ru.home.form method='post'>\n" +
                "\t\t<input type=\"text\" name=\"login\" placeholder=\"Login\">\n" +
                "\t\t<br>\n" +
                "\t\t<input type=\"password\" name=\"password\" placeholder=\"Password\">\n" +
                "\t\t<br>\n" +
                "\t\t<input type=\"submit\" value=\"SignUp\">\n" +
                "\t</ru.home.form>\n" +
                "</div>\n" +
                "</body>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AuthUserForm form = AuthUserForm.builder()
                .login(req.getParameter("login"))
                .password(req.getParameter("password"))
                .build();

        usersService.signUp(form);
        resp.sendRedirect("/signIn");
    }
}
