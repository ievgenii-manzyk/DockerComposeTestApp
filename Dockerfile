FROM openjdk:8-jre
VOLUME ["/tmp"]
COPY build/libs/dockerComposeTestApp-1.0.0-SNAPSHOT.jar app.jar
COPY build/resources/main/start.sh start.sh
RUN sh -c 'touch app.jar'
#RUN sh -c 'chmod +x start.sh'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
