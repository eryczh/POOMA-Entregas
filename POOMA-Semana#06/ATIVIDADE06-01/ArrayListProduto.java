package com.mycompany.projeto;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProduto {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void incluirProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public Produto consultarProdutoPorId(int id) {
        for (Produto produto : listaProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null; 
    }

    public boolean excluirProdutoPorId(int id) {
        Iterator<Produto> iterator = listaProdutos.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean alterarProduto(Produto novoProduto) {
        for (int i = 0; i < listaProdutos.size(); i++) {
            Produto produto = listaProdutos.get(i);
            if (produto.getId() == novoProduto.getId()) {
                listaProdutos.set(i, novoProduto);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Produto> listarProdutos() {
        return listaProdutos;
    }
}

