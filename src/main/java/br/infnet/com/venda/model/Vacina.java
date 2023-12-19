package br.infnet.com.venda.model;

import br.infnet.com.venda.enums.VendaEnums;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vacina {
    private Long id;

    private  VendaEnums tipo;

    private String informacoes;

    private BigDecimal valor;
}
