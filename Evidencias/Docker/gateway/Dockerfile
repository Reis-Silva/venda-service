FROM amazoncorretto:17-alpine
COPY api-gateway.jar api-gateway.jar
ENTRYPOINT [ "java", "-jar", "/api-gateway.jar" ]
# docker build -t cesar/api-gateway .
# docker network create cesar-ms-network
# docker run --name api-gateway-server --network cesar-ms-network -p 9090:9090 cesar/api-gateway