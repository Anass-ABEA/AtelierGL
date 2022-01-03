FROM java:8
EXPOSE 8001
ADD /target/spring-petclinic-2.5.0-SNAPSHOT.war spring-petclinic-2.5.0-SNAPSHOT.war
ENTRYPOINT ["java","-jar","spring-petclinic-2.5.0-SNAPSHOT.war"]
