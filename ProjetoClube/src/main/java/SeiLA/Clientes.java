package SeiLA;

public class Clientes extends Pessoas {

    private boolean em_atraso;
    private  int tempo_atraso;
    private  String tipo_acao;
    private  double preco_acao;
    private  String numero_registro;
    private  boolean titularidade;

    public boolean isEm_atraso() {
        return em_atraso;
    }

    public void setEm_atraso(boolean em_atraso) {
        this.em_atraso = em_atraso;
    }

    public int getTempo_atraso() {
        return tempo_atraso;
    }

    public void setTempo_atraso(int tempo_atraso) {
        this.tempo_atraso = tempo_atraso;
    }

    public String getTipo_acao() {
        return tipo_acao;
    }

    public void setTipo_acao(String tipo_acao) {
        this.tipo_acao = tipo_acao;
    }

    public double getPreco_acao() {
        return preco_acao;
    }

    public void setPreco_acao(double preco_acao) {
        this.preco_acao = preco_acao;
    }

    public String getNumero_registro() {
        return numero_registro;
    }

    public void setNumero_registro(String numero_registro) {
        this.numero_registro = numero_registro;
    }

    public boolean isTitularidade() {
        return titularidade;
    }

    public void setTitularidade(boolean titularidade) {
        this.titularidade = titularidade;
    }

    public void titular() {
        if (this.titularidade == true) {
            System.out.println("Bem vindo " + this.getNome());
        } else {
            System.out.println("Bem vindo");
        }
    }
    public void fazer_pagamento(int quantidade_parcelas){
        if (quantidade_parcelas > 0) {
            
            this.preco_acao += quantidade_parcelas;
        }
    
    }
}
