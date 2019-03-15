package com.shiro.config;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    public ShiroConfig(){
        System.out.println("shiro ,,,,,,,,,,,,init");
    }


    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        shiroFilterFactoryBean.setLoginUrl("/login");

        shiroFilterFactoryBean.setSuccessUrl("/index");

        shiroFilterFactoryBean.setUnauthorizedUrl("/403");

        Map<String ,String > filterChainDefinitionMap=new LinkedHashMap<>();

        filterChainDefinitionMap.put("/static/**","anon");

        filterChainDefinitionMap.put("/logout","logout");
        filterChainDefinitionMap.put("/", "user");
        filterChainDefinitionMap.put("/**", "authc");

        filterChainDefinitionMap.put("/hello", "perms[how_are_you]");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        System.out.println("shiro拦截器工厂成功");
        return shiroFilterFactoryBean;

    }

    @Bean
    public SecurityManager securityManager(MyShiroRealm myShiroRealm){
        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
        securityManager.setRealm(myShiroRealm);
        return securityManager;
    }

    @Bean
    public MyShiroRealm myShiroRealm(){
        MyShiroRealm myShiroRealm=new MyShiroRealm();
        return myShiroRealm;
    }


}
