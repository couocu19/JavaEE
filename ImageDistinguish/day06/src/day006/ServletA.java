package day006;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;

/**
 * 获取类路径下的资源
 */
@WebServlet(name="ServletA",urlPatterns = "/ServletA")
public class ServletA extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // ClassLoader cl = this.getClass().getClassLoader();
        Class cl = this.getClass();
        //相对于当前文件所在目录
        //InputStream input = cl.getResourceAsStream("a.txt");

        //相对于classes下
        InputStream input = cl.getResourceAsStream("/a.txt");
        //读取输入流内容，转换成字符串内容并返回
        String s = IOUtils.toString(input);

        System.out.println(s);


    }



}
