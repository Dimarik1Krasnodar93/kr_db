FROM openjdk:17.0.2-jdk
WORKDIR kr_kb
COPY build.gradle .
COPY settings.gradle .
COPY src ./src
RUN gradle build
EXPOSE 8181
ENTRYPOINT ["java", "-jar", "build/libs/kr_db-0.0.1-SNAPSHOT.jar"]