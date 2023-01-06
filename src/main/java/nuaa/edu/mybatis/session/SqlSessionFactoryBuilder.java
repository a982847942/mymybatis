package nuaa.edu.mybatis.session;

import nuaa.edu.mybatis.bulider.xml.XMLConfigBuilder;
import nuaa.edu.mybatis.session.defaults.DefaultSqlSessionFactory;

import java.io.Reader;

/**
 * @Classname SqlSessionFactoryBuilder
 * @Description
 * @Date 2023/1/4 20:31
 * @Created by brain
 */
public class SqlSessionFactoryBuilder {
    public SqlSessionFactory build(Reader reader) {
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder(reader);
        return build(xmlConfigBuilder.parse());
    }

    public SqlSessionFactory build(Configuration config) {
        return new DefaultSqlSessionFactory(config);
    }

}
