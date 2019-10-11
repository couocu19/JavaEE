package day006;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FServlet",urlPatterns = "/FServlet")
/**
 * 演示发送状态码
 */
public class FServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 1.服务器每次收到请求时，都会为请求开辟一个新的线程
         * 2.服务器会把客户端的请求数据封装到request对象中，request是请求数据的载体
         * 3.服务器还会创建response对象，这个对象与客户端连在一起，可用来给客户端发送响应。
         */
        resp.sendError(404,"你访问的资源存在，但楚楚就是不给你看");

    }
}
