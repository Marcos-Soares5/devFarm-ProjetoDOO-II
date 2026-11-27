/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.doo2.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class ModelOrdemCompra {
    
    private int codigo;
    private String dataCriacao;
    private String fornecedor;
    private StatusOrdemCompras status;
    
    private static List<ModelItensOrdemCompra> insumo = new ArrayList<>();

    private static int codigoGerador=0;
    
    public ModelOrdemCompra(String dataCriacao, String fornecedor) {
        this.dataCriacao = dataCriacao;
        this.fornecedor = fornecedor;
        this.status = status.PENDENTE;
        
        this.codigo = ++codigoGerador;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setStatus(StatusOrdemCompras status) {
        this.status = status;
    }
    
    public StatusOrdemCompras getStatus() {
        return this.status;
    }
    
    
    
    
    
}
