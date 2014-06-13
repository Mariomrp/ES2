package windows7.configuracao;

public class UsuarioEntity {

	private String nome;
	private String senha;
	private String imagem;

	public UsuarioEntity(String nome, String senha, String imagem) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.imagem = imagem;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senhaAntiga, String senhaNova) {
		if (!senhaAntiga.equals(senha))
		throw new IllegalArgumentException();
		this.senha = senhaNova;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String toString() {
		return String.format("UsuarioEntity [nome=%s, imagem=%s]", nome, senha);
	}
}
