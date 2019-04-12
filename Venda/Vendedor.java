package unipe.java;

public class Vendedor {
	private String nome;
	private int codigo;
	private float comissao;
	private String endere�o;

	public Vendedor(String nome, String endere�o, int codigo) {
		this.nome = nome;
		this.endere�o = endere�o;
		this.codigo = codigo;
	}

	public Vendedor() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

}
