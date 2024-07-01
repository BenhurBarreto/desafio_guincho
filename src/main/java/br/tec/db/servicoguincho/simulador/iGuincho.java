package br.tec.db.servicoguincho.simulador;

import br.tec.db.servicoguincho.simulador.cargas.TipoVeiculo;

public class iGuincho implements Guincho{
    private TipoVeiculo tipo;
    private double taxaDeslocamento;

    public iGuincho(TipoVeiculo tipo, double taxaDeslocamento) {
        this.tipo = tipo;
        this.taxaDeslocamento = taxaDeslocamento;
    }

    @Override
    public double calcularCustoDeslocamento(Trajeto trajeto) {
        return taxaDeslocamento * trajeto.getDistanciaEmKM();
    }

    @Override
    public TipoVeiculo  getTipo() {
        return tipo;
    }
}
