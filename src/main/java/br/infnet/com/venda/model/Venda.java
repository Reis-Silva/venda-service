package br.infnet.com.venda.model;

import br.infnet.com.venda.enums.VendaEnums;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Venda {

    private Long id;

    private VendaEnums tipo;

}
