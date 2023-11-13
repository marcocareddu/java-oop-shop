package org.lessons.java.shop;

public class Main {
public static void main(String[] args) {
	Prodotto Bicchiere = new Prodotto("Bicchiere", 30, 22);
	
//	TEST SETTERS
	Bicchiere.setDescription("Bicchiere in vetro colorato.");
	Bicchiere.setName("Bicchiere Rosa");
	Bicchiere.setNetPrice(20f);
	Bicchiere.setIva(22);
	
//	TEST GETTERS
	System.out.println(Bicchiere.getName());
	System.out.println(Bicchiere.getId());
	System.out.println(Bicchiere.getLongId());
	System.out.println(Bicchiere.getDescription());
	System.out.println(Bicchiere.getNetPrice());
	System.out.println(Bicchiere.getGrossPrice());
	System.out.println(Bicchiere.toString());
}
}
