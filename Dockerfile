FROM openjdk:8-jdk-alpine
EXPOSE 8088
ADD target/timesheet-2.1-SNAPSHOT.jar timesheet-2.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/timesheet-2.1-SNAPSHOT.jar" ]