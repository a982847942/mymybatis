package nuaa.edu.mybatis.bulider;

import nuaa.edu.mybatis.session.Configuration;
import nuaa.edu.mybatis.type.TypeAliasRegistry;

/**
 * @Classname BaseBulider
 * @Description
 * @Date 2023/1/4 20:35
 * @Created by brain
 */
public class BaseBuilder {
    protected final Configuration configuration;
    protected final TypeAliasRegistry typeAliasRegistry;

    public BaseBuilder(Configuration configuration) {
        this.configuration = configuration;
        typeAliasRegistry = this.configuration.getTypeAliasRegistry();
    }

    public Configuration getConfiguration() {
        return configuration;
    }
}
