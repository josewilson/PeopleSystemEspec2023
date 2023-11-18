package jwasouza73.pessoas;

import java.time.LocalDate;
import jwasouza73.composicao.Endereco;


public class Cliente extends Pessoa{
	private String codigo;
	private String Profissao;
	
	public void cadastrar(String codigo, String profissao, 
			String nome, LocalDate dataNascimento, 
			Endereco endereco,String telsContato) {
		this.codigo = codigo;
		this.Profissao = profissao;
		
		cadastrar(nome, dataNascimento, endereco, telsContato);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getProfissao() {
		return Profissao;
	}
	public void setProfissao(String profissao) {
		Profissao = profissao;
	}

}