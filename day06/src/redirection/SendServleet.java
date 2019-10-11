package redirection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示重定向
 *
 * 1.用户请求SendServlet,然后SendServlet响应302，给出Location头
 */
@WebServlet(name = "SendServleet",urlPatterns = "/SendServleet")
public class SendServleet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("SendServlet");
        /**
         * 重定向：
         *  1.设置location
         *  2.发送302状态码
         */
        resp.setHeader("Location","/day06/ReceiveServlet");

        resp.setStatus(302);



    }
}
