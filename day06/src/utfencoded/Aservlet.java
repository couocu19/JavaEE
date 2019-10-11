package utfencoded;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Aservlet",urlPatterns = "/Aservlet")
public class Aservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 1.先获取来使用iso的错误字符串
         * 2.回退，（使用utf-8）重编
         */
        String name = req.getParameter("username");
        byte[] b = name.getBytes("iso-8859-1");
        name = new String(b,"utf-8");
        System.out.println(name);

        String password = req.getParameter("password");
        byte[] c = password.getBytes("iso-8859-1");
        password = new String (c,"utf-8");
        System.out.println(password);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        System.out.println(password);
    }
}
