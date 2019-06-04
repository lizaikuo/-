package cn.javabs.severlet;

import UserServiceImpl.UserServiceImpl;
import Userservice.UserService;
import cn.javabs.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "/userServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        User u=new User();
        u.setUsername(username);
        u.setPassword(password);
        u.setSex(sex);
        UserService userService=new UserServiceImpl();
        int rows=userService.addUser(u);
        if (rows>0){
            response.getWriter().write("添加用户成功");
        }else {
            response.getWriter().write("添加用户失败");
        }
    }
}

 