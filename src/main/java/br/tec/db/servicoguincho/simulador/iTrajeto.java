package br.tec.db.servicoguincho.simulador;

public class iTrajeto implements Trajeto{

    private String bairroOrigem;
    private String bairroDestino;
    private int distanciaEmKM;

    public iTrajeto(String bairroOrigem, String bairroDestino, int distanciaEmKM) {
        this.bairroOrigem = bairroOrigem;
        this.bairroDestino = bairroDestino;
        this.distanciaEmKM = distanciaEmKM;
    }

    @Override
    public Integer getDistanciaEmKM() {
        return distanciaEmKM;
    }

    public String getBairroOrigem() {
        return bairroOrigem;
    }

    public String getBairroDestino() {
        return bairroDestino;
    }
}
