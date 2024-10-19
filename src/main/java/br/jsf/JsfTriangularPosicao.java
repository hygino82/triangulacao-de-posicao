package br.jsf;

import br.ejb.EjbCalcularTriangulacaoLocal;
import br.model.Ponto;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.*;

@Named(value = "jsfTriangularPosicao")
@RequestScoped
public class JsfTriangularPosicao {

    @EJB
    private EjbCalcularTriangulacaoLocal ejbCalcularTriangulacao;

    public JsfTriangularPosicao() {
    }

    @Getter
    @Setter
    private double xa = -6;

    @Getter
    @Setter
    private double ya = 2;

    @Getter
    @Setter
    private double da = 5;

    @Getter
    @Setter
    private double xb = 3;

    @Getter
    @Setter
    private double yb = 2;

    @Getter
    @Setter
    private double db = 4;

    @Getter
    @Setter
    private double xc = -1;

    @Getter
    @Setter
    private double yc = -4;

    @Getter
    @Setter
    private double dc = 6;

    @Getter
    private Ponto ponto;

    public void calcularPonto() {
        Ponto a = new Ponto(xa, ya);
        Ponto b = new Ponto(xb, yb);
        Ponto c = new Ponto(xc, yc);

        ponto = ejbCalcularTriangulacao.triangular(a, b, c, da, db, dc);
    }

}
