package log;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "LoginServlet",urlPatterns = "/LoginServlet")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        //获取用户信息
        String username = request.getParameter("username"); 

        //模拟检验用户名和密码是否正确
        //不区分大小写
        if(!"ppp".equalsIgnoreCase(username)){
            /**
             * 附加项:把用户名保存到cookie中，发送给客户端浏览器
             * 当再次打开Login.jsp中时会把用户名显示在文本框中
             */
            Cookie cookie = new Cookie("username",username);
            cookie.setMaxAge(60*60*24);
            response.addCookie(cookie);

            //登录成功:在session中保存用户信息，并重定向到登陆成功页面
            HttpSession session = request.getSession();  //获取session
            session.setAttribute("username",username);
            //session.setAttribute("password",password);
            //注意：重定向的路径一定要带项目名
            response.sendRedirect("/session2_war_exploded/successful/successful1.jsp");

        }else{
            //登录失败:保存错误信息到request对象中
            request.setAttribute("msg","用户信息错误！请重新登录~");
            request.getRequestDispatcher("/login/Login.jsp").forward(request,response);

        }



    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
