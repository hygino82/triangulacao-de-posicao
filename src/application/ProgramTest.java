package application;

import entities.Ponto;

public class ProgramTest {

	public static void main(String[] args) {
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
		Ponto k = Ponto.triangula(a, b, c, da, db, dc);
		System.out.println(k);

	}

}
