package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class onLineCount implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("sessionCreate!");
        System.out.println(httpSessionEvent.getSession().getId());
        //获取Session_Counter上下文的值
       Integer Counter = (Integer) (httpSessionEvent.getSession().getServletContext().getAttribute("Session_Counter"));

        if(Counter == null){
            Counter = 0;
        }
        int counter = Counter+1;
        System.out.println("create"+counter);
        httpSessionEvent.getSession().getServletContext().setAttribute("Session_Counter",counter);


    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        String Counter = (String)httpSessionEvent.getSession().getServletContext().getAttribute("Session_Counter");
        if(Counter == null){
            Counter = "0";
        }

        int counter = Integer.parseInt(Counter)-1;

        httpSessionEvent.getSession().getServletContext().setAttribute("Session_Counter",counter);



    }
}
