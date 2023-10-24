FROM eclipse-temurin:17
COPY target/webapplications.jar webapplications.jar
CMD [ "java", "-jar","webapplications.jar" ]