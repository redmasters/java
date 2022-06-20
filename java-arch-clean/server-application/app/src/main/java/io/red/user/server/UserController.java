package io.red.user.server;


import io.red.user.info.InfoUser;
import io.red.user.model.UserNameList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/")
    public UserNameList index(){
        return InfoUser.obter();
    }
}
