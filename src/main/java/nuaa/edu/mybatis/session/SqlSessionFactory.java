package nuaa.edu.mybatis.session;

/**
 * @Classname SqlSessionFactory
 * @Description
 * @Date 2023/1/4 11:05
 * @Created by brain
 */
public interface SqlSessionFactory {
    /**
     * 打开一个 session
     * @return SqlSession
     */
    SqlSession openSession();
}
