package cn.sjtu.springwebjpa.service.impl;

import cn.sjtu.springwebjpa.dao.UserRepo;
import cn.sjtu.springwebjpa.dto.User;
import cn.sjtu.springwebjpa.entity.UserEntity;
import cn.sjtu.springwebjpa.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author xuan
 * @date 2019-05-10 14:50.
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Optional<User> get(String name) {
        UserEntity e =repo.findByUsername(name);

        return e==null
                ? Optional.empty()
                : Optional.of(mapper.map(e,User.class));

    }
}
