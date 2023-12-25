package br.infnet.com.venda;

import info.schnatterer.mobynamesgenerator.MobyNamesGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LojaVendaApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(MobyNamesGenerator.getRandomName());
    }

}
