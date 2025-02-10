package TestString;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import tarea3feb.MyString;



public class MyStringTest {

	@Test
	@DisplayName("Test cadena vacía")
	void testContarPalabras() {
		assertEquals(0, MyString.contarPalabras(""));
	}
	
	@Test
	@DisplayName("Test 5 palabras")
	void testContarPalabras2() {
		assertEquals(5, MyString.contarPalabras("Me llamo Jose Manuel Saavedra"));
	}
	
	
	@Test
	@DisplayName("Test 1 letra diferente")
	void contarLetrasDiferentes() {
		assertEquals(1, MyString.contarLetrasDiferentes("mmmm"));
	}
	
	@Test
	@DisplayName("Test 2 letras diferentes")
	void contarLetrasDiferentes2() {
		assertEquals(2, MyString.contarLetrasDiferentes("bbbbyyyyy"));
	}
	
	
	@Test
	@DisplayName("Test frecuencia 3 palabras 2 iguales ")
	void contarFrecueniasPalabras() {
		Map<String, Integer> frecuenciaPalabras = new HashMap<>();
		frecuenciaPalabras.put("mundo", 1);
		frecuenciaPalabras.put("hola", 2);
		assertEquals(frecuenciaPalabras, MyString.contarFrecuenciaPalabras("Hola Mundo Hola"));
	}
	
	@Test
	@DisplayName("Test freecuencia 1 palabra")
	void contarFrecueniasPalabras2() {
		Map<String, Integer> frecuenciaPalabras = new HashMap<>();
		frecuenciaPalabras.put("hola", 1);
		assertEquals(frecuenciaPalabras, MyString.contarFrecuenciaPalabras("Hola"));
	}
	
	@Test
	@DisplayName("Test freecuencia 2 palabras 2 iguales ")
	void contarFrecueniasPalabras3() {
		Map<String, Integer> frecuenciaPalabras = new HashMap<>();
		frecuenciaPalabras.put("hola", 2);
		assertEquals(frecuenciaPalabras, MyString.contarFrecuenciaPalabras("Hola Hola"));
	}
	
	@Test
	@DisplayName("Test freecuencia letras 2 iguales ")
	void contarFrecueniasLetras() {
		Map<Character, Integer> frecuenciaPalabras2 = new HashMap<>();
		frecuenciaPalabras2.put('h', 1);
		frecuenciaPalabras2.put('o', 1);
		frecuenciaPalabras2.put('l', 1);
		frecuenciaPalabras2.put('a', 2);
		

		assertEquals(frecuenciaPalabras2, MyString.contarFrecuenciaLetras("holaa"));
	}
	
	
	@Test
	@DisplayName("Test freecuencia 2 palabras 0 iguales ")
	void contarFrecueniasLetras2() {
		Map<Character, Integer> frecuenciaPalabras2 = new HashMap<>();
		frecuenciaPalabras2.put('h', 1);
		frecuenciaPalabras2.put('o', 1);
		frecuenciaPalabras2.put('l', 1);
		frecuenciaPalabras2.put('a', 2);
		

		assertNotEquals(frecuenciaPalabras2, MyString.contarFrecuenciaLetras("hola"));
	}
	
	
	@Test
	@DisplayName("Palindromo con espacios.")
	void esPalindroma() {
		assertTrue(MyString.esPalindroma("ojo rojo"));
	}
	
	@Test
	@DisplayName("Palindromo sin espacios.")
	void esPalindroma2() {
		assertEquals(MyString.esPalindroma("reconocer"), true);
	}
	
	@Test
	@DisplayName("Palindromo frase.")
	void esPalindroma3() {
		assertNotEquals(MyString.esPalindroma(""), true);
	}
	
	@Test
	@DisplayName("Palindromo con espacios principio final.")
	void esPalindroma4() {
		assertEquals(MyString.esPalindroma("     ojo rojo  "), true);
	}
	

}