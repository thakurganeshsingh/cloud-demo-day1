FROM openjdk:8-jdk-alpine
RUN addgroup -S harman && adduser -S harman -G harman
USER harman:harman
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} harman-health-api.jar
ENTRYPOINT ["java","-jar","/harman-health-api.jar"]