FROM amazoncorretto:17-alpine
COPY eureka-service.jar eureka-service.jar
ENTRYPOINT [ "java", "-jar", "/eureka-service.jar" ]
# docker build -t cesar/eureka-service .
# docker network create cesar-ms-network
# docker run --name eureka-server --network cesar-ms-network -p 8761:8761 cesar/eureka-service