FROM openjdk:15
EXPOSE 8081
ADD /target/timesheet-3.1-SNAPSHOT.jar timesheet-3.1-SNAPSHOT.jar 
ENTRYPOINT ["java", "-jar", "timesheet-3.1-SNAPSHOT.jar"]
