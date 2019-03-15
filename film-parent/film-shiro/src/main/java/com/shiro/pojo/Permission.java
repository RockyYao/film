package com.shiro.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;


@Entity
public class Permission {
    @Id
    @GeneratedValue
    private int id;
    private String modelname;
    private String permission;

    private List<Role> roles;//角色权限关系   多对多

}
