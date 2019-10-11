package day02;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

/**
 * 使用ServletContext获取资源路径
 */
@WebServlet(name="Dservlet",urlPatterns = "/Dservlet")
public class Dservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext context = this.getServletContext();
        /**
         * 他得到的是有盘符的路径: F:/xxx/xx/
         */
        String path = context.getRealPath("");
        System.out.println(path);

        /**
         * 获取资源的路径后，再创建输入流对象
         */

        InputStream input = context.getResourceAsStream("/index.jsp");

        /**
         * 获取当前路径下所有资源的路径
         */
        Set<String> paths = context.getResourcePaths("/WEB-INF");

        System.out.println(paths);

        String RealPath = context.getRealPath("WEB-INF/lib");
        System.out.println(RealPath);





    }
}
