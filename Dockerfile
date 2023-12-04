FROM openjdk:17-jdk-alpine
#ARG JAR_FILE=build/libs/*.jar
COPY ./build/libs/demo-0.0.1-SNAPSHOT.jar app12.jar
ENTRYPOINT ["java","-jar","/app12.jar"]
