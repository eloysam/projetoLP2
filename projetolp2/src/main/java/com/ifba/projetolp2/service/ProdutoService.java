package com.ifba.projetolp2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifba.projetolp2.model.Produto;
import com.ifba.projetolp2.repository.IProdutoRepository;

@Service
@Transactional(readOnly = false)
public class ProdutoService {
    @Autowired
    private IProdutoRepository repPro;

    public void salvar(Produto pro){
        repPro.save(pro);
    }

    public void atualizar(Produto pro){
        repPro.save(pro);
    }

    public void excluir(Long id){
        repPro.deleteById(id);
    }

    public Optional<Produto> buscarPorId(Long id){
        return repPro.findById(id);
    }

    public List<Produto> buscarTodos(){
        return repPro.findAll();
    }

    /*public void controlarEstoque(Long idProduto, int quantidadeRetirada) {
        Produto produto = buscarPorId(idProduto);

        if (produto != null) {
            int estoqueAtual = produto.getQtdProduto();

            if (estoqueAtual >= quantidadeRetirada) {
                produto.setQtdProduto(estoqueAtual - quantidadeRetirada);
                atualizar(produto);
                System.out.println("Estoque atualizado com sucesso. Estoque restante: " + produto.getQtdProduto());
            } else {
                System.out.println("Estoque insuficiente. Quantidade disponível: " + estoqueAtual);
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
    }*/

}
