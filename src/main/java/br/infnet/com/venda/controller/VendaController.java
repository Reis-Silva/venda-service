package br.infnet.com.venda.controller;

import br.infnet.com.venda.model.Vacina;
import br.infnet.com.venda.model.Venda;
import br.infnet.com.venda.payload.VendaPayload;
import br.infnet.com.venda.service.VendaServiceIntegracao;
import br.infnet.com.venda.service.api.VendaAPIService;
import br.infnet.com.venda.service.impl.VendaAPIServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    private VendaServiceIntegracao vendaServiceIntegracao;

    Logger LOGGER = LoggerFactory.getLogger(VendaController.class);

    @PostMapping
    public void resgistrarVenda(@RequestBody VendaPayload vendaPayload){
        LOGGER.info("Registro:" + vendaPayload);
        LOGGER.info("Buscando Venda:" + vendaPayload.getVendas());

        List<Venda> vendas = vendaServiceIntegracao.getVendaAPIServiceImpl().getAllVendas(vendaPayload.getVendas());

        List<Long> idVacina = new ArrayList<>();
        List<Vacina> vacinas = new ArrayList<>();

        for (Venda venda : vendas){
            switch (venda.getTipo()){
                case VACINA:
                    idVacina.add(venda.getId());
                    break;
                default:
                    LOGGER.info("Tipo do Id Não validado: " + venda.getId());
            }
        }
        if (!idVacina.isEmpty()){
            vacinas.addAll(vendaServiceIntegracao.getVacinaAPIServiceImpl().getAllVacina(idVacina));
            LOGGER.info("Vendas: " + vacinas);
        }
    }
}
