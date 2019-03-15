package com.shiro.config;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class MyShiroRealm   extends AuthorizingRealm {



    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("用户权限配置。。。。。。。。。。");
        return null;
    }



    //验证用户登录信息
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("验证用户登录信息");
        String username = (String)token.getPrincipal();
        System.out.println("登录用户名： "+username);
        System.out.println(token.getCredentials());


        return null;
    }



}
