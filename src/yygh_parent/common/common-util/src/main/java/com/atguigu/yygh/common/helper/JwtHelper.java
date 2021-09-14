package com.atguigu.yygh.common.helper;

import io.jsonwebtoken.*;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * @Description: JWT 工具类
 * @Author: Hypocrite30
 * @Date: 2021/9/14 12:15
 */
public class JwtHelper {

    // 过期时间(ms)
    private static final long tokenExpiration = 24 * 60 * 60 * 1000;
    // 密钥
    private static final String tokenSignKey = "123456";

    /**
     * 根据字符串生成token
     * @param userId   用户 id
     * @param userName 用户名称
     * @return
     */
    public static String createToken(Long userId, String userName) {
        String token = Jwts.builder()
                .setSubject("YYGH-USER")
                .setExpiration(new Date(System.currentTimeMillis() + tokenExpiration))
                .claim("userId", userId)
                .claim("userName", userName)
                .signWith(SignatureAlgorithm.HS512, tokenSignKey)
                .compressWith(CompressionCodecs.GZIP)
                .compact();
        return token;
    }

    /**
     * 根据 token 字符串得到用户 id
     * @param token token
     * @return
     */
    public static Long getUserId(String token) {
        if (StringUtils.isEmpty(token))
            return null;
        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(tokenSignKey).parseClaimsJws(token);
        Claims claims = claimsJws.getBody();
        Integer userId = (Integer) claims.get("userId");
        return userId.longValue();
    }

    /**
     * 根据 token 字符串得到用户名称
     * @param token token
     * @return
     */
    public static String getUserName(String token) {
        if (StringUtils.isEmpty(token)) return "";
        Jws<Claims> claimsJws
                = Jwts.parser().setSigningKey(tokenSignKey).parseClaimsJws(token);
        Claims claims = claimsJws.getBody();
        return (String) claims.get("userName");
    }

    // TEST
    public static void main(String[] args) {
        String token = JwtHelper.createToken(1L, "lucy");
        System.out.println(token);
        System.out.println(JwtHelper.getUserId(token));
        System.out.println(JwtHelper.getUserName(token));
    }
}
