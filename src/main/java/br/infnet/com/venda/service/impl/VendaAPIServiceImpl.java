package br.infnet.com.venda.service.impl;

import br.infnet.com.venda.model.Venda;
import br.infnet.com.venda.service.api.VendaReceitaAPIService;
import br.infnet.com.venda.service.api.VendaVacinaAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaAPIServiceImpl {

    @Autowired
    VendaVacinaAPIService vendaVacinaAPIService;

    @Autowired
    VendaReceitaAPIService vendaReceitaAPIService;

    public List<Venda> getAllVendasVacina(List<Long> ids) {
        return ids.stream().map(id -> vendaVacinaAPIService.getById(id)).toList();
    }

    public List<Venda> getAllVendasReceita(List<Long> ids) {
        return ids.stream().map(id -> vendaReceitaAPIService.getById(id)).toList();
    }
}
