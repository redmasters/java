package io.red.jwtamigos.controllers;

import io.red.jwtamigos.config.JwtUtils;
import io.red.jwtamigos.dao.UserDao;
import io.red.jwtamigos.dto.AuthenticationRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Log4j2
@RequestMapping("/v1/auth/")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationManager authenticationManager;
    private final UserDao userDao;
    private final JwtUtils jwtUtils;

    @PostMapping
    public ResponseEntity<String> auth(
            @RequestBody AuthenticationRequest request
    ) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getNomeUsuario(),
                        request.getSenha()
                )
        );

        final UserDetails usuario = userDao.buscarPorNomeUsuario(request.getNomeUsuario());
        if (usuario != null) {
            return ResponseEntity.ok(jwtUtils.gerarToken(usuario));
        }

        return ResponseEntity.status(400).body("Nope");
    }
}
