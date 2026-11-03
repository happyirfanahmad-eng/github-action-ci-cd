FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/*.war app.war
EXPOSE 9990
ENTRYPOINT ["java","-jar","app.war"]

