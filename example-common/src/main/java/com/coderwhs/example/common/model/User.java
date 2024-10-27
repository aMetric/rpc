package com.coderwhs.example.common.model;

import java.io.Serializable;

/**
 * @Author whs
 * @Date 2024/10/27 20:04
 * @description:
 * 需要实现序列化，为后续提供网络传输提供支持
 */
public class User implements Serializable {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
