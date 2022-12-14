package io.red.jwtamigos.dao;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserDao {

    private final static List<UserDetails> APP_USERS = Arrays.asList(
            new User(
                    "red",
                    "123",
                    Collections.singleton(new SimpleGrantedAuthority("ROLE_ADMIN"))
            ),
            new User(
                    "blue",
                    "456",
                    Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"))
            )

    );

    public UserDetails buscarPorNomeUsuario(String nomeUsuario){
        return APP_USERS
                .stream()
                .filter(usuario -> usuario.getUsername().equals(nomeUsuario))
                .findFirst()
                .orElseThrow(() -> new UsernameNotFoundException("No user, paw"));
    }
}
