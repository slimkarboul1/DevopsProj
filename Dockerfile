FROM openjdk:15
EXPOSE 8081
ADD /target/timesheet-1.0-SNAPSHOT.jar timesheet-1.0-SNAPSHOT.jar 
ENTRYPOINT ["java", "-jar", "timesheet-3.1-SNAPSHOT.jar"]
