package com.shiro.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Role {

    @Id
    @GeneratedValue
    private Long id;
    private String roleName;
    private String roledesc;
    private List<Permission> permissions;


}
