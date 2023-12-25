FROM amazoncorretto:17-alpine
COPY eureka.jar eureka.jar
ENTRYPOINT [ "java", "-jar", "/eureka.jar" ]
# cesar/eureka
# docker network create cesar-ms-network
# docker run --name eureka-server --network cesar-ms-network -p 8761:8761 cesar/eureka