/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.doo2.model;

/**
 *
 * @author Marcos
 */
class ModelItensOrdemCompra {
    
    
    private int codigo;
    private ModelInsumo insumo;
    private int quantidade;
    private float precoInsumo;
    private float valorTotal;
    
    private static int geradorCodigo=0;

    public ModelItensOrdemCompra(ModelInsumo insumo, int quantidade, float precoInsumo) {
        this.insumo = insumo;
        this.quantidade = quantidade;
        this.precoInsumo = precoInsumo;
        
        this.valorTotal = quantidade * precoInsumo;
        
        this.codigo = ++geradorCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public ModelInsumo getInsumo() {
        return insumo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getValorTotal() {
        return valorTotal;
    }
    
    
    
    
    
}
