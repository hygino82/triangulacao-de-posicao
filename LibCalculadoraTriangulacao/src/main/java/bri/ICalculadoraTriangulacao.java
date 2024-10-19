package bri;

import br.model.Ponto;
import javax.ejb.Remote;

@Remote
public interface ICalculadoraTriangulacao {

    Ponto triangular(Ponto a, Ponto b, Ponto c, double da, double db, double dc);

    default double quad(double x) {
        return x * x;
    }
}
