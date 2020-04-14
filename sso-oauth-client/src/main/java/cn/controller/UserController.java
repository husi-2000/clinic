package cn.controller;

import cn.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * api接口
 * @author Administrator
 */
@RestController
@Slf4j
@RequestMapping("/api/client")
public class UserController {

    @GetMapping("/users")
    public Response getUser(Authentication user){
        return new Response().setResponseBody(user);
    }


    @GetMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

}
