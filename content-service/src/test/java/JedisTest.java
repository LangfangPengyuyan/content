
//public class JedisTest {

//    //单机
//    public void testJedisPool() throws Exception{
//        //创建一个连接池对象，两个参数host、port
//        JedisPool jedisPool = new JedisPool();
//        //从连接池获得一个连接，就是一个jedis对象
//        Jedis jedis = jedisPool.getResource();
//        //使用jedis操作redis
//        String string = jedis.get("test123");
//        System.out.println(string);
//        //关闭连接，每次使用完毕后关闭连接。连接池回收资源
//        jedis.close();
//        //关闭连接池
//        jedisPool.close();
//    }

//    //集群
//    @Test
//    public void testJedisCluster() throws Exception{
//        //创建一个JedisCluster对象。有一个参数nodes是一个set类型。set中包含若干个HostAndPort对象
//        HashSet<HostAndPort> nodes = new HashSet<>();
//        nodes.add(new HostAndPort("", ));
//        nodes.add(new HostAndPort("", ));
//        nodes.add(new HostAndPort("", ));
//        nodes.add(new HostAndPort("", ));
//        nodes.add(new HostAndPort("", ));
//        nodes.add(new HostAndPort("", ));
//        JedisCluster jedisCluster = new JedisCluster(nodes);
//        //直接使用JedisCluster独享操作redis
//        jedisCluster.set("test","123");
//        String string = jedisCluster.get("test");
//        System.out.println(string);
//        //关闭JedisCluster对象
//        jedisCluster.close();
//    }
//}
