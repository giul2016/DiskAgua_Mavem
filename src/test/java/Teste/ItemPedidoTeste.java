/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import br.com.diskagua.dao.ItemPedidoDao;
import br.com.diskagua.dao.PedidoDao;
import br.com.diskagua.dao.ProdutoDao;
import br.com.diskagua.modelo.ItemPedido;
import br.com.diskagua.modelo.Pedido;
import br.com.diskagua.modelo.Produto;
import org.junit.Test;

/**
 *
 * @author Tardeli
 */
public class ItemPedidoTeste {
    @Test
    public void cadastrar(){
        ItemPedido itemPedido = new ItemPedido();
        ItemPedidoDao itemPedidoDao = new ItemPedidoDao();
        
        ProdutoDao produtoDao = new ProdutoDao();
        Produto produto = produtoDao.buscarObjeto(1L);
        
        PedidoDao pedidoDao = new PedidoDao();
        Pedido pedido = pedidoDao.buscarObjeto(1L);
        
        itemPedido.setPedido(pedido);
        itemPedido.setProduto(produto);
        itemPedido.setQuantidade(1);
               
        itemPedidoDao.salvarOuAtualizarObjeto(itemPedido);
                   
    }
}
