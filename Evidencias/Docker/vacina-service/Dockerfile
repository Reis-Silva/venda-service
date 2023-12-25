FROM amazoncorretto:17-alpine
COPY vacina-service-servidor.jar vacina-service-servidor.jar
ENTRYPOINT [ "java", "-jar", "/vacina-service-servidor.jar" ]
# docker build -t cesar/vacina-service-servidor .
# docker network create cesar-ms-network
# docker run --network cesar-ms-network cesar/vacina-service-servidor