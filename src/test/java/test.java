import org.junit.Test;
import redis.clients.jedis.Jedis;

public class test {
    @Test
    public void demo(){
        Jedis jedis=new Jedis("localhost",6379);
        System.out.println(jedis.ping());
        jedis.set("1","100");
        jedis.sadd("name","lucy","jack");
        //修改版本号
        //fox-fix
        //对方是否
        jedis.close();


    }
}
