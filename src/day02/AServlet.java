package day02;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示向Servletcontext中保存数据
 */
@WebServlet(name="AServlet",urlPatterns = "/Aaservlet")
public class AServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 1.获取ServletContext对象
         * 2.调用其setAttribute()方法完成保存数据
         *
         */
        ServletContext application = this.getServletContext();
        application.setAttribute("name","coucou");
//        String name = (String)application.getAttribute("name");
//        System.out.println(name);




    }
}
