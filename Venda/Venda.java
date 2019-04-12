package unipe.java;

public class Venda {
	private Vendedor vendedor = new Vendedor();
	private Produto produto = new Produto();
	private float desconto = 0;
	private int quantidadeDeItens;
	private float valor;

	public float calcularValor(int quantidadeDeItens, float valorDoProduto, float valorDoDesconto) {
		if(desconto==-1) {
			this.quantidadeDeItens=0;
			return 0;
		}
		else {
		return quantidadeDeItens * (valorDoProduto-valorDoDesconto);
		}
	}

	public float efetuarDesconto(float desconto, float valorVenda, float valorCusto) {
		if (((100-desconto)/100)*valorVenda<valorCusto) {
			System.out.println("desconto solicitado:"+desconto+"%");
			System.out.println("o valor do produto irá ficar menor do que seu valor de custo, o produto não será vendido");
			return -1;
		} else {
			return (desconto/100)*valorVenda;
		}
	}

	public float calcularComissao(float valorVenda, float comissao,boolean temDesconto) {
		if (temDesconto == false) {
			return (comissao / 100) * valorVenda;
		} else {
			return ((comissao / 100) * valorVenda) / 2;
		}
	}

	public void imprimir() {
		System.out.println("Vendedor:" + vendedor.getNome());
		System.out.println("Codigo:" + vendedor.getCodigo());
		System.out.println("Comissao:" + vendedor.getComissao() + "%");
		System.out.println("Qnt de itens vendidos:" + quantidadeDeItens);
		System.out.println("Codigo do produto:" + produto.getCodigo());
		System.out.println("Descriçao:" + produto.getDescricao());
		System.out.println("Valor de venda de cada produto(sem desconto inbutido):" +produto.getValorVenda()+"R$");
		if (produto.isPromoçao() == false) {
			System.out.println("Produto não está em promoção");
		} else {
			System.out.println("Produto está em promoção");
			System.out.println("Valor do desconto:" + desconto+"R$");
		}
		System.out.println("Valor total da venda:" + valor+"R$\n\n");
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	public void setQuantidadeDeItens(int quantidadeDeItens) {
		this.quantidadeDeItens = quantidadeDeItens;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
