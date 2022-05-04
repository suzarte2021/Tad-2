package ProfessoresUcsal;

public class ProfessoresUcsal implements  ProfessoresUcsal{
	private String[] nome;
	private String email;
	private String telefone;



//construtor
public ProfessoresUcsal(String[] nome, String email, String telefone) {
super();
this.nome = nome;
this.email = email;
this.telefone = telefone;

}

public boolean add(String nome,String email, String telefone ) { // MÉTODO ADICIONAR
	return true;
	
}

public String[] getNome() {
	return nome;
}

public void setNome(String[] nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) { 
	this.email = email;
}

public String getTelefone() { 
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public void remocao(String[] nome, String email, String telefone) { //MÉTODO REMOVER
	this.nome = nome;
	this.email = email;
	this.telefone = email;
}
public void retornoQuantidadeProfessores(String telefone) { //MÉTODO Retorno da quantidade de professores
	this.nome = nome;

}
public void limparLista(String telefone) { // MÉTODO REMOVER
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
	
}
	public void consultar(String[] nome, String email, String telefone) { MÉTODO CONSULTAR
		//@todo
}


