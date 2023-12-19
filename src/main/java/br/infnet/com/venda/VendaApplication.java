package br.infnet.com.venda;

import info.schnatterer.mobynamesgenerator.MobyNamesGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Properties;

@SpringBootApplication
@EnableFeignClients
public class VendaApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(VendaApplication.class);
        Properties properties = new Properties();
        //int serverPort = new Random().nextInt(8280, 8290);
        String nickName = MobyNamesGenerator.getRandomName();
        properties.put("spring.application.serverNick", nickName);
        //properties.put("server.port", serverPort);
        springApplication.setDefaultProperties(properties);
        springApplication.run(args);
    }
}
