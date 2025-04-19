package org.example.warehousev1be.service;

import org.example.warehousev1be.entity.User;
import org.example.warehousev1be.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  //用户服务层
public class UserService {
    @Autowired  //@注入数据层变量
    private UserMapper userMapper;

    public List<User> loginService(User data) {
        List<User> queryResult = userMapper.queryUser(data);
        return queryResult;
    }
}
