package br.tec.db.servicoguincho.simulador;

import br.tec.db.servicoguincho.simulador.cargas.EstadoConservacao;
import br.tec.db.servicoguincho.simulador.cargas.TipoVeiculo;

public class iVeiculo implements Veiculo{

    private TipoVeiculo tipo;
    private EstadoConservacao estado;

    public iVeiculo(TipoVeiculo tipo, EstadoConservacao estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    @Override
    public TipoVeiculo getTipo() {
        return tipo;
    }

    @Override
    public EstadoConservacao getEstado() {
        return estado;
    }
}
