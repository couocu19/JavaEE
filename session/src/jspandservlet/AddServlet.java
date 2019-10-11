package jspandservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddServlet" ,urlPatterns = "/AddServlet")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取参数
        String s1 = request.getParameter("number1");
        String s2 = request.getParameter("number2");

        try {
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);
            int sum = n1+n2;
            //把结果保存到request域中
            request.setAttribute("result",sum);

            //将结果转发到求和的页面中
            //用到了请求转发的知识
            request.getRequestDispatcher("/result.jsp").forward(request,response);
        } catch (Exception e) {
            //response.getWriter().print("你的输入有误！请重新输入~");
            //request.getRequestDispatcher("/add.jsp").forward(request,response);
            response.setHeader("Refresh","3;URL=/session_war_exploded/add.jsp");

        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
