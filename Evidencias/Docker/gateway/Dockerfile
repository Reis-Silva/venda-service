FROM amazoncorretto:17-alpine
COPY api-gateway-service.jar api-gateway-service.jar
ENTRYPOINT [ "java", "-jar", "/api-gateway-service.jar" ]
# docker build -t cesar/api-gateway-service .
# docker network create cesar-ms-network
# docker run --name api-gateway-service --network cesar-ms-network -p 9090:9090 cesar/api-gateway-service