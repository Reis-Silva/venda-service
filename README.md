# Arquitetura de Microsserviços Java [23E4_3]

# INFNET
- Professor: Leonardo Glória
- Acadêmico: Júlio César Reis da Silva

# DESCRIÇÃO
- Projeto criado para a conexão com 2 microsserviços com ferramentas de tracing e escalabilidade: 1 - receita-service (Quarkus) e 2 - vacina-service (Spring-Boot).

# Ferramentas
- vacina-service: Zipkin - APiGateway - Eureka - micrometer-tracing - Papertrail (Mais detalhes das bibliotecas no Link: https://github.com/Reis-Silva/vacina-service/blob/main/pom.xml e https://github.com/Reis-Silva/vacina-service/blob/main/src/main/resources/application.yaml)
- receita-service: Jaeger - quarkus-opentelemetry - tracing (Mais detalhes das bibliotecas no Link: https://github.com/Reis-Silva/receita-service/blob/main/pom.xml e https://github.com/Reis-Silva/receita-service/blob/main/src/main/resources/application.yaml)

- OBS: Emulações de efeito de produção foram realizadas através da ferramenta: Docker.

# EVIDÊNCIAS
- Link para os prints que demonstram as evidências de emulação do projeto: https://github.com/Reis-Silva/venda-service/tree/main/Evidencias

# LINKS
- O projeto é constituido de 5 partes, os links estão abaixo:
- Parte 1: https://github.com/Reis-Silva/venda-service.git
- Parte 2: https://github.com/Reis-Silva/vacina-service.git
- Parte 3: https://github.com/Reis-Silva/receita-service.git
- Parte 4: https://github.com/Reis-Silva/eureka-service.git
- Parte 5: https://github.com/Reis-Silva/api-gateway.git
