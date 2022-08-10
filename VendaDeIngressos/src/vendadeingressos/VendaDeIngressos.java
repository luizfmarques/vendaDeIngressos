package vendadeingressos;

public class VendaDeIngressos {

	public static void main(String[] args) {
		Ingresso ingresso1 = new Ingresso();
		Ingresso ingresso2 = new Ingresso();
		Ingresso ingresso3 = new Ingresso();
		Ingresso ingresso4 = new Ingresso();
		Ingresso ingresso5 = new Ingresso();
		Ingresso ingresso6 = new Ingresso();
		Ingresso ingresso7 = new Ingresso();
		Ingresso ingresso8 = new Ingresso();

		Evento evento1 = new Evento();
		Evento evento2 = new Evento();

		evento1.setNome("Show de Rock");
		evento1.setData("01/10/2023");
		evento1.setValorUnico(100);
		evento1.setCapacidade(50);

		evento2.setNome("Opera");
		evento2.setData("10/02/2023");
		evento2.setValorUnico(300);
		evento2.setCapacidade(30);

		evento1.venderIngresso(ingresso1);
		evento1.venderIngresso(ingresso2);
		evento1.venderIngresso(ingresso3);
		evento1.venderIngresso(ingresso4);
		evento1.venderIngresso(ingresso5);

		ingresso1.setNome("Joao da Silva");
		ingresso1.setCpf("00100200345");

		evento2.venderIngresso(ingresso6);
		evento2.venderIngresso(ingresso7);
		evento2.venderIngresso(ingresso8);

		ingresso6.setCategoria(CategoriaEvento.Camarote);
		ingresso2.setCategoria(CategoriaEvento.VIP);

		evento1.mostrarDetalhes();
		evento2.mostrarDetalhes();
		ingresso1.mostraResumo();
		ingresso6.imprimeValor();
		ingresso2.imprimeValor();
		evento2.quantidadeVendida();

	}

}
