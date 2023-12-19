package br.infnet.com.venda.service.impl;

import br.infnet.com.venda.model.Vacina;
import br.infnet.com.venda.model.Venda;
import br.infnet.com.venda.service.api.VacinaAPIService;
import br.infnet.com.venda.service.api.VendaAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaAPIServiceImpl {

    @Autowired
    VendaAPIService vendaAPIService;

    public List<Venda> getAllVendas(List<Long> ids) {
        return ids.stream().map(id -> vendaAPIService.getById(id)).toList();
    }
}
