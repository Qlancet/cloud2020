package com.czbank.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czbank.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author scofield
 * @since 2021-06-27
 */
public interface UserService extends IService<User> {

    @Override
    boolean save(User entity) ;

    public int update(User user);

    public int updateAge(@PathVariable("id") Long id, @Param("age")String age);

    public User getUserById(Long id);
}
