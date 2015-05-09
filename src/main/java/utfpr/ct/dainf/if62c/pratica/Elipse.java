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
public class Elipse implements FiguraComEixos {
    private double eixo1;
    private double eixo2;
    
    public Elipse(double eixo1, double eixo2) {
        this.eixo1 = eixo1*2;
        this.eixo2 = eixo2*2;
    }
    
    @Override
    public double getEixoMaior() {
        return eixo1;
    }

    @Override
    public double getEixoMenor() {
        return eixo2;
    }

    @Override
    public double getPerimetro() {
        double perimetro;
        perimetro = Math.PI*(3*((eixo2/2)+(eixo1/2)) - Math.sqrt(
                (3*(eixo2/2)+(eixo1/2)) + ((eixo2/2)+3*(eixo1/2))));
        
        return perimetro;
    }

    @Override
    public double getArea() {
        double area;
        area = Math.PI*(eixo2/2)*(eixo1/2);
        
        return area;
    }

    
}
