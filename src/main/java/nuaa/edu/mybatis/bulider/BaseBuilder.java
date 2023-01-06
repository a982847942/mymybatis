package nuaa.edu.mybatis.bulider;

import nuaa.edu.mybatis.session.Configuration;

/**
 * @Classname BaseBulider
 * @Description
 * @Date 2023/1/4 20:35
 * @Created by brain
 */
public class BaseBuilder {
    protected final Configuration configuration;

    public BaseBuilder(Configuration configuration) {
        this.configuration = configuration;
    }

    public Configuration getConfiguration() {
        return configuration;
    }
}
