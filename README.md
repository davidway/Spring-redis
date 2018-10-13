# Spring-redis
  随着Nosql分布式数据库的不断出现，各种非关系型数据库的重要性日益涌现。redis是一个在内存中运行的键值数据库，是一个业界闻名的分布式缓存。本项目基于Spring平台，整合redis数据库，为我们的业务逻辑添加redis数据缓存的功能。主要特性如下：
  
  1.redis的连接基于Spring-data-redis模块，官网：http://projects.spring.io/spring-data-redis/
  
  2.界面的功能与项目http://git.oschina.net/shenzhanwang/SSM 一模一样，只是在业务逻辑层ActorServiceImpl中添加了缓存支持；
  
  3.一般读取方法需要添加@Cacheable，而删除需要使用@CacheEvict，添加和修改使用@CachePut，以防止失效的缓存数据在前端进行了展示；
  
  4.为了不引起歧义，缓存的名称保持与方法名相同；
  
  5.为了表明一个操作是读取缓存数据还是拉取数据库数据，方法体中有控制台输出，如果是读取缓存则不会有控制台输出:
       ![输入图片说明](http://git.oschina.net/uploads/images/2016/1203/114814_d2e20090_1110335.jpeg "在这里输入图片标题")
       
 6.当访问了一次actor列表的页面后，我们看到redis数据库中新增了记录：
     ![输入图片说明](http://git.oschina.net/uploads/images/2016/1203/114840_6b798e23_1110335.jpeg "在这里输入图片标题")
     
 7.以下是添加了缓存的页面：
  ![输入图片说明](http://git.oschina.net/uploads/images/2016/1203/114855_61a29982_1110335.jpeg "在这里输入图片标题")

### 附录：个人作品索引目录（持续更新）

#### 基础篇:职业化，从做好OA系统开始
1. [SpringMVC,Mybatis,Spring三大框架的整合实现增删改查](https://gitee.com/shenzhanwang/SSM)
2. [Struts2,Hibernate,Spring三大框架的整合实现增删改查](https://gitee.com/shenzhanwang/S2SH)
3. [Spring,SpringMVC和Hibernate的整合实现增删改查](https://gitee.com/shenzhanwang/SSH)
4. [Spring平台整合activiti工作流引擎实现OA开发](https://gitee.com/shenzhanwang/Spring-activiti)
5. [Spring发布与调用REST风格的WebService](https://gitee.com/shenzhanwang/Spring-REST)
6. [Spring整合Apache Shiro框架，实现用户管理和权限控制](https://gitee.com/shenzhanwang/Spring-shiro)
7. [使用Spring security做权限控制](https://gitee.com/shenzhanwang/spring-security-demo)
8. [Spring整合Jasig CAS框架实现单点登录](https://gitee.com/shenzhanwang/Spring-cas-sso)
#### 中级篇：中间件的各种姿势
9. [Spring连接mongoDB数据库实现增删改查](https://gitee.com/shenzhanwang/Spring-mongoDB)
10. [Spring连接Redis实现缓存](https://gitee.com/shenzhanwang/Spring-redis)
11. [Spring连接图存数据库Neo4j实现增删改查](https://gitee.com/shenzhanwang/Spring-neo4j)
12. [Spring平台整合消息队列ActiveMQ实现发布订阅、生产者消费者模型（JMS）](https://gitee.com/shenzhanwang/Spring-activeMQ)
13. [Spring整合消息队列RabbitMQ实现四种消息模式（AMQP）](https://gitee.com/shenzhanwang/Spring-rabbitMQ)
14. Spring框架的session模块实现集中式session管理（未开源）
15. [Spring整合websocket实现即时通讯](https://gitee.com/shenzhanwang/Spring-websocket)
16. 使用Spring boot整合mybatis,rabbitmq,redis,mongodb实现增删改查（未开源）
17. [Spring MVC整合FastDFS客户端实现文件上传](https://gitee.com/shenzhanwang/Spring-fastdfs)
18. 23种设计模式，源码、注释、使用场景（未开源）
19. 使用ETL工具Kettle的实例（未开源）
20. Git指南和分支管理策略（未开源）
#### 高级篇：架构之美
21. [zookeeper原理、架构、使用场景和可视化](https://gitee.com/shenzhanwang/zookeeper-practice)
22. 使用ubuntu+apache+SVN+SVNadmin+maven+Nexus+Hudson搭建持续集成环境（未开源）
23. 使用jenkins+centos+git+maven搭建持续集成环境自动化部署分布式服务（未开源）
24. Spring框架整合dubbo框架实现分布式服务治理（SOA架构）（未开源）
25. Spring框架整合dubbox实现微服务架构（MSA架构）（未开源）
26. 使用Spring Cloud实现微服务架构（MSA架构）（未开源）
27. 使用FastDFS搭建分布式文件系统（高可用、负载均衡）（未开源）
28. 搭建高可用nginx集群和Tomcat负载均衡（未开源）
29. 搭建可扩展的ActiveMQ高可用集群（未开源）
30. 实现Mysql数据库的主从复制、读写分离、分表分库、负载均衡和高可用（未开源）
31. 搭建高可用redis集群实现分布式缓存（未开源）
32. [Spring整合SolrJ实现全文检索](https://gitee.com/shenzhanwang/Spring-solr)
#### 特别篇：分布式事务和并发控制
33. 基于可靠消息最终一致性实现分布式事务（activeMQ）（未开源）
34. 使用TCC框架实现分布式事务（dubbo版）（未开源）
35. 使用TCC框架实现分布式事务（Spring Cloud版）（未开源）
36. 决战高并发：数据库锁机制和事务隔离级别的使用（未开源）
37. 决战高并发：使用redis实现分布式锁（未开源）
38. 决战高并发：使用zookeeper实现分布式锁（未开源）
39. 决战高并发：Java多线程编程实例（未开源）
40. 决战高并发：使用netty实现高性能NIO通信（未开源）

### 捐赠区
![输入图片说明](https://images.gitee.com/uploads/images/2018/0719/154323_12a5c89c_1110335.jpeg "mm_facetoface_collect_qrcode_1531986023521.jpg")
