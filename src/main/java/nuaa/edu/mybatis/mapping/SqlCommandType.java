package nuaa.edu.mybatis.mapping;

/**
 * @Classname SqlCommandType
 * @Description
 * @Date 2023/1/4 20:47
 * @Created by brain
 */
public enum  SqlCommandType {
    /**
     * 未知
     */
    UNKNOWN,
    /**
     * 插入
     */
    INSERT,
    /**
     * 更新
     */
    UPDATE,
    /**
     * 删除
     */
    DELETE,
    /**
     * 查找
     */
    SELECT;

}
