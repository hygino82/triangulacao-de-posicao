package application;

import java.util.Locale;

import entities.Ponto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// Scanner sc = new Scanner(System.in);
		Ponto kenobi = new Ponto(-500.0, -200.0);
		Ponto skywalker = new Ponto(100.0, -100.0);
		Ponto sato = new Ponto(500.0, 100.0);

		Ponto ship = new Ponto(-286.6, -369.6);

//		System.out.println("Qual a distãncia crecebina no satelite Kenobi -> ");
		double distanciaKenobi = Ponto.distancia(kenobi, ship);// 608.26;// sc.nextDouble();
//		System.out.println("Qual a distãncia crecebina no satelite Skywalker -> ");
		double distanciaSkywalker = Ponto.distancia(skywalker, ship);// 608.26;// sc.nextDouble();
//		System.out.println("Qual a distãncia crecebina no satelite Sato -> ");
		double distanciaSato = Ponto.distancia(sato, ship);// 831.50;// sc.nextDouble();
//		sc.close();
		System.out.printf("distancia Kenobi %.4f\n", distanciaKenobi);
		System.out.printf("distancia Skywalker %.4f\n", distanciaSkywalker);
		System.out.printf("distancia Sato %.4f\n", distanciaSato);
		Ponto p = Ponto.triangula(kenobi, skywalker, sato, distanciaKenobi, distanciaSkywalker, distanciaSato);
		System.out.println(p);
		System.out.println("----------------------------------------------------------");

		Ponto a = new Ponto(-7.0, 0.0);
		Ponto b = new Ponto(3.0, 2.0);
		Ponto c = new Ponto(-1.0, -2.0);
		Ponto d = new Ponto(-4.0, 5.0);
		double da = Ponto.distancia(a, d);
		double db = Ponto.distancia(b, d);
		double dc = Ponto.distancia(c, d);
		System.out.printf("Distancia AD = %.5f\n", da);
		System.out.printf("Distancia BD = %.5f\n", db);
		System.out.printf("Distancia CD = %.5f\n", dc);
		Ponto k = Ponto.triangula(a, b, c, da, db, dc);// deve ser igual ao ponto d
		System.out.println(k);

	}

}
