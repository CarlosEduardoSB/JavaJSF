package bean;

import javax.faces.bean.ManagedBean;

import entidade.Pessoa;

@ManagedBean
public class PrimeiroBean {
	private Pessoa pessoa = new Pessoa();
	
	public String salvar() {
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.getSexo());
		return null;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
