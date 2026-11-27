/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.udesc.doo2.app;

import br.udesc.doo2.controller.ControllerManterOrdemCompras;
import br.udesc.doo2.dao.ListOrdemCompraDAO;
import br.udesc.doo2.repository.ManterOrdemComprasRepositorio;
import br.udesc.doo2.view.ViewManterOrdemCompras;

/**
 *
 * @author Marcos
 */
public class DevFarm {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ViewManterOrdemCompras visao = new ViewManterOrdemCompras();
        ManterOrdemComprasRepositorio repositorio = new ListOrdemCompraDAO();
        
        ControllerManterOrdemCompras controller = new ControllerManterOrdemCompras(visao, repositorio);
    }
}
