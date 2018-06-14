FROM openjdk:8-jdk-alpine


# 设置工作目录
WORKDIR /app

EXPOSE 20880

COPY dubbo-spring-boot-provider-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]