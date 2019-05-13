package cn.sjtu.springwebjpa.dao;

import cn.sjtu.springwebjpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author xuan
 * @date 2019-05-09 18:35.
 */

public interface UserRepo  extends JpaRepository<UserEntity,Integer>{

    UserEntity findByUsername(String username);

}
