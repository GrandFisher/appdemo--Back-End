package cn.sjtu.springwebjpa.controller;


import cn.sjtu.springwebjpa.dto.User;
import cn.sjtu.springwebjpa.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author xuan
 * @date 2019-05-10 15:52.
 */

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private Gson gson;

    @RequestMapping("/user/{username}")
    public String login(@PathVariable String username){
        Optional<User> o=userService.get(username);


        return  o.isPresent()? gson.toJson(o.get()):null;
    }

}
