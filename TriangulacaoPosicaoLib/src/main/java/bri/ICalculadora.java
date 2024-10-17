package bri;

import br.model.Ponto;
import javax.ejb.Remote;

@Remote
public interface ICalculadora {

    Ponto triangula(Ponto a, Ponto b, Ponto c, double da, double db, double dc);
}
