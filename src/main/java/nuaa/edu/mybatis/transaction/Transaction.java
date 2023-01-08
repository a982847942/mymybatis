package nuaa.edu.mybatis.transaction;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Classname Transaction
 * @Description
 * @Date 2023/1/6 15:48
 * @Created by brain
 */
public interface Transaction {
    Connection getConnection() throws SQLException;

    void commit() throws SQLException;
    void rollback() throws SQLException;
    void close() throws SQLException;
}
