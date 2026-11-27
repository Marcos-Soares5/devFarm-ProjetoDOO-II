/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.doo2.repository;

import br.udesc.doo2.model.ModelOrdemCompra;
import java.util.List;

/**
 *
 * @author Marcos
 */
public interface ManterOrdemComprasRepositorio {
    
    public boolean salvarOrdemCompras(ModelOrdemCompra oc);
    
    public List<ModelOrdemCompra> buscaTodasOrdemCompras();
    
    public boolean deleteOrdemCompra(ModelOrdemCompra oc);
}
