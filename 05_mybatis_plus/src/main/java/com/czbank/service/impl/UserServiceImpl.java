package com.czbank.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czbank.entity.User;
import com.czbank.mapper.UserMapper;
import com.czbank.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author scofield
 * @since 2021-06-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public boolean save(User user){
        int insert = baseMapper.insert(user);
        if(1==insert){
            return true;
        }
        return  false;
    }


    @Override
    public int update(User user){
       /* UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.set(user.getAge().toString(),20);
        int update = baseMapper.update(null,updateWrapper);*/
       return baseMapper.updateById(user);
    }

    @Override
    public int updateAge(Long id, String age) {
        UpdateWrapper<User> set = new UpdateWrapper<User>().eq("id", id).set("age", age);
        return baseMapper.update(null, set);
    }

    @Override
    public User getUserById(Long id) {
        return baseMapper.selectById(id);
    }
}
