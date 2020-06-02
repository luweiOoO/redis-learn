import com.luwei.redislearn.RedisLearnApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisLearnApplication.class)
public class redisTest {

    @Resource
    private StringRedisTemplate redisTemplate;

    @Test
    public void redisT(){
        redisTemplate.opsForValue().set("a","b");
        Boolean rsult = redisTemplate.hasKey("is");
        System.out.println("是否存在______________-"+ rsult);
    }
}
