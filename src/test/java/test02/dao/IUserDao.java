package test02.dao;

/**
 * @Classname IUserDao
 * @Description
 * @Date 2023/1/4 11:28
 * @Created by brain
 */
public interface IUserDao {
    String queryUserName(String uId);
    Integer queryUserAge(String uId);
}
