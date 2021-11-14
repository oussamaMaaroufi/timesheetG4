FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD target/timesheet-1.0.jar timesheet.jar
ENTRYPOINT ["java","-jar","/timesheet.jar"]