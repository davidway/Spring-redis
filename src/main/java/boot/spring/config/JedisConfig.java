package boot.spring.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class JedisConfig {
	@Bean
	public JedisPool redisPoolFactory() throws Exception {
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxIdle(100000);
		jedisPoolConfig.setMaxWaitMillis(1000);
		// 连接耗尽时是否阻塞, false报异常,ture阻塞直到超时, 默认true
		jedisPoolConfig.setBlockWhenExhausted(true);
		// 是否启用pool的jmx管理功能, 默认true
		jedisPoolConfig.setJmxEnabled(true);
		JedisPool jedisPool = new JedisPool(jedisPoolConfig, "localhost", 6379, 50000);
		return jedisPool;
	}
}
