package com.jennifer.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DescuentoTest {

    @Test
    void calcularPrecioFinal_precio100_descuento10_retorna90() {
        // Arrange
        Descuento descuento = new Descuento();
        double precio = 100;
        double porcentaje = 10;

     
        double resultado = descuento.calcularPrecioFinal(precio, porcentaje);

        // Assert
        assertEquals(90.0, resultado);
    }

   
    @Test
    void calcularPrecioFinal_precio200_descuento20_retorna160() {
      
        Descuento descuento = new Descuento();
        double precio = 200;
        double porcentaje = 20;
    
        double resultado = descuento.calcularPrecioFinal(precio, porcentaje);

        assertEquals(160.0, resultado);
    }

    @Test
    void calcularPrecioFinal_precio50_descuento0_retorna50() {
      
        Descuento descuento = new Descuento();
        double precio = 50;
        double porcentaje = 0;

     
        double resultado = descuento.calcularPrecioFinal(precio, porcentaje);

     
        assertEquals(50.0, resultado);
    }

    @Test
    void calcularPrecioFinal_precio500_descuento50_retorna250() {
        
        Descuento descuento = new Descuento();
        double precio = 500;
        double porcentaje = 50;

        double resultado = descuento.calcularPrecioFinal(precio, porcentaje);

        assertEquals(250.0, resultado);
    }


    @Test
    void calcularPrecioFinal_precio300_descuento100_retorna0() {
      
        Descuento descuento = new Descuento();
        double precio = 300;
        double porcentaje = 100;

        double resultado = descuento.calcularPrecioFinal(precio, porcentaje);

        assertEquals(0.0, resultado);
    }
}
