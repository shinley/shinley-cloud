package com.shinley.feign.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person implements Serializable {
    private static final long serialVersionUID = 9000181780533977816L;
    private Integer pid;
    private String pname;
}

