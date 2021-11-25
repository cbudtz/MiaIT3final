package rest;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

import java.security.Key;
import java.util.Calendar;

public class JWThandler {
    private static Key key = MacProvider.generateKey(SignatureAlgorithm.HS512);

    public static String generateToken(String username) {
        /*hvornår den udløber*/
        Calendar expiry = Calendar.getInstance();
        expiry.add(Calendar.MINUTE, 240);
        return Jwts.builder()
                .claim("username",username)
                .signWith(SignatureAlgorithm.HS512,key)
                .setExpiration(expiry.getTime())
                /*den gemmes*/
                .compact();
    }
}
/*Sikrer ikke at beskeden er hemmelig, men at ingen kan pille ved vores token og ændre i den*/
