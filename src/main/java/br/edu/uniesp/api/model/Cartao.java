package br.edu.uniesp.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Cartao {

    @Id
    @GeneratedValue
    private Integer id;

    private String numeroCartao;
    private String validadeCartao;
    private String codigoCartao;
    private String nomeTitular;
    private String cpf;

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public Integer getIdCartao() {
        return id;
    }

    public void setIdCartao(Integer id) {
        this.id = id;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getValidadeCartao() {
        return validadeCartao;
    }

    public void setValidadeCartao(String validadeCartao) {
        this.validadeCartao = validadeCartao;
    }

    public String getCodigoCartao() {
        return codigoCartao;
    }

    public void setCodigoCartao(String codigoCartao) {
        this.codigoCartao = codigoCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
