/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.doo2.dao;

import br.udesc.doo2.model.ModelOrdemCompra;
import br.udesc.doo2.repository.ManterOrdemComprasRepositorio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class ListOrdemCompraDAO implements ManterOrdemComprasRepositorio{

    private static List<ModelOrdemCompra> ordemCompras = new ArrayList<>();
    
    @Override
    public boolean salvarOrdemCompras(ModelOrdemCompra oc) {
        return ordemCompras.add(oc);
    }

    @Override
    public List<ModelOrdemCompra> buscaTodasOrdemCompras() {
        return ordemCompras;
    }

    @Override
    public boolean deleteOrdemCompra(ModelOrdemCompra oc) {
        return ordemCompras.remove(oc);
    }
    
    
    
}
