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

    /*public void controleEstoque(Long idProduto, int qtdProduto){
        Produto pd = buscarPorId(idProduto);
        pd.set
        
    }*/

    public Optional<Produto> buscarPorId(Long id){
        return repPro.findById(id);
    }

    public List<Produto> buscarTodos(){
        return repPro.findAll();
    }

}
