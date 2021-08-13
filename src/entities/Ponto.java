package entities;

public class Ponto {

	private double x;
	private double y;

	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Ponto() {

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	private static double quad(double x) {
		return x * x;
	}

	public static double distancia(Ponto a, Ponto b) {
		return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
	}

	public static Ponto triangula(Ponto a, Ponto b, Ponto c, double da, double db, double dc) {
		double m[][] = {
				{ 2 * (-a.x + b.x), 2 * (-a.y + b.y),
						quad(da) - quad(db) - quad(a.x) + quad(b.x) - quad(a.y) + quad(b.y) },

				{ 2 * (-a.x + c.x), 2 * (-a.y + c.y),
						quad(da) - quad(dc) - quad(a.x) + quad(c.x) - quad(a.y) + quad(c.y) }

		};
		double pivo = m[1][0] / m[0][0];

		for (int j = 0; j < 3; j++) {
			m[1][j] -= pivo * m[0][j];
		}
		double y = m[1][2] / m[1][1];
		double x = (m[0][2] - y * m[0][1]) / m[0][0];
		return new Ponto(x, y);
	}

	@Override
	public String toString() {
		return "(" + String.format("%.2f", x) + "; " + String.format("%.2f", y) + ")";
	}

}
