package com.jennifer.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalificacionTest {

    @Test
    void calcularPromedio_notasAltas_retorna15() {
      
        Calificacion calificacion = new Calificacion();
        double nota1 = 15, nota2 = 14, nota3 = 16;

        double resultado = calificacion.calcularPromedio(nota1, nota2, nota3);

        assertEquals(15.0, resultado);
    }

    @Test
    void calcularPromedio_notasMedias_retorna12() {
       
        Calificacion calificacion = new Calificacion();
        double nota1 = 10, nota2 = 12, nota3 = 14;

        double resultado = calificacion.calcularPromedio(nota1, nota2, nota3);

        assertEquals(12.0, resultado);
    }

    @Test
    void calcularPromedio_notasMuyAltas_retorna18() {
       
        Calificacion calificacion = new Calificacion();
        double nota1 = 20, nota2 = 18, nota3 = 16;

        double resultado = calificacion.calcularPromedio(nota1, nota2, nota3);

        assertEquals(18.0, resultado);
    }

    @Test
    void estaAprobado_promedio15_retornaTrue() {
 
        Calificacion calificacion = new Calificacion();
        double promedio = 15;

        boolean resultado = calificacion.estaAprobado(promedio);

        assertTrue(resultado);
    }

    @Test
    void estaAprobado_promedio13LimiteExacto_retornaTrue() {
     
        Calificacion calificacion = new Calificacion();
        double promedio = 13;

        boolean resultado = calificacion.estaAprobado(promedio);

        assertTrue(resultado); 
    }


    @Test
    void estaAprobado_promedio12_retornaFalse() {
    
        Calificacion calificacion = new Calificacion();
        double promedio = 12;

        boolean resultado = calificacion.estaAprobado(promedio);

        assertFalse(resultado);
    }

 
    @Test
    void estaAprobado_promedio5_retornaFalse() {
 
        Calificacion calificacion = new Calificacion();
        double promedio = 5;

     
        boolean resultado = calificacion.estaAprobado(promedio);

     
        assertFalse(resultado);
    }


    @Test
    void calcularPromedio_notasCero_retorna0_yNoAprueba() {
     
        Calificacion calificacion = new Calificacion();
        double nota1 = 0, nota2 = 0, nota3 = 0;

        double promedio = calificacion.calcularPromedio(nota1, nota2, nota3);
        boolean aprobado = calificacion.estaAprobado(promedio);

        assertEquals(0.0, promedio);
        assertFalse(aprobado);
    }
}
