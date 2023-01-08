package nuaa.edu.mybatis.mapping;

import nuaa.edu.mybatis.transaction.TransactionFactory;

import javax.sql.DataSource;

/**
 * @Classname Environment
 * @Description
 * @Date 2023/1/6 16:06
 * @Created by brain
 */
public class Environment {
    //id
    private final String id;
    //事务工厂
    private final TransactionFactory transactionFactory;
    //数据源
    private final DataSource dataSource;

    public Environment(String id, TransactionFactory transactionFactory, DataSource dataSource) {
        this.id = id;
        this.transactionFactory = transactionFactory;
        this.dataSource = dataSource;
    }

    public static class Builder{
        private String id;
        private TransactionFactory transactionFactory;
        private DataSource dataSource;
        public Builder(String id) {
            this.id = id;
        }

        public Builder transactionFactory(TransactionFactory transactionFactory) {
            this.transactionFactory = transactionFactory;
            return this;
        }

        public Builder dataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public String id() {
            return this.id;
        }

        public Environment build() {
            return new Environment(this.id, this.transactionFactory, this.dataSource);
        }
    }
    public String getId() {
        return id;
    }

    public TransactionFactory getTransactionFactory() {
        return transactionFactory;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}
