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

public boolean add(String nome,String email, String telefone ) {
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

public void setEmail(String email) { //Set 
	this.email = email;
}

public String getTelefone() { //Consulta
	return telefone;
}

public void setTelefone(String telefone) { //Alterar
	this.telefone = telefone;
}

public void remocao(String[] nome, String email, String telefone) {
	this.nome = nome;
	this.email = email;
	this.telefone = email;
}
public void retornoQuantidadeProfessores(String telefone) {
	this.nome = nome;

}
public void limparLista(String telefone) {
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
	
}
	public void consultar(String[] nome, String email, String telefone) {
		//@todo
}


