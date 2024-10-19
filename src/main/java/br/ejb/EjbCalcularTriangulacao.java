package br.ejb;

import br.model.Ponto;
import javax.ejb.Stateless;

@Stateless
public class EjbCalcularTriangulacao implements EjbCalcularTriangulacaoLocal {

    @Override
    public Ponto triangular(Ponto a, Ponto b, Ponto c, double da, double db, double dc) {
        double m[][] = {
            {2 * (-a.getX() + b.getX()), 2 * (-a.getY() + b.getY()),
                quad(da) - quad(db) - quad(a.getX()) + quad(b.getX()) - quad(a.getY()) + quad(b.getY())},
            {2 * (-a.getX() + c.getX()), 2 * (-a.getY() + c.getY()),
                quad(da) - quad(dc) - quad(a.getX()) + quad(c.getX()) - quad(a.getY()) + quad(c.getY())}

        };
        double pivo = m[1][0] / m[0][0];

        for (int j = 0; j < 3; j++) {
            m[1][j] -= pivo * m[0][j];
        }
        double y = m[1][2] / m[1][1];
        double x = (m[0][2] - y * m[0][1]) / m[0][0];
        return new Ponto(x, y);
    }
}
