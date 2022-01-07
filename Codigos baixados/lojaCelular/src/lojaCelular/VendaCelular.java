package lojaCelular;

public class VendaCelular {

	public static void main(String[] args) {
		Capa cap = new Capa(" Prata ", " Silicone ", 80);
		Capa cap1 = new Capa(" Azul ", " Plástico ", 45);
		Capa cap2 = new Capa(" Preta ", " Silicone ", 90);
		Celular azusm2 = new Celular("Azus ", " Azul", " M2 Max pro ", 1600, cap);
		Celular azusm3 = new Celular("Azus ", " Prata", " M3 Max pro ", 1400, cap1);
		Celular azusm4 = new Celular("Azus ", " Prata", " M2 Max pro ", 1000, cap2);

		azusm2.imprimirTela();
		azusm3.imprimirTela();
		azusm4.imprimirTela();

	}

}
