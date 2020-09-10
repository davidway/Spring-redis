package boot.spring.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class JedisConfig {
	@Bean
    public Jedis jedis(JedisPool pool) {
		pool = jedisPool();
        Jedis conn = pool.getResource();
        conn.select(15);
        return conn;
    }
	
	@Bean
    public JedisPool jedisPool() {
		return new JedisPool(jedisPoolConfig(), "localhost", 6379);
	}
	
	@Bean
    public JedisPoolConfig jedisPoolConfig() {
		//获得连接池配置对象，设置配置项
        JedisPoolConfig config = new JedisPoolConfig();
        //最大连接数
        config.setMaxTotal(30);
        //最大空闲连接数
        config.setMaxIdle(10);
        return config;
	}
}
