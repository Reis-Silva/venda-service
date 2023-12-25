package br.infnet.com.venda.controller;

import br.infnet.com.venda.exception.VendaNotFoundException;
import br.infnet.com.venda.model.Receita;
import br.infnet.com.venda.model.Vacina;
import br.infnet.com.venda.model.Venda;
import br.infnet.com.venda.model.VendaGeral;
import br.infnet.com.venda.payload.ResponsePayLoad;
import br.infnet.com.venda.payload.VendaPayload;
import br.infnet.com.venda.service.VendaServiceIntegracao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    private VendaServiceIntegracao vendaServiceIntegracao;

    Logger LOGGER = LoggerFactory.getLogger(VendaController.class);

    @PostMapping
    public ResponseEntity verificarVendas(@RequestBody VendaPayload vendaPayload){
        LOGGER.info("Registro:" + vendaPayload);
        LOGGER.info("Buscando Venda:" + vendaPayload.getVendas());

        List<Venda> vendas = new ArrayList<>();
        vendas.addAll(vendaServiceIntegracao.getVendaAPIServiceImpl().getAllVendasVacina(vendaPayload.getVendas()));
        vendas.addAll(vendaServiceIntegracao.getVendaAPIServiceImpl().getAllVendasReceita(vendaPayload.getVendas()));


        List<Long> idVacina = new ArrayList<>();
        List<Long> idReceita = new ArrayList<>();

        for (Venda venda : vendas){
            switch (venda.getTipo()){
                case VACINA:
                    idVacina.add(venda.getId());
                    break;
                case RECEITA:
                    idReceita.add(venda.getId());
                default:
                    LOGGER.info("Tipo do Id Não validado: " + venda.getId());
            }
        }

        VendaGeral vendaGeral = new VendaGeral();

        if (!idVacina.isEmpty()){
            vendaGeral.setVacinas(new ArrayList<>());
            vendaGeral.getVacinas().addAll(vendaServiceIntegracao.getVacinaAPIServiceImpl().getAllVacina(idVacina));
        }

        if ((!idReceita.isEmpty())){
            vendaGeral.setReceitas(new ArrayList<>());
            vendaGeral.getReceitas().addAll(vendaServiceIntegracao.getReceitaAPIServiceImpl().getAllVacina(idVacina));
        }

        return ResponseEntity.ok().body(vendaGeral);
    }

    @PostMapping(value = "/vacina")
    public ResponseEntity comprarVacina(@RequestBody Vacina vacina){
        try {
            vacina = vendaServiceIntegracao.getVacinaAPIServiceImpl().comprar(vacina);

            return ResponseEntity.ok(vacina);

        }catch (VendaNotFoundException ex){

            ResponsePayLoad message = ResponsePayLoad.builder().Message("Not Found").dateTime(LocalDateTime.now()).build();

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

    @PostMapping(value = "/receita")
    public ResponseEntity comprarReceira(@RequestBody Receita receita){
        try {
            receita = vendaServiceIntegracao.getReceitaAPIServiceImpl().comprar(receita);

            return ResponseEntity.ok(receita);

        }catch (VendaNotFoundException ex){

            ResponsePayLoad message = ResponsePayLoad.builder().Message("Not Found").dateTime(LocalDateTime.now()).build();

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
        }
    }

}
