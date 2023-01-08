package nuaa.edu.mybatis.datasource;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @Classname DataSourceFactory
 * @Description
 * @Date 2023/1/6 16:00
 * @Created by brain
 */
public interface DataSourceFactory {
    void setProperties(Properties props);

    DataSource getDataSource();
}
