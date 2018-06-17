FROM openjdk:8-jdk-alpine


# 设置工作目录
WORKDIR /app

COPY *.jar /app/app.jar

EXPOSE 20880

ENTRYPOINT ["java","-jar","/app/app.jar"]