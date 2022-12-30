package test01;

import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Classname APITest
 * @Description
 * @Date 2022/12/30 19:08
 * @Created by brain
 */
public class APITest {

    private static Logger logger = LoggerFactory.getLogger(APITest.class);
    @Test
    public void test(){
        logger.info("hello mybatis");
    }

}
