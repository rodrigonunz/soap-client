package com.app.model;

import java.math.BigDecimal;

public class Conta {
    private Long id;
    private String agencia;
    private String conta;
    private BigDecimal debito;
    private BigDecimal credito;

    public Conta(Long id, String agencia, String conta) {
        this.id = id;
        this.agencia = agencia;
        this.conta = conta;
    }

    public Conta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public BigDecimal getDebito() {
        return debito;
    }

    public void setDebito(BigDecimal debito) {
        this.debito = debito;
    }

    public BigDecimal getCredito() {
        return credito;
    }

    public void setCredito(BigDecimal credito) {
        this.credito = credito;
    }
}
