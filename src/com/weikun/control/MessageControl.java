package com.weikun.control;

import com.weikun.dao.IMessageDAO;
import com.weikun.service.IMessageService;
import com.weikun.service.MessageServiceImpl;
import com.weikun.vo.Message1;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2016/11/2.
 */
@WebServlet(name = "MessageControl",urlPatterns = {"/message"})
public class MessageControl extends javax.servlet.http.HttpServlet {
    private IMessageService service=new MessageServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        this.doGet(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");//所有请求对象支持中文
        String action=request.getParameter("action");
        RequestDispatcher dispatcher=null;//servlet协作
        if(action.equals("add")){


            Message1 m=new Message1();
            String title=request.getParameter("title");
            String name=request.getParameter("username");
            String email=request.getParameter("email");
            String content=request.getParameter("content");

            m.setTitle(title);
            m.setName(name);
            m.setContent(content);
            m.setEmail(email);


            if(service.addMessage(m)){//增加成功

                dispatcher=request.getRequestDispatcher("message?action=query");
            }
        }else if(action.equals("query")){
            List list=service.queryMessage();
            request.setAttribute("list",list);

            dispatcher=request.getRequestDispatcher("show.jsp");
        }
        dispatcher.forward(request,response);


    }
}
