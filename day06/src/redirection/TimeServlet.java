package redirection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 演示定时刷新
 *
 * 设置一个Refresh，它表示定时刷新
 */
@WebServlet(name = "TimeServlet",urlPatterns = "/TimeServlet")
public class TimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 下面是用来发送响应体
         */

        PrintWriter writer = resp.getWriter();
        writer.print("欢迎你的登录！coucou提醒你8S后会自动跳转到主页!您看到的一定是乱码……");
        /**
         * 设置名为Refresh的响应头
         */
        resp.setHeader("Refresh","5;URL=/day06_war_exploded/TimeReceiveServlet");


    }
}
