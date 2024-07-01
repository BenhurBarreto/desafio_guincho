package br.tec.db.servicoguincho.simulador;

import br.tec.db.servicoguincho.simulador.Trajeto;
import br.tec.db.servicoguincho.simulador.cargas.TipoVeiculo;

public interface Guincho {

    double calcularCustoDeslocamento(Trajeto trajeto);

    TipoVeiculo getTipo();
}
