/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.doo2.model;

/**
 *
 * @author 09899483907
 */
public class ModelInsumo {
    private int codigo;
    protected String descricao;
    protected int quantidade;
    protected float valorUnitario;
    protected float valorTotal;
    
    private static int geradorCodigo = 0;
    
    public ModelInsumo(String descricao, int quantidade, float valorUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = quantidade * valorUnitario;
        this.codigo = ++geradorCodigo;
    }
}
