FROM adoptopenjdk:11-jre-hotspot
MAINTAINER radu
COPY target/parking-0.0.1-SNAPSHOT.jar application.jar

ENTRYPOINT ["java", "-jar", "application.jar"]