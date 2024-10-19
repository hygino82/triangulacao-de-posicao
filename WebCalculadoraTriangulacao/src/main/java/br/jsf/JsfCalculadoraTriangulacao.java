package br.jsf;

import br.model.Ponto;
import bri.ICalculadoraTriangulacao;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.*;

@Named(value = "jsfCalculadoraTriangulacao")
@RequestScoped
public class JsfCalculadoraTriangulacao {

    @EJB
    private ICalculadoraTriangulacao ejbCalculadoraTriangulacao;

    public JsfCalculadoraTriangulacao() {
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

        ponto = ejbCalculadoraTriangulacao.triangular(a, b, c, da, db, dc);
    }
}
