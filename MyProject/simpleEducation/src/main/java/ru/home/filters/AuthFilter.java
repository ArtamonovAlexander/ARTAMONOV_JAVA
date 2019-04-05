package ru.home.filters;

import org.springframework.context.ApplicationContext;
import ru.home.model.User;
import ru.home.repositiory.AuthRepository;
import ru.home.services.AuthService;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class AuthFilter implements Filter {

    AuthService authService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    ApplicationContext context = (ApplicationContext) filterConfig.getServletContext().getAttribute("springContext");
    authService = context.getBean(AuthService.class);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        if(forProtectedRequest(request)){
            Cookie cookies[] = request.getCookies();
            for (Cookie cookie:cookies) {
                if(cookie.getName().equals("CLIENT-ID")){
                    Optional<User> candidateUser = authService.findUserByCookie(cookie);
                    if(candidateUser.isPresent())
                        filterChain.doFilter(request,response);
                } else response.sendRedirect("/signIn");
                return;
            } response.sendRedirect("/signIn");
        } filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

    private boolean forProtectedRequest(HttpServletRequest request) {
        String path = request.getServletPath();
        return !(path.equals("/singIn") || path.equals("/signUp"));
    }
}
