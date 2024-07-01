package br.tec.db.servicoguincho;

import br.tec.db.servicoguincho.simulador.*;
import br.tec.db.servicoguincho.simulador.cargas.EstadoConservacao;
import br.tec.db.servicoguincho.simulador.cargas.TipoVeiculo;

public class Main {

    public static void main(String[] args) {

        // Definindo os guinchos e seus valores
        iGuincho guinchoCarro = new iGuincho(TipoVeiculo.CARRO, 5);
        iGuincho guinchoOnibus = new iGuincho(TipoVeiculo.ONIBUS, 10);
        iGuincho guinchoMinivan = new iGuincho(TipoVeiculo.MINIVAN, 7);
        iGuincho guinchoCaminhao = new iGuincho(TipoVeiculo.CAMINHAO, 15);

        // Criando a siulação para cada veículo
        SimuladorDeOrcamento simulacao = new iSimuladorDeOrcamento();
        ((iSimuladorDeOrcamento) simulacao).adicionarGuincho(guinchoCarro);
        ((iSimuladorDeOrcamento) simulacao).adicionarGuincho(guinchoOnibus);
        ((iSimuladorDeOrcamento) simulacao).adicionarGuincho(guinchoMinivan);
        ((iSimuladorDeOrcamento) simulacao).adicionarGuincho(guinchoCaminhao);

        // Cenário 1 - carro novo - do centro para o bairro A
        Trajeto centroParaBairroA = new iTrajeto("Centro", "Bairro A", 10);
        Veiculo carroNovo = new iVeiculo(TipoVeiculo.CARRO, EstadoConservacao.NOVO);
        double custoCenario1 = simulacao.calcularCustoTotal(carroNovo, centroParaBairroA);
        System.out.println("Cenário 1 - Custo Total do Serviço: R$" + custoCenario1);

        // Cenário 2 - ônibus quebrado - do bairro B para o centro
        Trajeto bairroBParaCentro = new iTrajeto("Bairro B", "Centro", 20);
        Veiculo onibusQuebrado = new iVeiculo(TipoVeiculo.ONIBUS, EstadoConservacao.QUEBRADO);
        double custoCenario2 = simulacao.calcularCustoTotal(onibusQuebrado, bairroBParaCentro);
        System.out.println("Cenário 2 - Custo Total do Serviço: R$" + custoCenario2);

        // Cenário 3 - minivan nova - do centro para o bairro B
        Trajeto centroParaBairroB = new iTrajeto("Centro", "Bairro B", 15);
        Veiculo minivanNova = new iVeiculo(TipoVeiculo.MINIVAN, EstadoConservacao.NOVO);
        double custoCenario3 = simulacao.calcularCustoTotal(minivanNova, centroParaBairroB);
        System.out.println("Cenário 3 - Custo Total do Serviço: R$" + custoCenario3);

        // Cenário 4 - caminhão quebrado - do bairro A para o bairro B
        Trajeto bairroAParaBairroB = new iTrajeto("Bairro A", "Bairro B", 5);
        Veiculo caminhaoQuebrado = new iVeiculo(TipoVeiculo.CAMINHAO, EstadoConservacao.QUEBRADO);
        double custoCenario4 = simulacao.calcularCustoTotal(caminhaoQuebrado, bairroAParaBairroB);
        System.out.println("Cenário 4 - Custo Total do Serviço: R$" + custoCenario4);

        // Cenário 5 - carro novo - trafegando pelo centro
        Trajeto centroParaCentro = new iTrajeto("Centro", "Centro", 2);
        double custoCenario5 = simulacao.calcularCustoTotal(carroNovo, centroParaCentro);
        System.out.println("Cenário 5 - Custo Total do Serviço: R$" + custoCenario5);
    }
}
