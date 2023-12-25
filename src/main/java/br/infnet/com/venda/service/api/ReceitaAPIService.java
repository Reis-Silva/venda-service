package br.infnet.com.venda.service.api;

import br.infnet.com.venda.model.Receita;
import br.infnet.com.venda.model.Vacina;
import jakarta.ws.rs.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "vacina-service", url = "http://localhost:8080/receita")
public interface ReceitaAPIService {

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    Receita getById(@PathVariable Long id);

    @RequestMapping(method = RequestMethod.POST)
    Receita Comprar(Receita vacina);
}
