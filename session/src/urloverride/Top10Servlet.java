package urloverride;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Top10Servlet",urlPatterns = "/Top10Servlet")
public class Top10Servlet extends HttpServlet {

    private static final long serialVersionUID = 987654321L;

    private List<String> londonAttractions;
    private List<String> parisAttractions;


    @Override
    public void init() throws ServletException {
        londonAttractions = new ArrayList<>();
        londonAttractions.add("aa");
        londonAttractions.add("bb");
        londonAttractions.add("cc");
        londonAttractions.add("dd");
        londonAttractions.add("ee");
        londonAttractions.add("ff");
        londonAttractions.add("gg");
        londonAttractions.add("hh");

        parisAttractions = new ArrayList<>();
        parisAttractions.add("1");
        parisAttractions.add("2");
        parisAttractions.add("3");
        parisAttractions.add("4");
        parisAttractions.add("5");
        parisAttractions.add("6");
        parisAttractions.add("7");
        parisAttractions.add("8");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String city = req.getParameter("city");
        if(city.equals("london")|| city.equals("paris")){
            showAttrations(req,resp,city);

        }
//        if(city!=null &&( city.equals("london") || city.equals("paris"))){
//            showAttrations(req,resp,city);
//     }
//        else{
//            showMainPage(req,resp);
//        }

    }

//
//    private void showMainPage(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
//        resp.setContentType("text/html");
//        PrintWriter writer = resp.getWriter();
//        writer.print("<html><head>"+"<title>Top10Attractions</title>"+"</head><body>"+"Please select a city:"+
//                "<br/><a href='http://localhost:8080/session_war_exploded/Top10Servlet?city=london'>London</a>"
//                +"<br/><a href='http://localhost:8080/session_war_exploded/Top10Servlet?city=paris'>Paris</a>"
//        +"</body></html>");
//
//    }

    private void showAttrations(HttpServletRequest req,HttpServletResponse resp,String city)throws ServletException, IOException{
        int page = 1;
        String pageParameter = req.getParameter("page");
        //检查page参数的值是否能转为整数，如果不能，就将其设为1

        if(pageParameter!=null){
            try {
                page = Integer.parseInt(pageParameter);
            } catch (NumberFormatException e) {
                //如果无法转为整数就保留page的默认值
            }
            if(page>2){
                page = 1;
            }
        }
        List<String> attrations = null;
        if(city.equals("london")){
            attrations = londonAttractions;
        }else if(city.equals("paris")){
            attrations = parisAttractions;
        }

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<html><head>"+"<title>Top10 Tourist Attractions</title>"+"</head><body>");
        writer.println("<a href='index.jsp'>Select City</a>");
        writer.println("<hr/>Page "+page+"<hr/>");

        int start = page*4 - 4;

        for(int i = start;i<start+4;i++){
            writer.println(attrations.get(i)+"<br/>");
        }

        writer.print("<hr style='color:blue'/>"+"<a href='http://localhost:8080/session_war_exploded/Top10Servlet?city="+
                city+"&page=1'>Page 1</a>");
        writer.println("&nbsp;<a href='http://localhost:8080/session_war_exploded/Top10Servlet?city="+
                city+"&page=2'>Page 2</a>");

        writer.println("</body></html>");

    }

}
