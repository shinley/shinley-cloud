package com.shinley.feign.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person implements Serializable {
    // 两个类属性都一样时， 如果serialVersionUID相同，可以认为是同一个类， 就可以互相续列化
    private static final long serialVersionUID = 9000181780533977816L;
    private Integer pid;
    private String pname;
}

