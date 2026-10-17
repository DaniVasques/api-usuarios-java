package br.com.cotiinformatica.api_usuarios.components;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Date;

@Component
public class JwtTokenComponent {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;

    public String gerarToken(String email, String perfil) {

        var agora = new Date();

        var expericao = new Date(

                agora.getTime() + expiration
        );

        return Jwts.builder()
                .setSubject(email)
                .claim("perfil", perfil)
                .setIssuedAt(agora)
                .setExpiration(expericao)
                .signWith(
                        SignatureAlgorithm.HS256,
                        secret.getBytes(StandardCharsets.UTF_8)
                )
                .compact();
    }
    public Claims validarToken(String token) {

        return Jwts.parser()
                .setSigningKey(
                        secret.getBytes(StandardCharsets.UTF_8)
                )
                .parseClaimsJws(token)
                .getBody();
    }
}
