package com.jennifer.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Producto
 * Método: calcularTotal() → precio * cantidad
 * Patrón: Arrange, Act, Assert (AAA)
 * Autora: Jennifer Cubillas Cayahuallpa
 */
public class ProductoTest {

    /**
     * Caso 1 (Exitoso): precio=50, cantidad=3 → esperado 150.0
     * Escenario A: prueba exitosa, el método calcula correctamente 50 * 3 = 150
     */
    @Test
    void calcularTotal_precio50_cantidad3_retorna150() {
        // Arrange
        Producto producto = new Producto("Laptop", 50, 3);

        // Act
        double resultado = producto.calcularTotal();

        // Assert
        assertEquals(150.0, resultado);
    }

    /**
     * Caso 2: precio=100, cantidad=5 → esperado 500.0
     */
    @Test
    void calcularTotal_precio100_cantidad5_retorna500() {
        // Arrange
        Producto producto = new Producto("Monitor", 100, 5);

        // Act
        double resultado = producto.calcularTotal();

        // Assert
        assertEquals(500.0, resultado);
    }

    /**
     * Caso 3: precio=200, cantidad=1 → esperado 200.0
     * Cantidad mínima válida.
     */
    @Test
    void calcularTotal_precio200_cantidad1_retorna200() {
        // Arrange
        Producto producto = new Producto("Teclado", 200, 1);

        // Act
        double resultado = producto.calcularTotal();

        // Assert
        assertEquals(200.0, resultado);
    }

    /**
     * Caso 4: precio=0, cantidad=10 → esperado 0.0
     * Producto sin costo, el total debe ser 0.
     */
    @Test
    void calcularTotal_precio0_cantidad10_retorna0() {
        // Arrange
        Producto producto = new Producto("Muestra gratis", 0, 10);

        // Act
        double resultado = producto.calcularTotal();

        // Assert
        assertEquals(0.0, resultado);
    }

    /**
     * Caso 5 (Defecto intencional detectado):
     * precio=50, cantidad=3 → NO debe ser 53 (50 + 3, error de suma en vez de multiplicación)
     * Verifica que el método usa multiplicación y no suma.
     */
    @Test
    void calcularTotal_precio50_cantidad3_noRetorna53() {
        // Arrange
        Producto producto = new Producto("Laptop", 50, 3);

        // Act
        double resultado = producto.calcularTotal();

        // Assert
        assertNotEquals(53.0, resultado); // 50 + 3 = 53 sería el defecto
    }
}
