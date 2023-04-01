package github.com;

import com.alibaba.fastjson.JSONObject;
import org.redisson.Redisson;
import org.redisson.api.RDeque;
import org.redisson.api.RedissonClient;
import org.redisson.api.RedissonReactiveClient;
import org.redisson.api.RedissonRxClient;
import org.redisson.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Hello world!
 */
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        // 1. Create config object
        Config config = null;
        URL resource = App.class.getClassLoader().getResource("redis-config.yaml");
        if (resource == null) {
            log.error("not find redis-config.yaml");
            return;
        }
        try {
            config = Config.fromYAML(new File(resource.getPath()));
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            return;
        }

        log.info(JSONObject.toJSONString(config));

        // 2. Create Redisson instance
        // Sync and Async API
        RedissonClient redisson = Redisson.create(config);

        // Reactive API
        RedissonReactiveClient redissonReactive = redisson.reactive();

        // RxJava3 API
        RedissonRxClient redissonRx = redisson.rxJava();

        RDeque<String> queue = redisson.getDeque("anyDeque");
        queue.addFirst("a");
        queue.addLast("b");
    }

}
