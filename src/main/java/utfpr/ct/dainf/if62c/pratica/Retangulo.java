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
public class Retangulo implements FiguraComLados {
    private double lado1;
    private double lado2;
    
    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    @Override
    public double getLadoMaior() {
        return lado1;
    }

    @Override
    public double getLadoMenor() {
        return lado2;
    }
    
    public double getArea() {
        return this.lado1*this.lado2;
    }
    
    public double getPerimetro() {
        return this.lado1*2 + this.lado2*2;
    }
    
}
