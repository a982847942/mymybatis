package test04.dao;


import test04.po.User;

/**
 * @Classname IUserDao
 * @Description
 * @Date 2023/1/6 17:49
 * @Created by brain
 */
public interface IUserDao {
    User queryUserInfoById(Long uId);
}
