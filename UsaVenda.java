package unipe.java;

import unipe.java.Venda;

public class UsaVenda {
	public static void main(String[] args) {
		Produto produto1=new Produto(40,"saco de batatas",30,20,false);
		Vendedor vendedor1=new Vendedor("Michael","Rua das Batatas,780",108);
		Venda venda1=new Venda();
		vendedor1.setComissao(5);
		venda1.setVendedor(vendedor1);
		venda1.setProduto(produto1);
	    venda1.setQuantidadeDeItens(2);
		venda1.setValor(venda1.calcularValor(venda1.getQuantidadeDeItens(),produto1.getValorVenda(),venda1.getDesconto()));
		System.out.println("valor da comissao do vendedor n1:"+venda1.calcularComissao(venda1.getValor(),vendedor1.getComissao(),produto1.isPromoçao())+"R$");
		venda1.imprimir();
		Produto produto2=new Produto(50,"aspirador de pó",100,80,true);
		Vendedor vendedor2=new Vendedor("Carla","Rua Palmeiras,490",198);
		vendedor2.setComissao(10);
		Venda venda2=new Venda();
		venda2.setVendedor(vendedor2);
		venda2.setProduto(produto2);
		venda2.setQuantidadeDeItens(3);
		venda2.setDesconto(venda2.efetuarDesconto(10,produto2.getValorVenda(),produto2.getValorCusto()));
		venda2.setValor(venda2.calcularValor(venda2.getQuantidadeDeItens(),produto2.getValorVenda(),venda2.getDesconto()));
		System.out.println("valor da comissao do vendedor n2:"+venda2.calcularComissao(venda2.getValor(),vendedor2.getComissao(),produto2.isPromoçao())+"R$");
		venda2.imprimir();
		Venda venda3=new Venda();
		venda3.setProduto(produto2);
		venda3.setVendedor(vendedor2);
		venda3.setQuantidadeDeItens(2);
		venda3.setDesconto(venda3.efetuarDesconto(30,produto2.getValorVenda(),produto2.getValorCusto()));
		venda3.setValor(venda3.calcularValor(venda3.getQuantidadeDeItens(),produto2.getValorVenda(),venda3.getDesconto()));
		System.out.println("valor da comissao do vendedor n2(pela segunda vez):"+venda3.calcularComissao(venda3.getValor(),vendedor2.getComissao(),produto2.isPromoçao())+"R$");
		venda3.imprimir();
	}
}
