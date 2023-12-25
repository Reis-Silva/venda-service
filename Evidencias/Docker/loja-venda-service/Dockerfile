FROM amazoncorretto:17-alpine
COPY loja-venda-service.jar loja-venda-service.jar
ENTRYPOINT [ "java", "-jar", "/loja-venda-service.jar" ]
# docker build -t cesar/loja-venda-service .
# docker network create cesar-ms-network
# docker run --network cesar-ms-network cesar/loja-venda-service