package bri;

import br.model.Ponto;

public interface ICalculadora {

    default double quad(double x) {
        return x * x;
    }

    Ponto triangula(Ponto a, Ponto b, Ponto c, double da, double db, double dc);
}
