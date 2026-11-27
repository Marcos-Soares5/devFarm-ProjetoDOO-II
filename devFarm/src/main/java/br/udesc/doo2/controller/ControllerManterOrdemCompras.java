/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.doo2.controller;

import br.udesc.doo2.dao.ListOrdemCompraDAO;
import br.udesc.doo2.model.ModelOrdemCompra;
import br.udesc.doo2.repository.ManterOrdemComprasRepositorio;
import br.udesc.doo2.view.ViewManterOrdemCompras;

/**
 *
 * @author Marcos
 */
public class ControllerManterOrdemCompras {
    
    private ViewManterOrdemCompras visao;
    private ModelOrdemCompra OrdemCompra;
    private ManterOrdemComprasRepositorio OrdemCompraDAO;

    public ControllerManterOrdemCompras(ViewManterOrdemCompras visao, ManterOrdemComprasRepositorio OrdemCompraDAO) {
        this.visao = visao;
        this.OrdemCompraDAO = OrdemCompraDAO;
        
        addAcaoBtns();
        
        configuraTela();
    }

    public void configuraTela(){
        
        visao.enableDetalhe(false);
        
        visao.exibirTela(true);
        
    }
    
    private void addAcaoBtns() {
        visao.addAcaoBtnNovo(e -> novaOrdemCompra());
        visao.addAcaoBtnVoltar(e -> voltarListagem());
    }

    public void novaOrdemCompra(){
        
        AbrirDetalhe();
        
        
    }
    
    private void AbrirDetalhe() {
        visao.exibirDetalhes(true);
        visao.enableDetalhe(true);
        visao.enableListagem(false);
    }

    private void voltarListagem() {
        visao.exibirListagem(true);
        visao.enableListagem(true);
        visao.enableDetalhe(false);
    }
    
    
    
    
}
