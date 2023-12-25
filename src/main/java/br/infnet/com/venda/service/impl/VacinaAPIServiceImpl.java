package br.infnet.com.venda.service.impl;

import br.infnet.com.venda.model.Vacina;
import br.infnet.com.venda.service.api.VacinaAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacinaAPIServiceImpl {

    @Autowired
    VacinaAPIService vacinaAPIService;

    public List<Vacina> getAllVacina(List<Long> ids) {
        return ids.stream().map(id -> vacinaAPIService.getById(id)).toList();
    }

    public Vacina comprar(Vacina vacina) {
        return vacinaAPIService.Comprar(vacina);
    }
}
