package br.infnet.com.venda;

import info.schnatterer.mobynamesgenerator.MobyNamesGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Properties;

@SpringBootApplication
@EnableFeignClients
public class LojaVendaApplication {
    public static void main(String[] args) {
        SpringApplication.run(LojaVendaApplication.class, args);
    }
}
