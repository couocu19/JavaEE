package response;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * 演示生成随机图片案例
 */
@WebServlet(name = "ResponseDemo",urlPatterns = "/ResponseDemo")
public class ResponseDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("refresh","5"); //设置refresh响应头响应头控制浏览器每隔5秒钟刷新一次
        //在内存中创建一张图片
        BufferedImage image = new BufferedImage(80,20,BufferedImage.TYPE_INT_RGB);
        //得到图片
        Graphics2D g = (Graphics2D)image.getGraphics();
        g.setColor(Color.white); //设置图片背景颜色
        g.fillRect(0,0,80,20);  //填充背景色

        //向图片上写数据
        g.setColor(Color.blue); //设置图片上字体的颜色
        g.setFont(new Font(null,Font.BOLD,20));
        g.drawString(makeNum(),0,20);

        //设置响应头控制浏览器一图片的方式打开

        resp.setContentType("image/jpg");

        //设置响应头控制浏览器不缓存图片数据
        resp.setDateHeader("expries",-1);
        resp.setHeader("Pragma","no-cache");
        resp.setHeader("Cache-Control","no-cache");

        //将图片写给浏览器
        ImageIO.write(image,"jpg",resp.getOutputStream());

    }
    /**
     * 生成随机数字
     */

    private String makeNum(){
        Random random = new Random();
        String num = random.nextInt(99999)+"";
        StringBuffer sb = new StringBuffer();

        for(int i =0;i<7-num.length();i++){
            sb.append("0");

        }
        num = sb.toString()+num;
        return num;

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
