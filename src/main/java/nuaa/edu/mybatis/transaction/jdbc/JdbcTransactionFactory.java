package nuaa.edu.mybatis.transaction.jdbc;

import nuaa.edu.mybatis.session.TransactionIsolationLevel;
import nuaa.edu.mybatis.transaction.Transaction;
import nuaa.edu.mybatis.transaction.TransactionFactory;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @Classname JdbcTransactionFactory
 * @Description
 * @Date 2023/1/6 15:54
 * @Created by brain
 */
public class JdbcTransactionFactory implements TransactionFactory {
    @Override
    public Transaction newTransaction(Connection conn) {
        return new JdbcTransaction(conn);
    }

    @Override
    public Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit) {
        return new JdbcTransaction(dataSource,level,autoCommit);
    }
}
