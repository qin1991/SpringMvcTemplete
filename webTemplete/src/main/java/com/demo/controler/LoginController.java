package com.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dajie on 16-7-4.
 */
@Controller
@RequestMapping(value = "/demo")
public class LoginController {


    @RequestMapping(value = "/login.do")
    public String login(HttpServletRequest request,String stuNumber, String stuPassword) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("stuNumber", stuNumber);
        map.put("stuPassword", stuPassword);
        request.getSession().setAttribute("stuNumber", stuNumber);
        return "index";
    }
}
