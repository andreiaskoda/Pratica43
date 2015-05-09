
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author askoda
 */
public class Pratica43 {
    public static void main(String[] args) {
        Elipse elipse = new Elipse(2.0, 3.0);
        Circulo circulo = new Circulo(4.0);
        Retangulo retangulo = new Retangulo(3.0, 2.0);
        Quadrado quadrado = new Quadrado(2.0);
        TrianguloEquilatero triangulo = new TrianguloEquilatero(2);
        
        double areaElipse, perimetroElipse, areaCirculo, perimetroCirculo,
                areaRetangulo, perimetroRetangulo, areaQuadrado, perimetroQuadrado,
                areaTriangulo, perimetroTriangulo;
        
        areaElipse = elipse.getArea();
        perimetroElipse = elipse.getPerimetro();
        
        areaCirculo = circulo.getArea();
        perimetroCirculo = circulo.getPerimetro();
        
        areaRetangulo = retangulo.getArea();
        perimetroRetangulo = retangulo.getPerimetro();
        
        areaQuadrado = quadrado.getArea();
        perimetroQuadrado = quadrado.getPerimetro();
        
        areaTriangulo = triangulo.getArea();
        perimetroTriangulo = triangulo.getPerimetro();
        
        // Área e perímetro da elipse
        System.out.println("Área elipse: " + areaElipse);
        System.out.println("Perímetro elipse: " + perimetroElipse);
        
        // Área e perímetro do círculo
        System.out.println("Área círculo: " + areaCirculo);
        System.out.println("Perímetro círculo: " + perimetroCirculo);
        
        // Área e perímetro do retângulo
        System.out.println("Área retângulo: " + areaRetangulo);
        System.out.println("Perímetro retângulo: " + perimetroRetangulo);
        
        // Área e perímetro do quadrado
        System.out.println("Área quadrado: " + areaQuadrado);
        System.out.println("Perímetro quadrado: " + perimetroQuadrado);
        
        // Área e perímetro do triângulo
        System.out.println("Área triângulo: " + areaTriangulo);
        System.out.println("Perímetro triângulo: " + perimetroTriangulo);
        
    }
}
