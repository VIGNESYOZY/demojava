FROM openjdk:8-jre-alpine

EXPOSE 8085
# Copy war file
COPY docker/devops-accelerator.war /devops-accelerator.war

# run the app
CMD ["/usr/bin/java", "-jar", "/devops-accelerator.war"]

