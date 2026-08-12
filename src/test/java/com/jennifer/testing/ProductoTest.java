package com.jennifer.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    @Test
    void calcularTotal_precio50_cantidad3_retorna150() {
       
        Producto producto = new Producto("Laptop", 50, 3);
        double resultado = producto.calcularTotal();
        assertEquals(150.0, resultado);
    }

    @Test
    void calcularTotal_precio100_cantidad5_retorna500() {
        
        Producto producto = new Producto("Monitor", 100, 5);

        double resultado = producto.calcularTotal();

        assertEquals(500.0, resultado);
    }

    @Test
    void calcularTotal_precio200_cantidad1_retorna200() {
      
        Producto producto = new Producto("Teclado", 200, 1);
        double resultado = producto.calcularTotal();
        assertEquals(200.0, resultado);
    }

    @Test
    void calcularTotal_precio0_cantidad10_retorna0() {
        Producto producto = new Producto("Muestra gratis", 0, 10);
        double resultado = producto.calcularTotal();
        assertEquals(0.0, resultado);
    }

    @Test
    void calcularTotal_precio50_cantidad3_noRetorna53() {
        Producto producto = new Producto("Laptop", 50, 3);
        double resultado = producto.calcularTotal();
        assertNotEquals(53.0, resultado);
    }
}
