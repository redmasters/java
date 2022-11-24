package io.red.user.server;


import io.red.usecase.CriarUsuario;
import io.red.user.info.InfoUser;
import io.red.user.model.User;
import io.red.user.model.UserNameList;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping
    public UserNameList index(){
        return InfoUser.obter();
    }

    @PostMapping
    public User novoUsuario(@RequestBody User user){
       return CriarUsuario.create(user);
    }
}
