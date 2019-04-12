package unipe.java;

public class Vendedor {
	private String nome;
	private int codigo;
	private float comissao;
	private String enderešo;

	public Vendedor(String nome, String enderešo, int codigo) {
		this.nome = nome;
		this.enderešo = enderešo;
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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

}
