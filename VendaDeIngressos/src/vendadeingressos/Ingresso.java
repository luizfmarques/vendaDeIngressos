package vendadeingressos;

public class Ingresso {
	String nome;
	String cpf;
	CategoriaEvento categoria;
	Evento show;

	public Ingresso() {
		categoria = CategoriaEvento.Pista;
	}

	public Ingresso(CategoriaEvento categoriaEvento) {
		categoria = categoriaEvento;
	}

	public double calculaValorIngresso() {
		if (show == null) {
			System.out.println("Ingresso não vinculado");
			return 0.0;
		}

		if (getCategoria() == CategoriaEvento.Pista) {
			return show.getValorUnico();
		} else if (getCategoria() == CategoriaEvento.VIP) {
			return show.getValorUnico() * 1.3;
		} else {
			return show.getValorUnico() * 1.6;
		}
	}

	public void mostraResumo() {

		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Dados do Evento:");
		System.out.println(show.nome);
		System.out.println(show.data);

	}

	public double imprimeValor() {
		double valor = calculaValorIngresso();
		System.out.println("Tipo do ingresso: Categoria " + categoria);
		System.out.println("Valor do ingresso: R$" + valor);

		return valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Evento getShow() {
		return show;
	}

	public void setShow(Evento show) {
		this.show = show;
	}

	public CategoriaEvento getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEvento categoria) {
		this.categoria = categoria;
	}

}
