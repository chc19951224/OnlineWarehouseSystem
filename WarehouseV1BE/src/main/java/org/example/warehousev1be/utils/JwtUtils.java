package org.example.warehousev1be.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

public class JwtUtils {
    private static final long expire = 604800;  //过期时间:7天
    private static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    //生成Token方法:以用户的名称验证身份
    public static String generateToken(String username) {
        Date now = new Date();
        Date expiration = new Date(now.getTime() + expire * 1000);
        return Jwts.builder()  //Jwts类的builder方法生成Token
                .setHeaderParam("type","JWT")  //设置头部信息
                .setSubject(username)  //设置载体
                .setIssuedAt(now)  //设置Token生成时间
                .setExpiration(expiration)  //设置Token过期时间
                .signWith(key, SignatureAlgorithm.HS256)  //设置加密算法
                .compact();  //合成Token:头部+载体+签名
    }
    //解析Token
    public static Claims getClaimsFromToken(String token) {
        return Jwts.parserBuilder()  //Jwts类的parser方法解析Token
                .setSigningKey(key)  //解析时需要密钥
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
}
