package com.huateng.weixin.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisTokenHelper {

	      private static final String ip= "182.61.37.214.";
	      private static final int port=6379;
	      protected static RedisTokenHelper redis = new RedisTokenHelper ();
	      private static JedisPool  jedisPool;
	      protected static Jedis jedis = new Jedis( ip, port);;
	      static {
	           
	     }
	    public RedisTokenHelper(){
	       System. out.println( " init Redis ");
	    }
	    public static RedisTokenHelper getInstance()
	    {
	        return redis;
	    }
	   
	    /**set Object*/
	      public String set(Object object,String key)
	     {
	            return jedis.set(key.getBytes(), SerializeUtil.serialize(object));
	     }
	     
	      /**get Object*/
	      public Object get(String key)
	     {
	            byte[] value = jedis.get(key.getBytes());
	            return SerializeUtil. unserialize(value);
	     }
	     
	      /**delete a key**/
	      public boolean del(String key)
	     {
	            return jedis.del(key.getBytes())>0;
	     }
	      
	      /**
	       * 获取Jedis实例
	       * @return
	       */
	      public synchronized static Jedis getJedis() {
	          try {
	              if (jedisPool != null) {
	                  Jedis resource = jedisPool.getResource();
	                  return resource;
	              } else {
	                  return null;
	              }
	          } catch (Exception e) {
	              e.printStackTrace();
	              return null;
	          }
	      }
	      
	      /**
	       * 释放jedis资源
	       * @param jedis
	       */
	      public static void returnResource(final Jedis jedis) {
	          if (jedis != null) {
	              jedisPool.returnResource(jedis);
	          }
	      }

	
}
