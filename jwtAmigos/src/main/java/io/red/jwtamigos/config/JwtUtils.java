package io.red.jwtamigos.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

@Component
public class JwtUtils {

    private String chaveSecreta = "secret";

    public String extrairNomeUsuario(String token) {
        return extrairClaim(token, Claims::getSubject);
    }

    public Date extrairExpiracao(String token) {
        return extrairClaim(token, Claims::getExpiration);
    }

    public boolean claimExiste(String token, String nomeClaim) {
        final Claims claims = claimsExtrairTodos(token);
        return claims.get(nomeClaim) != null;
    }

    public <T> T extrairClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = claimsExtrairTodos(token);
        return claimsResolver.apply(claims);
    }

    private Claims claimsExtrairTodos(String token) {
        return Jwts.parser()
                .setSigningKey(chaveSecreta)
                .parseClaimsJws(token)
                .getBody();
    }

    private Boolean tokenExpirado(String token) {
        return extrairExpiracao(token).before(new Date());
    }

    public String gerarToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        return criarToken(claims, userDetails);
    }

    private String criarToken(Map<String, Object> claims, UserDetails userDetails) {
        return Jwts.builder().setClaims(claims)
                .setSubject(userDetails.getUsername())
                .claim("authorities", userDetails.getAuthorities())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + TimeUnit.HOURS.toMillis(24)))
                .signWith(SignatureAlgorithm.HS256, chaveSecreta).compact();
    }

    public Boolean tokenValido(String token, UserDetails userDetails) {
        final String nomeUsuario = extrairNomeUsuario(token);
        return (nomeUsuario.equals(userDetails.getUsername()) && !tokenExpirado(token));
    }
}
