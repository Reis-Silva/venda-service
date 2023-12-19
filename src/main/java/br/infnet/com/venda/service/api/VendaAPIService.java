package br.infnet.com.venda.service.api;

import br.infnet.com.venda.model.Venda;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "vacina-service", url = "http://localhost:8280")
public interface VendaAPIService {

    @RequestMapping(method = RequestMethod.GET, value = "/venda/{id}")
    Venda getById(@PathVariable Long id);
    
}
