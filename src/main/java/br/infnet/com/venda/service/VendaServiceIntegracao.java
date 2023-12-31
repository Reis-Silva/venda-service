package br.infnet.com.venda.service;

import br.infnet.com.venda.service.impl.ReceitaAPIServiceImpl;
import br.infnet.com.venda.service.impl.VacinaAPIServiceImpl;
import br.infnet.com.venda.service.impl.VendaAPIServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaServiceIntegracao {

    @Autowired
    VendaAPIServiceImpl vendaAPIServiceImpl;

    @Autowired
    VacinaAPIServiceImpl vacinaAPIServiceImpl;

    @Autowired
    ReceitaAPIServiceImpl receitaAPIServiceImpl;

    public VendaAPIServiceImpl getVendaAPIServiceImpl(){
        return vendaAPIServiceImpl;
    }
    public VacinaAPIServiceImpl getVacinaAPIServiceImpl(){
        return vacinaAPIServiceImpl;
    }

    public  ReceitaAPIServiceImpl getReceitaAPIServiceImpl() {
        return receitaAPIServiceImpl;
    }
}
