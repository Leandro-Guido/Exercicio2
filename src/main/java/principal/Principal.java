package principal;

import java.util.List;

import dao.ProdutoDAO;
import model.Produto;

public class Principal {
	
	public static void main(String[] args) throws Exception {
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		System.out.println("\n\n==== Inserir usuário === ");
		Produto produto = new Produto("bombom", 1.99 ,7);
		if(produtoDAO.insert(produto) == true) {
			System.out.println("Inserção com sucesso -> " + produto.toString());
		}
		
		System.out.println("\n\n==== Mostrar produtos que comecam com 'c' === ");
		List<Produto> produtos = produtoDAO.getProdutosComPrimeiraLetra('c');
		for (Produto u: produtos) {
			System.out.println(u.toString());
		}

		System.out.println("\n\n==== Atualizar preco (código (" + produto.getCodigo() + ") === ");
		produto.setPreco(3.0);
		produtoDAO.update(produto);


		System.out.println("\n\n==== Mostrar usuários ordenados por código === ");
		produtos = produtoDAO.getOrderByCodigo();
		for (Produto u: produtos) {
			System.out.println(u.toString());
		}
		
		System.out.println("\n\n==== Excluir produto (código " + produto.getCodigo() + ") === ");
		produtoDAO.delete(produto.getCodigo());
		
		System.out.println("\n\n==== Mostrar produtos ordenados por nome === ");
		produtos = produtoDAO.getOrderByNome();
		for (Produto u: produtos) {
			System.out.println(u.toString());
		}
	}
}