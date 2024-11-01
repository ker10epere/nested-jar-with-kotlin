# PACKAGE ONLY FOR TARGET DIRECTORY
mvn -f provided-client/pom.xml clean package

# PACKAGE FOR TARGET AND M2 REPOSITORY
mvn -pl web-entrypoint/ clean install

# ONLY INCLUDES BOOT-INF LIBRARIES
java -jar web-entrypoint/target/web-entrypoint-0.0.1-SNAPSHOT.jar

# ONLY INCLUDES SYSTEM JAR
mvn -pl web-entrypoint -P dev spring-boot:run

# DELETE FROM M2 REPOSITORY
mvn -pl web-entrypoint/ dependency:purge-local-repository -DmanualInclude="com.begodly:web-entrypoint" -DsnapshotsOnly=true

# INSTALL JAR TO M2 REPOSITORY
mvn org.apache.maven.plugins:maven-install-plugin:3.1.3:install-file \
                         -Dfile=provided-client/target/provided-client-0.0.1-SNAPSHOT.jar -DgroupId=com.begodly \
                         -DartifactId=provided-client -Dversion=0.0.1-SNAPSHOT \
                         -Dpackaging=jar 
                         
                         -DlocalRepositoryPath=<path>



