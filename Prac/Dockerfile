FROM openjdk:17
Expose 8080

ADD target/Spring-docker.jar Spring-docker.jar

ENTRYPOINT ["java","-jar","/Spring-docker.jar"]