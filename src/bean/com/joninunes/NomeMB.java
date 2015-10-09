package bean.com.joninunes;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class NomeMB {
	
	//private String nome = "Joni Luis Nunes";
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NomeMB() {
		// TODO Auto-generated constructor stub
	}

}

