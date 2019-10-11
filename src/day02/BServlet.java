package day02;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示从ServletContext中获取数据
 */
@WebServlet(name="BServlet",urlPatterns = "/Bbservlet")
public class BServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 1、获取ServletContext对象
         * 2.调用其getAttribute()方法完成获取数据
         */

        ServletContext application = this.getServletContext();
        System.out.println("1");
        String name = (String)application.getAttribute("name");
        System.out.println(name);




    }
}
