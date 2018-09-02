package science.revenswan.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import science.revenswan.cms.model.User;

@Controller
public class UserController{

    @RequestMapping("/")
    @ResponseBody
    public String test(){
        User user = new User("sanjaykr.kundu@gmail.com","pass");
 
        return user.getEmail();
    }


}
