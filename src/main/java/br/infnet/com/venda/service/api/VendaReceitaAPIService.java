package br.infnet.com.venda.service.api;

import br.infnet.com.venda.model.Receita;
import br.infnet.com.venda.model.Venda;
import jakarta.ws.rs.POST;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "loja-venda--receita-service", url = "http://localhost:8080")
public interface VendaReceitaAPIService {

    @RequestMapping(method = RequestMethod.GET, value = "/venda/{id}")
    Venda getById(@PathVariable Long id);
}
