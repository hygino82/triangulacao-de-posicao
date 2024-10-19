package br.jsf;

import bri.ICalculadoraTriangulacao;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "jsfCalculadoraTriangulacao")
@RequestScoped
public class JsfCalculadoraTriangulacao {

    @EJB
    private ICalculadoraTriangulacao ejbCalculadoraTriangulacao;


    public JsfCalculadoraTriangulacao() {
    }
    
}
