package Exe6;

public class RedeSocial {
	
	String nome, email, telefone, instagram;

	public RedeSocial(String nome, String email, String telefone, String instagram) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.instagram = instagram;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
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

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	
	public String mostraDados() {
        return "Nome: "+getNome()+" Email: "+getEmail()+" Telefone: "+getTelefone()+
                " Instagram: "+getInstagram();
	
	

}
}