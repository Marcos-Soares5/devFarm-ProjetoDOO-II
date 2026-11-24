/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.doo2.model;

/**
 *
 * @author 09899483907
 */
public class ModelMedicamento extends ModelInsumo {
    
    private int codigo;
    
    private static int geradorCodigo = 0;
    
    public ModelMedicamento(String descricao, int quantidade, float valorUnitario) {
        super(descricao, quantidade, valorUnitario);
    }
}
