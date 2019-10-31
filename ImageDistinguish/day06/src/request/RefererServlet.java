package request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RefererServlet",urlPatterns = "/RefererServlet")
public class RefererServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //判断请求中Referer是否存在，有效 -- 防止盗链

        String referer = request.getHeader("referer");
        if(referer!=null && referer.equals("http://localhost:8080/day06_war_exploded/")){
            //有效
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("窝窝头1块钱4个");
        }else{
            //无效
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("盗链真无耻……");


        }

    }
}
