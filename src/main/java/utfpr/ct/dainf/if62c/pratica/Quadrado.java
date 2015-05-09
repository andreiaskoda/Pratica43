/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author askoda
 */
public class Quadrado extends Retangulo implements FiguraComLados {
    
    public Quadrado(double lado) {
        super(lado, lado);
    }

    public double getLado() {
        return super.getLadoMaior();
    }
    
    @Override
    public double getArea() {
        return super.getArea();
    }
    
    @Override
    public double getPerimetro() {
        return super.getPerimetro();
    }
    
}
