package unipe.java;

public class Vendedor {
	private String nome;
	private int codigo;
	private float comissao;
	private String endereço;

	public Vendedor(String nome, String endereço, int codigo) {
		this.nome = nome;
		this.endereço = endereço;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

}
