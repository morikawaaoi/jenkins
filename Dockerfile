FROM openjdk
VOLUME /tmp
ADD target/jenkins-docker-test-1.0-SNAPSHOT.jar app.jar
EXPOSE 5541
ENTRYPOINT ["Bash","-DBash.security.egd=file:/dev/./urandom","-jar","/app.jar","--spring.profiles.active=prd"]