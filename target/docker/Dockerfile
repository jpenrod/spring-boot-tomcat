FROM frolvlad/alpine-oraclejdk8:slim
EXPOSE 8080
VOLUME /tmp
ADD gs-spring-boot-docker-0.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]