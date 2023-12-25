package br.infnet.com.venda.service.impl;

import br.infnet.com.venda.model.Receita;
import br.infnet.com.venda.model.Vacina;
import br.infnet.com.venda.service.api.ReceitaAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaAPIServiceImpl {

    @Autowired
    ReceitaAPIService receitaAPIService;

    public List<Receita> getAllVacina(List<Long> ids) {
        return ids.stream().map(id -> receitaAPIService.getById(id)).toList();
    }

    public Receita comprar(Receita receita) {
        return receitaAPIService.Comprar(receita);
    }
}
