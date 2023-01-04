package test01;

/**
 * @Classname IUserDao
 * @Description
 * @Date 2022/12/30 19:35
 * @Created by brain
 */
public interface IUserDao {
    String queryUserName(String uId);
    String queryUserAge(String uId);
}
