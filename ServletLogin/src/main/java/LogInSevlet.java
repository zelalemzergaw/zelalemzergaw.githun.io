import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@WebServlet("/login")
public class LogInSevlet extends HttpServlet {
    HttpSession session = null;

    //    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.sendRedirect("login.jsp");
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        String username = req.getParameter("loginname");
//        String Password = req.getParameter("password");
//
//        String name = "zelalem";
//        String password1 = "123";
//        if (username.equals(name) && Password.equals(password1)) {
//            resp.sendRedirect("HomePage.jsp");
//        } else {
//            req.setAttribute("ErrorMessage", "Incorrect password or userName");
//            RequestDispatcher dispatch = req.getRequestDispatcher("login.jsp");
//            dispatch.forward(req, resp);
//        }
//    }
    public LogInSevlet() {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setUserName(req.getParameter("loginname"));
        user.setPassword(req.getParameter("password"));
        String remember = req.getParameter("remember");
        MyDataStore myDs = new MyDataStore();
        HashMap<String, String> myDb = myDs.getMyDb();
        boolean isValid = false;
        Iterator var8 = myDb.entrySet().iterator();
        while (var8.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry) var8.next();
            if (user.getUserName().equalsIgnoreCase(entry.getKey()) && user.getPassword().equalsIgnoreCase((String) entry.getValue())) {
                isValid = true;
                break;

            }
        }
        if (isValid){
            this.session=req.getSession();
            this.session.setAttribute("username",user.getUserName());
            if(req.getParameter("remember")!= null){
                Cookie cUserName =new Cookie("cookuser",user.getUserName());
                Cookie cPassword= new Cookie("cookpass",user.getPassword());
                Cookie cRemember=new Cookie("cookrem",remember.trim());
                cUserName.setMaxAge(2592000);
                cPassword.setMaxAge(2592000);
                cRemember.setMaxAge(2592000);
                resp.addCookie(cUserName);
                resp.addCookie(cPassword);
                resp.addCookie(cRemember);
            }
            resp.sendRedirect("HomePage.jsp");
        }else{
            req.setAttribute("errorMessage","Invalid user Password");
            RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
            dispatcher.forward(req,resp);
        }
    }
}
