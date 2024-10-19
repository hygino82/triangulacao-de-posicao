/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package br.ejb;

import br.model.Ponto;
import javax.ejb.Local;

/**
 *
 * @author hygino
 */
@Local
public interface EjbCalcularTriangulacaoLocal {

    Ponto triangular(Ponto a, Ponto b, Ponto c, double da, double db, double dc);

    default double quad(double x) {
        return x * x;
    }
}
