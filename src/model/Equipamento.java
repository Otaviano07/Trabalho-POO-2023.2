package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Equipamento {
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
    private LocalDate dataCompra;
    private LocalDate dataFabricao;
    private LocalDate dataUltimaManutencao;
    private LocalDate dataReservaEquipamento;
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

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        if(dataCompra != null){
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                LocalDate data = LocalDate.parse((CharSequence) dataCompra, formatter);

                if (data.isBefore(LocalDate.now())) {
                    this.dataCompra = data;
                }
            } catch (Exception e) {
                System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
            }
        }
    }

    public LocalDate getDataFabricao() {
        return dataFabricao;
    }

    public void setDataFabricao(Date dataFabricao) {
        if(dataFabricao != null){ 
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                LocalDate data = LocalDate.parse((CharSequence) dataFabricao, formatter);

                if (data.isBefore(LocalDate.now())) {
                    this.dataFabricao = data;
                }
            } catch (Exception e) {
                System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
            }
        }
    }

    public LocalDate getDataUltimaManutencao() {
        return dataUltimaManutencao;
    }

    public void setDataUltimaManutencao(Date dataUltimaManutencao) {
        if(dataUltimaManutencao != null){
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                LocalDate data = LocalDate.parse((CharSequence) dataUltimaManutencao, formatter);

                if (data.isBefore(LocalDate.now())) {
                    this.dataUltimaManutencao =  data;
                }
            } catch (Exception e) {
                System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
            }
        }
    }

    public LocalDate getDataReservaEquipamento() {
        return dataReservaEquipamento;
    }

    public void setDataReservaEquipamento(Date dataReservaEquipamento) {
        if(dataReservaEquipamento != null){
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                LocalDate data = LocalDate.parse((CharSequence) dataReservaEquipamento, formatter);

                if (data.isBefore(LocalDate.now())) {
                    this.dataReservaEquipamento =  data;
                }
            } catch (Exception e) {
                System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
            }
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
