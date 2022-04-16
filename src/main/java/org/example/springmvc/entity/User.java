package org.example.springmvc.entity;

import lombok.Data;

/**
 * <p>用户</p>
 *
 * @author : ninggelin
 * @date : 2022-04-13 16:39
 **/
@Data
public class User {
    private Long id;
    private String name;
    private Address address;
}
