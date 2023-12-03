package main.java.sistema.model;

import java.util.Date;

public class Equipamento extends ItemReservavel {
    private static int idEquipamento;
    private int patrimonio;
    private String descricaoEquipamento;
    private int quantidade;
    private String marca;
    private String fabricante;
    private String modelo;
    private double preco;
    private boolean statusEquipamento;
    private boolean manutencao;
    private String localizacao;
    private Date dataCompra;
    private Date dataFabricao;
    private Date dataUltimaManutencao;
    private Date dataReservaEquipamento;
    private String detalhesManutencao;
    private String observacao;

    public Equipamento() {
        this.descricaoEquipamento = null;
        this.quantidade = 0;
        this.marca = null;
        this.fabricante = null;
        this.modelo = null;
        this.preco = 0.0;
        this.statusEquipamento = true;
        this.manutencao = false;
        this.localizacao = null;
        this.dataCompra = null;
        this.dataFabricao = null;
        this.dataUltimaManutencao = null;
        this.dataReservaEquipamento = null;
        this.detalhesManutencao = null;
        this.observacao = null;
    }

    public Equipamento(String descricaoEquipamento, int quantidade, String marca, String fabricante, String modelo,
            double preco, boolean statusEquipamento, boolean manutencao,String localizacao, Date dataCompra, Date dataFabricao,
            Date dataUltimaManutencao, Date dataReservaEquipamento, String detalhesManutencao, String observacao) {
        Equipamento.idEquipamento = idEquipamento++;
        this.setDescricaoEquipamento(descricaoEquipamento);
        this.setQuantidade(quantidade);
        this.setMarca(marca);
        this.setFabricante(fabricante);
        this.setModelo(modelo);
        this.setPreco(preco);
        this.setStatusEquipamento(statusEquipamento);
        this.setLocalizacao(localizacao);
        this.setDataCompra(dataCompra);
        this.setDataFabricao(dataFabricao);
        this.setDataUltimaManutencao(dataUltimaManutencao);
        this.setDataReservaEquipamento(dataReservaEquipamento);
        this.setDetalhesManutencao(detalhesManutencao);
        this.setObservacao(observacao);
    }

    public static int getIdEquipamento() {
        return idEquipamento;
    }

    public static void setIdEquipamento(int idEquipamento) {
        if(idEquipamento > 0){
            Equipamento.idEquipamento = idEquipamento;
        }
    }

    public int getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(int patrimonio) {
        if(patrimonio > 0){
            this.patrimonio = patrimonio;
        }
    }

    public String getDescricaoEquipamento() {
        return descricaoEquipamento;
    }

    public void setDescricaoEquipamento(String descricaoEquipamento) {
        if(descricaoEquipamento != null){
            this.descricaoEquipamento = descricaoEquipamento;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0){
            this.quantidade = quantidade;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca != null){ 
            this.marca = marca;
        }
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        if(fabricante != null){
            this.fabricante = fabricante;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo != null){
            this.modelo = modelo;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco > 0.0){
            this.preco = preco;
        }
    }

    public boolean isStatusEquipamento() {
        return statusEquipamento;
    }

    public void setStatusEquipamento(boolean statusEquipamento) {
        this.statusEquipamento = statusEquipamento;
    }

    public boolean isManutencao() {
        return manutencao;
    }

    public void setManutencao(boolean manutencao) {
        this.manutencao = manutencao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        if(localizacao != null){
            this.localizacao = localizacao;
        }
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        if(dataCompra != null){
            this.dataCompra = dataCompra;
        }
    }

    public Date getDataFabricao() {
        return dataFabricao;
    }

    public void setDataFabricao(Date dataFabricao) {
        if(dataFabricao != null){ 
            this.dataFabricao = dataFabricao;
        }
    }

    public Date getDataUltimaManutencao() {
        return dataUltimaManutencao;
    }

    public void setDataUltimaManutencao(Date dataUltimaManutencao) {
        if(dataUltimaManutencao != null){
            this.dataUltimaManutencao = dataUltimaManutencao;
        }
    }

    public Date getDataReservaEquipamento() {
        return dataReservaEquipamento;
    }

    public void setDataReservaEquipamento(Date dataReservaEquipamento) {
        if(dataReservaEquipamento != null){
            this.dataReservaEquipamento = dataReservaEquipamento;
        }
    }

    public String getDetalhesManutencao() {
        return detalhesManutencao;
    }

    public void setDetalhesManutencao(String detalhesManutencao) {
        if(detalhesManutencao != null){
            this.detalhesManutencao = detalhesManutencao;
        }
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        if(observacao != null){
            this.observacao = observacao;
        }
    }

    public void adicionarEquipamento(){
        /*Esse método será utilizado para adicionar um equipamento novo */
    }

    public void alterarEquipamento(){
        /*Esse método será utilizado para alterar alguma informação do 
        equipamento cadastrado */
    }

    public void removerEquipamento(){
        /*Esse método será utilizado para remover um equipamento cadastrado */
    }

    public void realizarManutencao(){
        /*Esse método será utilizado para realizar alguma manutenção no equipamento, 
        atualizando o atributo manutenção para true ou false*/
    }

    public void finalizarManutencao(){
        /*Esse método será utilizado para finalizar alguma manutenção no equipamento, 
        atualizando o atributo manutenção para true ou false*/
    }

    public void atualizarLocalizacao(){
        /*Esse método será utilizado para atualizar localização do equipamento 
        quado estiver reservado*/
    }

    public void atualizarStatus(){
         /*Esse método será utilizado para atualizar a disponibilidade do equipamento
          pelo atributo statusEquipamento*/
    }
    
    public void obterInformacoes(){
        /*Esse método será utilizado para obter as informações do equipamento, 
        como  idEquipamento, patrimonio, descricaoEquipamento, quantidade, marca, 
        fabricante, modelo, preco, observacao como exemplo */
    }

}
