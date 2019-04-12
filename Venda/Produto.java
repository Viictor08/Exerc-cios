package unipe.java;

public class Produto {
	private int codigo;
	private String descricao;
	private float valorVenda;
	private float valorCusto;
	private boolean promo�ao;

	public Produto(int codigo, String descricao, float valorVenda, float valorCusto, boolean promocao) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCusto = valorCusto;
		this.promo�ao = promocao;
	}

	public Produto() {

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public float getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(float valorCusto) {
		this.valorCusto = valorCusto;
	}

	public boolean isPromo�ao() {
		return promo�ao;
	}

	public void setPromo�ao(boolean promo�ao) {
		this.promo�ao = promo�ao;
	}

}
