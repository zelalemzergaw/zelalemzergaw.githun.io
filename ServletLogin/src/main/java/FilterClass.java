import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.LogRecord;

@WebFilter("/HomePage")
public class FilterClass implements Filter {
    public FilterClass() {
    }

    public void init(FilterConfig ficong) throws ServletException {
        String setting = ficong.getInitParameter("LoginSetting");
        System.out.println("Configuration :" + setting);
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        boolean islogged = session != null && session.getAttribute("username") != null;
        if (islogged) {
            chain.doFilter(request, response);
        } else {
            resp.sendRedirect("/login.jsp");
        }

    }

    public void destroy() {
    }
}


