package br.tec.db.servicoguincho.simulador;

import java.util.ArrayList;
import java.util.List;

public class iSimuladorDeOrcamento implements SimuladorDeOrcamento{

    private List<Guincho> guinchos;

    public iSimuladorDeOrcamento() {
        this.guinchos = new ArrayList<>();
    }

    public void adicionarGuincho(Guincho guincho) {
        guinchos.add(guincho);
    }

    @Override
    public double calcularCustoTotal(Veiculo veiculo, Trajeto trajeto) {
        for (Guincho guincho : guinchos) {
            if (guincho.getTipo() == veiculo.getTipo()) {
                return guincho.calcularCustoDeslocamento(trajeto);
            }
        }
        return 0;
    }
}
