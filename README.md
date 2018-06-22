Spring Boot整合dubbo和zookeeper
---------

这个demo是基于[dubbo-spring-boot-starter](https://github.com/apache/incubator-dubbo-spring-boot-project "悬停显示")写的，官方的包本身就能达到集成zookeeper的，但是官方并没有给出一个demo。

## 准备  
### zookeeper安装启动  
### 下载dubbo源码打包 
官方包使用的dubbo源码的最新版本2.6.2已经发布，不需要下载dubbo打包。
如果需要使用dubbo的SNAPSHOT版本，需要你自己下载源码打包到本地。
```
git clone git@github.com:apache/incubator-dubbo.git
cd incubator-dubbo
mvn clean install -DskipTests -Drat.skip=true
```
### 下载[dubbo-spring-boot-starter](https://github.com/apache/incubator-dubbo-spring-boot-project "https://github.com/apache/incubator-dubbo-spring-boot-project")源码打包  
如果不想下载打包也行，直接用官方的包，不过官方只提供了0.1.0版本的包，只能兼容Spring Boot 1.5.x的版本
为了使用Spring boot 2.0.x版本，需要mvn install使用0.2.0-SNAPSHOT版本

官方已发布0.2.0正式版，可以直接使用

```
官方版本
<dependency>
    <groupId>com.alibaba.boot</groupId>
    <artifactId>dubbo-spring-boot-starter</artifactId>
    <version>0.1.0</version>
</dependency>

手动打包
git clone https://github.com/apache/incubator-dubbo-spring-boot-project.git
cd incubator-dubbo-spring-boot-project
mvn clean install -DskipTests -Drat.skip=true
```
### dubbo-spring-boot-provider实现和配置
```
主类上加入@DubboComponentScan扫描dubbo的service
实现参见com.sqshine.dubbo.provider.service.BookService
```
application.properties配置
```
参见application.yml文件
```

### spring-boot-cosumer实现和配置
```
参见com.sqshine.dubbo.consumer.controller.BookController
```
application.properties配置
```
参见application.yml文件
```

### 生产docker iamge
```
mvn clean package docker:build -Dmaven.test.skip=true

执行docker provider注册,-p端口和DUBBO_PORT_TO_REGISTRY的端口同时要改变
docker run -d -p 20880:20880 -e DUBBO_IP_TO_REGISTRY=192.168.30.197 -e DUBBO_PORT_TO_REGISTRY=20880 dubbo-springboot/dubbo-spring-boot-provider
```
