mvn -f provided-client/pom.xml clean package
mvn -pl web-entrypoint/ clean package

# ONLY INCLUDES BOOT-INF LIBRARIES
java -jar web-entrypoint/target/web-entrypoint-0.0.1-SNAPSHOT.jar

# ONLY INCLUDES SYSTEM JAR
mvn -pl web-entrypoint -P dev spring-boot:run

