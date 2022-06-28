package test.java.org.mt.utils.utilTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mt.utils.RedisLockManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by wanghaiguang on 2022/6/21 上午11:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisLockManagerTest {
    @Autowired
    RedisLockManager redisLockManager;

    @Test
    public void test01() {
        Supplier<Integer>  execFunc = () -> {
            return 0;
        };
        Supplier<Integer>  failCallBack = () -> {
            return 0;
        };
        Function<Exception, Integer> errorBack = new Function<Exception, Integer>() {
            @Override
            public Integer apply(Exception s) {
                //
                return null;
            }
        };
        redisLockManager.execWithinLock("key",3,execFunc,failCallBack,errorBack);
    }
}
