package cn.sjtu.springwebjpa.service;

import cn.sjtu.springwebjpa.dto.User;

import java.util.Optional;

/**
 * @author xuan
 * @date 2019-05-09 18:31.
 */

public interface UserService {
    Optional<User> get(String name);
}
