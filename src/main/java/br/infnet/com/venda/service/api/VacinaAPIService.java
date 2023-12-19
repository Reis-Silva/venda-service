package br.infnet.com.venda.service.api;

import br.infnet.com.venda.model.Vacina;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "venda-service", url = "http://localhost:8280")
public interface VacinaAPIService {

    @RequestMapping(method = RequestMethod.GET, value = "/vacina/{id}")
    Vacina getById(@PathVariable Long id);

}
