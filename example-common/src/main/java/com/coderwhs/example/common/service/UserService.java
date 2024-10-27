package com.coderwhs.example.common.service;

import com.coderwhs.example.common.model.User;

/**
 * @Author whs
 * @Date 2024/10/27 20:04
 * @description:
 */
public interface UserService {
  /**
   * 获取用户
   *
   * @param user
   * @return
   */
  User getUser(User user);
}
