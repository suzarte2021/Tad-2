package ProfessoresUcsal;


	public interface  ProfessoresUcsall {

		public boolean add(String nome,String email, String telefone );
		public String[] getNome();
		public void setNome(String[] nome);
		public String getEmail();
		public void setEmail(String email);
		public String getTelefone();
		public void setTelefone(String telefone);
		public void remocao(String[] nome, String email, String telefone);
		public void retornoQuantidadeProfessores(String telefone);
		public void limparLista(String telefone);
		
			

		}
	


