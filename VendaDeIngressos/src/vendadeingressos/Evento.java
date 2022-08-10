package vendadeingressos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
	String nome;
	Date data;
	double valorUnico;
	int capacidade;
	List<Ingresso> listaIngressosVendidos;

	Evento() {
		listaIngressosVendidos = new ArrayList<Ingresso>();
	}

	public boolean verificaCapacidade() {
		if (capacidade > listaIngressosVendidos.size()) {
			return true;
		} else {
			return false;
		}
	}

	public void quantidadeVendida() {
		System.out.println(listaIngressosVendidos.size());
	}

	public void venderIngresso(Ingresso ingresso) {
		if (verificaCapacidade()) {
			listaIngressosVendidos.add(ingresso);
			ingresso.setShow(this);
		} else {
			System.out.println("Ingressos esgotados!");
		}
	}

	public void mostrarDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Data: " + data);
		System.out.println("Capacidade: " + capacidade);
		System.out.println("Quantidade de ingressos vendidos: " + listaIngressosVendidos.size());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setData(String data) {
		try {
			this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public double getValorUnico() {
		return valorUnico;
	}

	public void setValorUnico(double valorUnico) {
		this.valorUnico = valorUnico;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public List<Ingresso> getListaIngressosVendidos() {
		return listaIngressosVendidos;
	}

	public void setListaIngressosVendidos(List<Ingresso> listaIngressosVendidos) {
		this.listaIngressosVendidos = listaIngressosVendidos;
	}

}
