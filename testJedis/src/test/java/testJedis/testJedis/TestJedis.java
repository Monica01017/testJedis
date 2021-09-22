package testJedis.testJedis;

import redis.clients.jedis.Jedis;

public class TestJedis {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");//localhost可以换为其他url接口
		jedis.set("你好~", "中秋节快乐！");//赋值，将"你好~"的值设置为"中秋节快乐！"
		String value = jedis.get("你好~");
		System.out.print(value);
	}
}
