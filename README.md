# Spring-redis
  随着Nosql分布式数据库的不断出现，各种非关系型数据库的重要性日益涌现。redis是一个在内存中运行的键值数据库，是一个业界闻名的分布式缓存。本项目基于Spring平台，整合redis数据库，为我们的业务逻辑添加redis数据缓存的功能。主要特性如下：
  
  1.redis的连接基于Spring-data-redis模块，官网：http://projects.spring.io/spring-data-redis/
  
  2.界面的功能与项目http://git.oschina.net/shenzhanwang/SSM 一模一样，只是在业务逻辑层ActorServiceImpl中添加了缓存支持；
  
  3.添加缓存使用@Cacheable注解，清空缓存使用@CacheEvict注解。一般读取方法需要添加@Cacheable，而删除需要使用@CacheEvict，添加和修改使用@CachePut，以防止失效的缓存数据在前端进行了展示；
  
  4.为了不引起歧义，缓存的名称保持与方法名相同；
  
  5.为了表明一个操作是读取缓存数据还是拉取数据库数据，方法体中有控制台输出，如果是读取缓存则不会有控制台输出:
       ![输入图片说明](http://git.oschina.net/uploads/images/2016/1203/114814_d2e20090_1110335.jpeg "在这里输入图片标题")
       
 6.当访问了一次actor列表的页面后，我们看到redis数据库中新增了记录：
     ![输入图片说明](http://git.oschina.net/uploads/images/2016/1203/114840_6b798e23_1110335.jpeg "在这里输入图片标题")
     
 7.以下是添加了缓存的页面：
  ![输入图片说明](http://git.oschina.net/uploads/images/2016/1203/114855_61a29982_1110335.jpeg "在这里输入图片标题")
