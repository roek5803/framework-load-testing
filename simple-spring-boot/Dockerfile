FROM anapsix/alpine-java
EXPOSE 8080

## Add nice to haves
RUN apk add nano
RUN apk add bash
RUN apk add curl

COPY target/simple-spring-boot-0.0.1-SNAPSHOT.jar  /opt/
WORKDIR /opt

CMD bash -c "java -jar simple-spring-boot-0.0.1-SNAPSHOT.jar"



