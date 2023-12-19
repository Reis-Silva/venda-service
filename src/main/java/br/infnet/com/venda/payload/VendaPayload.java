package br.infnet.com.venda.payload;

import lombok.Data;

import java.util.List;

@Data
public class VendaPayload {
    private List<Long> vendas;
}
