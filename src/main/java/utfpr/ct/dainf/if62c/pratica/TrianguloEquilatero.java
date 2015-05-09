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
public class TrianguloEquilatero extends Retangulo implements FiguraComLados {
    
    public TrianguloEquilatero(double lado) {
        super(lado, lado * Math.sqrt(3)/2);
    }

    public double getLado() {
        return super.getLadoMaior();
    }
    
    @Override
    public double getArea() {
        return super.getArea() / 2;
    }
    
    @Override
    public double getPerimetro() {
        return super.getLadoMaior() * 3;
    }
    
    
}
