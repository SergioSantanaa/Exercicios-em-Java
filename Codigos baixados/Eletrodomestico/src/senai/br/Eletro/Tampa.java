package senai.br.Eletro;

public class Tampa {
	private String cor;
	private String descricao;

	public Tampa(String cor, String descricao) {
		super();
		this.cor = cor;
		this.descricao = descricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
