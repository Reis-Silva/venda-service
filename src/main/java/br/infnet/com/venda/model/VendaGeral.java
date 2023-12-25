package br.infnet.com.venda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendaGeral {

    private List<Vacina> vacinas;

    private List<Receita> receitas;
}
