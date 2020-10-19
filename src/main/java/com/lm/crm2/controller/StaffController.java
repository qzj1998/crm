package com.lm.crm2.controller;

import com.lm.crm2.po.Staff;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;

/**
 * @Author: Liumin
 * @Date: 2019/10/23 19:52
 */
@RestController
public class StaffController extends BaseController {

    /*@RequestMapping("loginUI")
    public String loginUI(){
        return "redirect:login.html";
    }*/

    //注册新账户
    @PostMapping("/register")
    @ResponseBody
    public Boolean registry(Staff staff) {
        return this.staffService.registry(staff);
    }

    //焦点事件
    /*@GetMapping("/accountcheck")
    public List<Staff> check(String account) {
        return staffService.check(account);
    }*/

    @GetMapping("/login")
    public List<Staff> login(Staff staff) {
        return staffService.login(staff);
    }

    //加入session
    @PostMapping("/session")
    public void loginSession(HttpServletRequest request, HttpServletResponse response
            , String account, String password) throws IOException {
        //使用request对象的getSession()获取session，如果session不存在则创建一个
        HttpSession session = request.getSession();
        //将数据存储到session中
        session.setAttribute("account", account);
        session.setAttribute("password", password);
        System.out.println(session.getAttribute("account") + "<==>" + session.getAttribute("password"));
        //response.sendRedirect("index.html");
    }

    @GetMapping("/getSessionA")
    public String getSessionA(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String account = (String) session.getAttribute("account");
        //System.out.println("获取的account=="+account+">>>");
        return account;
    }

    @GetMapping("/getSessionP")
    public String getSessionP(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String password = (String) session.getAttribute("password");
        System.out.println("获取的password==" + password);
        return password;
    }

    @GetMapping("/getName")
    public Object getName(String account) {
        return staffService.getName(account);
    }


    //清除session
    @GetMapping("/clearSession")
    public void clearSeesion(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("account");
        session.removeAttribute("password");
        System.out.println("session已清除");
    }

    @PostMapping("/modify")
    public void modify(Staff staff) {
        staffService.changePwd(staff);
    }

}

