package application;

import java.util.Locale;

import entities.Ponto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
//		Ponto kenobi = new Ponto(-500.0, 200.0);
//		Ponto skywalker = new Ponto(100.0, -100.0);
//		Ponto sato = new Ponto(500.0, 100.0);
//
////		System.out.println("Qual a distãncia crecebina no satelite Kenobi -> ");
//		double distanciaKenobi = 608.26;// sc.nextDouble();
////		System.out.println("Qual a distãncia crecebina no satelite Skywalker -> ");
//		double distanciaSkywalker = 608.26;// sc.nextDouble();
////		System.out.println("Qual a distãncia crecebina no satelite Sato -> ");
//		double distanciaSato = 831.50;// sc.nextDouble();
//		sc.close();
//
//		Ponto p = Ponto.triangula(kenobi, skywalker, sato, distanciaKenobi, distanciaSkywalker, distanciaSato);

		Ponto a = new Ponto(-8.0, 2.0);
		Ponto b = new Ponto(-5.0, 5.0);
		Ponto c = new Ponto(1.0, 0.0);
		Ponto d = new Ponto(-2.0, 3.0);
		double da = Ponto.distancia(a, d);
		double db = Ponto.distancia(b, d);
		double dc = Ponto.distancia(c, d);

		Ponto k = Ponto.triangula(a, b, c, da, db, dc);
		System.out.println(k);

	}

}
