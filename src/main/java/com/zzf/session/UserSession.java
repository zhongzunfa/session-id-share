package com.zzf.session;

import com.zzf.session.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Company: <a href=www.jd.com>京东</a><br>
 * author:  <a href=mailto:zhongzunfa@jd.com>zunfa.zhong</a>
 * description :
 */
@Controller
@RequestMapping("session")
public class UserSession {

    @RequestMapping(value = "user", method = RequestMethod.POST)
    @ResponseBody
    public String setUser(HttpSession session) {
        User user = new User();
        user.setName("zzf");
        user.setPassword("123");
        session.setAttribute("user", user);

        return "success";
    }

    @RequestMapping(value = "user", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getUser(HttpSession session) {
        User user = (User) session.getAttribute("user");
        String name = user.getName();
        return "用户名称：" + name;
    }
}


